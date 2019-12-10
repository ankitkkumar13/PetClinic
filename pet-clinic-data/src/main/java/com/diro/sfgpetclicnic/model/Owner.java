package com.diro.sfgpetclicnic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "owners")
public class Owner extends Person {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> petSet = new HashSet<>();
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;

    @Builder
    public Owner(Long id, String firstName, String lastName, Set<Pet> petSet, String address, String city, String telephone) {
        super(id, firstName, lastName);
        this.petSet = petSet;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }
}

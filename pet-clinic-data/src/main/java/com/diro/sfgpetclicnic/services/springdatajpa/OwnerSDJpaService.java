package com.diro.sfgpetclicnic.services.springdatajpa;

import com.diro.sfgpetclicnic.model.Owner;
import com.diro.sfgpetclicnic.repositories.OwnerRepositry;
import com.diro.sfgpetclicnic.repositories.PetRepository;
import com.diro.sfgpetclicnic.repositories.PetTypeRepository;
import com.diro.sfgpetclicnic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
@Profile("jpa")
public class OwnerSDJpaService implements OwnerService {
    private final OwnerRepositry ownerRepositry;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepositry ownerRepositry, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepositry = ownerRepositry;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepositry.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerRepositry.findAll().forEach(s -> {
            ownerSet.add(s);
        });
        return ownerSet;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepositry.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepositry.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepositry.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepositry.deleteById(aLong);
    }
}

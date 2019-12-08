package com.diro.sfgpetclicnic.repositories;

import com.diro.sfgpetclicnic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

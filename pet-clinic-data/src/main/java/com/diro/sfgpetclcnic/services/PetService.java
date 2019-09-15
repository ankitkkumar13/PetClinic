package com.diro.sfgpetclcnic.services;

import java.util.Set;

import com.diro.sfgpetclcnic.model.Owner;
import com.diro.sfgpetclcnic.model.Pet;

public interface PetService {
	Pet findById(Long id);

	Pet findByLastName(String lastName);

	Pet save(Pet owner);

	Set<Pet> findAll();
}

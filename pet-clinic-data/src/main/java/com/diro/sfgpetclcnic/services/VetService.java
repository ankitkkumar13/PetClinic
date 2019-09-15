package com.diro.sfgpetclcnic.services;

import java.util.Set;

import com.diro.sfgpetclcnic.model.Owner;
import com.diro.sfgpetclcnic.model.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet findByLastName(String lastName);

	Vet save(Vet owner);

	Set<Vet> findAll();
}

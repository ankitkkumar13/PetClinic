package com.diro.sfgpetclcnic.services;

import java.util.Set;

import com.diro.sfgpetclcnic.model.Owner;

public interface OwnerService {
	Owner findById(Long id);

	Owner findByLastName(String lastName);

	Owner save(Owner owner);

	Set<Owner> findAll();
}

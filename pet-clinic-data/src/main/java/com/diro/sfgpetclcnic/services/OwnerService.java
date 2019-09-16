package com.diro.sfgpetclcnic.services;

import com.diro.sfgpetclcnic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}

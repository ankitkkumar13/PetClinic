package com.diro.sfgpetclicnic.services;

import com.diro.sfgpetclicnic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}

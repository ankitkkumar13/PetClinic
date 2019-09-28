package com.diro.sfgpetclicnic.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.diro.sfgpetclicnic.model.Owner;
import com.diro.sfgpetclicnic.services.OwnerService;

@Service
public class OwnereServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findByID(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save( object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
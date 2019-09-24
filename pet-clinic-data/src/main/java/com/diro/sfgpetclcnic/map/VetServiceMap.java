package com.diro.sfgpetclcnic.map;

import java.util.Set;

import com.diro.sfgpetclcnic.model.Owner;
import com.diro.sfgpetclcnic.model.Vet;
import com.diro.sfgpetclcnic.services.CrudService;
import com.diro.sfgpetclcnic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findByID(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

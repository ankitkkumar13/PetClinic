package com.diro.sfgpetclicnic.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.diro.sfgpetclicnic.model.Owner;
import com.diro.sfgpetclicnic.model.Vet;
import com.diro.sfgpetclicnic.services.CrudService;
import com.diro.sfgpetclicnic.services.VetService;
@Service
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
		return super.save( object);
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

package com.diro.sfgpetclicnic.services.map;

import java.util.Set;

import com.diro.sfgpetclicnic.model.Speciality;
import com.diro.sfgpetclicnic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.diro.sfgpetclicnic.model.Vet;
import com.diro.sfgpetclicnic.services.VetService;
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
	private SpecialtiesService specialtiesService;

    public VetMapService(SpecialtiesService specialtiesService) {
		this.specialtiesService = specialtiesService;
	}

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
		if (object != null) {
			if (object.getSpecialitySet() != null) {
				object.getSpecialitySet().forEach(s -> {
					if (s.getId() == null) {
						Speciality saveSpeciality = specialtiesService.save(s);
						saveSpeciality.setId(saveSpeciality.getId());
					}
				});
			}
			return super.save(object);
		} else return null;

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

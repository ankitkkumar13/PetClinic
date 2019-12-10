package com.diro.sfgpetclicnic.services.map;

import java.util.Set;

import com.diro.sfgpetclicnic.model.Pet;
import com.diro.sfgpetclicnic.services.PetService;
import com.diro.sfgpetclicnic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.diro.sfgpetclicnic.model.Owner;
import com.diro.sfgpetclicnic.services.OwnerService;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
	private PetTypeService petTypeService;
	private PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

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
		if (object != null) {
			if (object.getPetSet() != null) {
				object.getPetSet().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() != null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
						if (pet.getId() == null) {
							Pet savePet = petService.save(pet);
							pet.setId(savePet.getId());
						}
					} else {
						throw new RuntimeException("Pets is required");
					}
				});
			}
			return super.save(object);
		} else {
			return null;
		}

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

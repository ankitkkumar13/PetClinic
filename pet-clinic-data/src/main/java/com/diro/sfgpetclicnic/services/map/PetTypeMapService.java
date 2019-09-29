package com.diro.sfgpetclicnic.services.map;

import com.diro.sfgpetclicnic.model.Pet;
import com.diro.sfgpetclicnic.model.PetType;
import com.diro.sfgpetclicnic.services.PetService;
import com.diro.sfgpetclicnic.services.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}

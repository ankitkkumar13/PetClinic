package com.diro.sfgpetclicnic.services.springdatajpa;

import com.diro.sfgpetclicnic.model.Speciality;
import com.diro.sfgpetclicnic.repositories.SpecialtyRepository;
import com.diro.sfgpetclicnic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class SpecialitySDJpaService implements SpecialtiesService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialitySet = new HashSet<>();
        specialtyRepository.findAll().forEach(specialitySet::add);
        return specialitySet;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}

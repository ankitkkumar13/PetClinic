package com.diro.sfgpetclicnic.services.springdatajpa;

import com.diro.sfgpetclicnic.model.Vet;
import com.diro.sfgpetclicnic.repositories.VetRepository;
import com.diro.sfgpetclicnic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("jpa")
public class VetSDJpaService implements VetService {
        private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vetSet=new HashSet<>();
        vetRepository.findAll().forEach(vetSet::add);
        return vetSet;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    vetRepository.deleteById(aLong);
    }
}

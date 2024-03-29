package com.mhacioglu.sfgpetclinic.services;

import com.mhacioglu.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}

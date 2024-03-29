package com.mhacioglu.sfgpetclinic.services;

import com.mhacioglu.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}

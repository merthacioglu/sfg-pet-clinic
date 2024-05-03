package com.mhacioglu.sfgpetclinic.repositories;

import com.mhacioglu.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

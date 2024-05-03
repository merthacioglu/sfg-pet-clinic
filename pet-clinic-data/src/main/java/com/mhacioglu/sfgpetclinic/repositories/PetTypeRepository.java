package com.mhacioglu.sfgpetclinic.repositories;

import com.mhacioglu.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

package com.mhacioglu.sfgpetclinic.repositories;

import com.mhacioglu.sfgpetclinic.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}

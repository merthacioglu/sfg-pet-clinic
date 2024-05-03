package com.mhacioglu.sfgpetclinic.repositories;

import com.mhacioglu.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

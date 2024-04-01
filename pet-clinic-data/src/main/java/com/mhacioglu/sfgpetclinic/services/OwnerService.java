package com.mhacioglu.sfgpetclinic.services;

import com.mhacioglu.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

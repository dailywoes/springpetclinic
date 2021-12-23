package com.johnrteixeira.springpetclinic.services;

import com.johnrteixeira.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}

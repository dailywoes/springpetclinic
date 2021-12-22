package com.johnrteixeira.springpetclinic.services;

import com.johnrteixeira.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}

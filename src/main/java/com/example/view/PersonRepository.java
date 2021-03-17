package com.example.view;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Persona;

@Repository
public interface PersonRepository extends CrudRepository<Persona, Long> {

}

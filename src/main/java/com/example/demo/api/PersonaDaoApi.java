package com.example.demo.api;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Persona;

public interface PersonaDaoApi extends CrudRepository<Persona, Long> {

	
	
}

package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.api.PersonaDaoApi;
import com.example.demo.commons.GenericServiceApiImpl;
import com.example.demo.model.Persona;
import com.example.demo.service.PersonaServiceApi;
@Service
public class PersonaServiceIMP extends GenericServiceApiImpl<Persona, Long> implements PersonaServiceApi {

	@Autowired
	private PersonaDaoApi personaDaoApi ;
	
	
	
	//este metodo que viene de la extension de la clase abstracta me hace sobreescribir un metodo abstracto
	//ese metodo abrstracto me devuelve una instancia de la interfaz
	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		
		return personaDaoApi;
	}
	

}

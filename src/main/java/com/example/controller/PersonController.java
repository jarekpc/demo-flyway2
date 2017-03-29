package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PersonDto;
import com.example.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public List<PersonDto> findAllPerson() {
		return personService.findAllPerson();
	}
	
	@PostMapping("/dodaj")
	public PersonDto addPerson(@RequestBody PersonDto personDto){
		return personService.addPerson(personDto);
	}
	@DeleteMapping("/usun/{id}")
	public void deletePerson(@PathVariable Integer id){
		
	}
}

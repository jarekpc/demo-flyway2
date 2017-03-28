package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.example.domain.Person;
import com.example.com.example.repositories.PersonRepository;
import com.example.dto.PersonDto;

import ma.glasnost.orika.MapperFacade;

@Service
//@RequiredArgsConstructor
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private MapperFacade orikaMapperFacade;
	
	//get Dto bledna metoda
	public PersonDto findAllPerson(){		
		//return departmentsRepository.findAllByDeletedFalse().stream().map(mapper::map).collect(Collectors.toList());
		List<Person> listsPerson = new ArrayList<Person>(); 
		for(Person p :personRepository.findAll()){
			listsPerson.add(p);
		}		
		PersonDto personDto = orikaMapperFacade.map(listsPerson.get(1), PersonDto.class);
		return personDto;		
	}
	
	public PersonDto addPerson(PersonDto personDto){
		Person p = orikaMapperFacade.map(personDto, Person.class);
		personRepository.save(p);
		return orikaMapperFacade.map(p, PersonDto.class);
	}
	
}

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
	
	//get
	public List<PersonDto> findAllPerson(){						
		List<PersonDto> listsPersonDto = new ArrayList<PersonDto>();		
		orikaMapperFacade.mapAsCollection(personRepository.findAll(), listsPersonDto, PersonDto.class);
		return listsPersonDto;
	}
	
	public PersonDto addPerson(PersonDto personDto){
		Person p = orikaMapperFacade.map(personDto, Person.class);
		personRepository.save(p);
		return orikaMapperFacade.map(p, PersonDto.class);
	}
	
	public PersonDto getPerson(Integer id){
		return orikaMapperFacade.map(personRepository.findOne(id), PersonDto.class);
	}
	
	public void deletePerson(Integer id){
		Person person = personRepository.findOne(id);
		personRepository.delete(person);		
	}
}

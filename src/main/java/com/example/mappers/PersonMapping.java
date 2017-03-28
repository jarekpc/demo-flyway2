package com.example.mappers;

import org.springframework.stereotype.Component;

import com.example.com.example.domain.Person;
import com.example.dto.PersonDto;

import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

@Component
public class PersonMapping  implements OrikaMapperFactoryConfigurer {

	@Override
	public void configure(MapperFactory orikaMapperFactory) {
		  orikaMapperFactory.classMap(Person.class, PersonDto.class)  
          .byDefault()
          .register();
		
	}

	
}

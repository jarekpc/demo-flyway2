package com.example.com.example.repositories;

import com.example.com.example.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by zyzakj on 2017-02-27.
 */
@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findByfirstName(@Param("first_name")String first_name);
}

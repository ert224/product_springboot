package com.watchman.w4ps.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.watchman.w4ps.model.sql_tutorial.Person;
import org.springframework.data.rest.core.annotation.RepositoryRestResource; 

@RepositoryRestResource
public interface PersonRepo extends JpaRepository<Person,Long>{

    
} 
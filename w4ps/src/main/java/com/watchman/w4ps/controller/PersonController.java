package com.watchman.w4ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watchman.w4ps.model.Product;
import com.watchman.w4ps.model.sql_tutorial.Person;
import com.watchman.w4ps.repo.PersonRepo;

@RestController
public class PersonController {
    
    @Autowired
    PersonRepo repo;
    
    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public ResponseEntity<Object> createPerson(@RequestBody Person person) {
       repo.save(person);
       return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);

    }


}

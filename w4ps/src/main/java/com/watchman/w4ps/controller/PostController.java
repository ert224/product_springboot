package com.watchman.w4ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watchman.w4ps.model.PostLikes;
import com.watchman.w4ps.model.Product;
import com.watchman.w4ps.repo.PostRepo;
import com.watchman.w4ps.repo.UsersRepo;

@RestController
public class PostController {

    @Autowired
    PostRepo postRepo;
    @Autowired
    UsersRepo userRepo;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ResponseEntity<Object> getPosts() {
        // repo.findAll();
        return new ResponseEntity<>(postRepo.findAll(), HttpStatus.OK);

    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<Object> getUsers() {
        // repo.findAll();
        return new ResponseEntity<>(userRepo.findAll(), HttpStatus.OK);

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        // repo.findAll();
        return "Home";

    }

    @RequestMapping(value = "/secured", method = RequestMethod.GET)
    public String secured() {
        // repo.findAll();
        return "hello secured";

    }



}
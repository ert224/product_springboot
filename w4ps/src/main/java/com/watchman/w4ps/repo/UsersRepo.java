package com.watchman.w4ps.repo;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.rest.core.annotation.RepositoryRestResource; 
import org.springframework.data.jpa.repository.JpaRepository;

import com.watchman.w4ps.model.User;

@RepositoryRestResource
public interface UsersRepo extends JpaRepository<User,Long> {

    
} 
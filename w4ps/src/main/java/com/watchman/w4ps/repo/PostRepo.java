package com.watchman.w4ps.repo;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.watchman.w4ps.model.PostLikes;
import org.springframework.data.rest.core.annotation.RepositoryRestResource; 
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public interface PostRepo extends JpaRepository<PostLikes,Long> {
    
}

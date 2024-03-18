package com.watchman.w4ps.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.sql.Date;

@Data
@Entity
@Table(name = "posts")
public class PostLikes {
    @Id
    private long pid;
    private String title;
    private String message;
    private Date date;

}

package com.watchman.w4ps.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.Data
// @Data 
@Entity
@Table(name = "students")
public class PostLikesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String title;
    private String message;
    private Date date;
    private int LikeCount;

    public PostLikesModel(int pid, String title, String message, Date date, int LikeCount) {
        this.pid = pid;
        this.title = title;
        this.message = message;
        this.date = date;
        this.LikeCount = LikeCount;
    }


    public int getPid() {
        return this.pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLikeCount() {
        return this.LikeCount;
    }

    public void setLikeCount(int LikeCount) {
        this.LikeCount = LikeCount;
    }


}


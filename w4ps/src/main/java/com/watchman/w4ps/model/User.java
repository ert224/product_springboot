package com.watchman.w4ps.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    /**
     * The ID of this row of the database
     */
    @Id
    private String uid; // Changed type to String
    /**
     * The username stored in this row
     */
    private String username;
    /**
     * The email stored in this row
     */
    private String email;

    /**
     * The first name of the user
     */
    private String first_name;

    /**
     * The last name of the user
     */
    private String last_name;

    /**
     * The gender of the user
     */
    private String gender_identity;

    /**
     * The sexual orientation of the user
     */
    private String orientation;

    /**
     * The note for the user
     */
    private String notes;

}
package com.example.Studentscrud.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "student")
@Data
public class Student {

    @Id
    private int id;  // Change to String for MongoDB ObjectId
    private String name;
    private String email;
    private String city;


}
package com.example.Studentscrud.repository;

import com.example.Studentscrud.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>
{

}

package com.example.Studentscrud.service;

import com.example.Studentscrud.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface StudentService {
    Student addStudent(Student student);
    Student updateStudent(int id, Student student);
    void deleteStudent(int id);
    Optional<Student> getStudentById(int id);
    Page<Student> getAllStudents(Pageable pageable);
}

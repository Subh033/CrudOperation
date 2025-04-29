package com.example.Studentscrud.service;

import com.example.Studentscrud.entity.Student;
import com.example.Studentscrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImplement implements StudentService
{

    @Autowired
    private StudentRepository studentRepository;
    //create Student
    @Override
    public Student addStudent(Student std)
    {
        return studentRepository.save(std);
    }

    public Student updateStudent(int id, Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setCity(updatedStudent.getCity());
            System.out.println("Updating student: " + existingStudent);
            return studentRepository.save(existingStudent);
        } else {
            System.out.println("No student found with id: " + id);
            return null;
        }
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Page<Student> getAllStudents(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

}

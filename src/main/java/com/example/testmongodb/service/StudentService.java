package com.example.testmongodb.service;

import com.example.testmongodb.model.StudentDetail;
import com.example.testmongodb.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDetail> findAllStudent() {
        return studentRepository.findAll();
    }
}

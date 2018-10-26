package com.example.testmongodb.resource;

import com.example.testmongodb.model.StudentDetail;
import com.example.testmongodb.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentResource {

    private StudentService studentService;

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<StudentDetail> findAllStudent() {
        return studentService.findAllStudent();
    }
}

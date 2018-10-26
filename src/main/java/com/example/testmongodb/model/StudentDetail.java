package com.example.testmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetail {
    @Id
    private int id;
    private String studentName;
    private String studentLastName;
    private String studentEmail;
}

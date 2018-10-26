package com.example.testmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "student_detail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetail {
    @Id
    private Object id;
    private String studentName;
    private String studentLastName;
    private String studentEmail;
}

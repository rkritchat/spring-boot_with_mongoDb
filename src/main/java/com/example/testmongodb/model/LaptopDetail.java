package com.example.testmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDetail {

    @Id
    private int id;
    private String laptopName;
    private double price;

}

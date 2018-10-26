package com.example.testmongodb.repository;

import com.example.testmongodb.model.StudentDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentDetail, Long> {

}

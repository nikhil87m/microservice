package com.ibm.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.poc.req.LearningReqObj;

@Repository
public interface YourLearningRepository extends MongoRepository<LearningReqObj, String>{

}

package com.bezkoder.spring.data.mongodb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.data.mongodb.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  
  Optional<Tutorial> findById(int id);//******** */
  List<Tutorial> findByTitleContaining(String title);
  
}

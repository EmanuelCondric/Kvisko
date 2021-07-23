package com.backend.appbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.appbackend.model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
	
	@Query("select q from Questions q order by q.id asc")
	List<Questions> getAllQuestions();
}

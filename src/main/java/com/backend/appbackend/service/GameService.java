package com.backend.appbackend.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.appbackend.model.Questions;
import com.backend.appbackend.repository.QuestionsRepository;

@Service

public class GameService {
	
	@Autowired
	private QuestionsRepository questionsRepository;
	
	//@Transactional(readOnly = true, transactionManager = "securityTransactionManager")
	public List<Questions> getQuestions() throws SQLException {
		List<Questions> questionList = questionsRepository.getAllQuestions();
		return questionList;
	}
}
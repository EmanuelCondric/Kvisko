package com.backend.appbackend.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.appbackend.model.Questions;
import com.backend.appbackend.service.GameService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("game")

public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping("/questions")
	public ResponseEntity<List<Questions>> getQuestions() throws SQLException {
		List<Questions> questionList = gameService.getQuestions();
		
		return ResponseEntity.ok(questionList);
	}
}

package com.quizonline.group8.service;

import com.quizonline.group8.model.Quiz;
import com.quizonline.group8.model.Subject;
import com.quizonline.group8.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizServiceImlp implements QuizService{
    @Autowired
    private QuizRepository QuizRepo;
    @Override
    public List<Quiz> findlistAll() {
        List<Quiz> Quizs = QuizRepo.findAll();

        return Quizs;
    }
}

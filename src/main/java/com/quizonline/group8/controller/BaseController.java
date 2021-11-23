package com.quizonline.group8.controller;

import com.quizonline.group8.model.Quiz;
import com.quizonline.group8.model.QuizCategory;
import com.quizonline.group8.model.Subject;
import com.quizonline.group8.repository.ViewCategoryRepo;
import com.quizonline.group8.service.QuizService;
import com.quizonline.group8.service.Subservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class  BaseController {
    @Autowired
    private Subservice subservice;
    @Autowired
    private ViewCategoryRepo categoryRepo;
    @Autowired
    private QuizService quizService;

    @GetMapping("/subAll")
    public ResponseEntity<List<Subject>> findCities() {
        List<Subject> subjects = subservice.findAll();
        return ResponseEntity.ok().body(subjects);
    }
    @GetMapping("/subAll/{subjectId}")
    public ResponseEntity<Optional<Subject>> findCity(@PathVariable Long subjectId) {

        Optional<Subject> subject = subservice.findById(subjectId);
        return ResponseEntity.ok().body(subject);
    }
    @GetMapping("/Category/{subjectId}")
    public ResponseEntity< List<QuizCategory>> GetCategory(@PathVariable Long subjectId) {

        List<QuizCategory> category = categoryRepo.findBySubject_id(subjectId);
        return ResponseEntity.ok().body(category);
    }
    @GetMapping("/listquiz")
    public ResponseEntity<List<Quiz>> GetHistory() {
        List<Quiz> quizs = quizService.findlistAll();
        return ResponseEntity.ok().body(quizs);
    }

}

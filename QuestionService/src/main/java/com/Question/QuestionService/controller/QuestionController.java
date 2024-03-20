package com.Question.QuestionService.controller;


import com.Question.QuestionService.entities.Question;
import com.Question.QuestionService.impl.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @PostMapping()
    public Question create(@RequestBody Question question){
       return questionService.create(question);
    }

    @GetMapping()
    public List<Question> show(){
        return questionService.show();
    }

    @GetMapping("/{id}")
    public Question showById(@PathVariable Long id){
        return questionService.showById(id);
    }

    @GetMapping("/quiz/{quizid}")
    public List<Question> showByQuizId(@PathVariable Long quizid){
        return questionService.questionFindByQuizId(quizid);
    }
}

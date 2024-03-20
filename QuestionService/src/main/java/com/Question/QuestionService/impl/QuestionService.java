package com.Question.QuestionService.impl;

import com.Question.QuestionService.entities.Question;
import com.Question.QuestionService.repositiories.QuestionRepo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionService implements com.Question.QuestionService.service.QuestionService {


    private  QuestionRepo questionRepo;

    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Question create(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public List<Question> show() {
        return questionRepo.findAll();
    }

    @Override
    public Question showById(Long id) {
        return questionRepo.findById(id).orElseThrow(()-> new RuntimeException( "Not Available"));
    }

    @Override
    public List<Question> questionFindByQuizId(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }


}

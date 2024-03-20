package com.Question.QuestionService.service;

import com.Question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {

     Question create(Question question);
     List<Question> show();
     Question showById(Long id);

     List<Question> questionFindByQuizId(Long quizId);
}
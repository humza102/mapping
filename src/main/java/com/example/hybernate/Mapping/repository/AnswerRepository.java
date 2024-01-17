package com.example.hybernate.Mapping.repository;

import com.example.hybernate.Mapping.entity.Answer;
import com.example.hybernate.Mapping.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
//Answer findByQuestion();
}

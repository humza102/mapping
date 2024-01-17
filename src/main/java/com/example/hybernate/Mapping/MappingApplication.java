package com.example.hybernate.Mapping;

import com.example.hybernate.Mapping.entity.Answer;
import com.example.hybernate.Mapping.entity.Question;
import com.example.hybernate.Mapping.entity.Student;
import com.example.hybernate.Mapping.repository.AnswerRepository;
import com.example.hybernate.Mapping.repository.QuestionRepository;
import com.example.hybernate.Mapping.repository.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ObjectUtils;

import java.util.Scanner;

@SpringBootApplication
public class MappingApplication {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	AnswerRepository answerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

	public void enterInStudent(){
//		Student	student = new Student();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter username");
//		student.setName("humza");
		Answer answer;
//		answer.se
		Question question = new Question();
		question.setQuestion("asdasdasdasd");
		questionRepository.save(question);
		System.out.println("com");
//		answerRepository.findByQuestion();
	}

}

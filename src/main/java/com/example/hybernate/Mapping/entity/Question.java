package com.example.hybernate.Mapping.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "question")
public class Question {
    @Id
    private Long questionId;

    private String question;

    @OneToOne()
    // join column annotation used to give the foreign key column a name
    @JoinColumn(name = "answerId")
    private Answer answer;



}

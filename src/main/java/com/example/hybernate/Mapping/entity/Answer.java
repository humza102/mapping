package com.example.hybernate.Mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "answer")
public class Answer {
    @Id
    private Long answerId;

    private String answer;

    // mappedBy is used when we want to make column bidirectional and does not want to show column on both table
    // only show in one table

    @OneToOne(mappedBy = "answer")
    private Question question;



}

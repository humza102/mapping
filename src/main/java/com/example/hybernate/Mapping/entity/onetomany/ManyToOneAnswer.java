package com.example.hybernate.Mapping.entity.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ManyToOneAnswer {
    @Id
    private long ansId;
    private String answer;
    @ManyToOne
    @JoinColumn(name = "questionId")
    private OneToManyQuestion oneToManyQuestion;


}

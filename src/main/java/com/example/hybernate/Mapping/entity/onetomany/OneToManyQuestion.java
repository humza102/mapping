package com.example.hybernate.Mapping.entity.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OneToManyQuestion {
    @Id
    private long quesId;

    private String question;
    @OneToMany(mappedBy = "oneToManyQuestion")
    private List<ManyToOneAnswer> manyToOneAnswer;
}

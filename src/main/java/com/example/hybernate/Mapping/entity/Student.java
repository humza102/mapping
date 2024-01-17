package com.example.hybernate.Mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private String name;

    private String className;

    @OneToOne(mappedBy = "student")
    private Laptop laptop;
}

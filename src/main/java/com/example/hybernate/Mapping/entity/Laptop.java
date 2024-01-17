package com.example.hybernate.Mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    private Long laptopId;

    private Long serialNumber;


    private String company;

    @OneToOne
    @JoinColumn(name = "studentId")
    private Student student;
}

package com.example.hybernate.Mapping.repository;

import com.example.hybernate.Mapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student,Long> {

}

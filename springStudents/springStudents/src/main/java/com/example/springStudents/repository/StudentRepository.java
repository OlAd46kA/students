package com.example.springStudents.repository;

import com.example.springStudents.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail (String email);

    Student findByEmail (String email);
}
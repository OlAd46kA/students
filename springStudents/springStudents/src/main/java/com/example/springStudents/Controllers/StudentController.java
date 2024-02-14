package com.example.springStudents.Controllers;

import com.example.springStudents.Models.Student;
import com.example.springStudents.Services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent(){
        // todo
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public Student saveStudent (@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail (@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent (Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent (@PathVariable String email){
        service.deleteStudent(email);
    }
}
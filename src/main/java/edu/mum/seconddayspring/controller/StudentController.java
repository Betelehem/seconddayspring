package edu.mum.seconddayspring.controller;

import edu.mum.seconddayspring.domain.Student;
import edu.mum.seconddayspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/addStudent")
    public String addStudent(@ModelAttribute("student") Student student){
        return "studentForm";
    }

    @PostMapping("/addStudent")
    public String saveStudent(@ModelAttribute("student") Student student){
        Student savedStudent = studentService.save(student);

        return "homepage";
    }

}

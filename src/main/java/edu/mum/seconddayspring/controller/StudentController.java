package edu.mum.seconddayspring.controller;

import edu.mum.seconddayspring.domain.Student;
import edu.mum.seconddayspring.service.GenderService;
import edu.mum.seconddayspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    GenderService genderService;

    @GetMapping("/addStudent")
    public String addStudent(@ModelAttribute("student") Student student, Model model){

        model.addAttribute("genders", genderService.findAll());
        return "studentForm";
    }

    @PostMapping("/addStudent")
    public String saveStudent(@ModelAttribute("student") Student student){
       Long gendId=student.getGender().getId();
       //student.setGender(studentService.findById(gendId));
        Student savedStudent = studentService.save(student);
       // return "studentResult";
        return "redirect:/studentlist";
    }

    @GetMapping("/studentlist")
    public String getAllStudents(Model model){
       // List<Student> studentList = studentService.findAll();
       // model.addAttribute("students", studentList);
        model.addAttribute("students", studentService.findAll());

        return "studentList";
    }

    @GetMapping("/update/{id}")
    public String updateStudent(@PathVariable("id") String studId, Model model){
        Student student = studentService.findById(studId);
        model.addAttribute("student", student );
        model.addAttribute("genders", genderService.findAll());
        return "studentForm";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") String studId){
        studentService.deleteById(studId);

        return "redirect:/studentlist";
    }
}

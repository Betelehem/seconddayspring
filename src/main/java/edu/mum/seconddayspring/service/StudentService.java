package edu.mum.seconddayspring.service;

import edu.mum.seconddayspring.domain.Student;

import java.util.List;

public interface StudentService {
    public Student save(Student student);
    public void deleteById(String id);
    public Student findById(String id);
    public List<Student> findAll();
}

package edu.mum.seconddayspring.service;

import edu.mum.seconddayspring.domain.Student;

public interface StudentService {
    public Student save(Student student);
    public void deleteById(String id);
    public Student findById(String id);
}

package edu.mum.seconddayspring.serviceimpl;

import edu.mum.seconddayspring.domain.Student;
import edu.mum.seconddayspring.repositery.StudentRepository;
import edu.mum.seconddayspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(String id) {
        return studentRepository.findById(id).get();
    }
}

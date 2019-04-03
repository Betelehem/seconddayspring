package edu.mum.seconddayspring.repositery;

import edu.mum.seconddayspring.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}

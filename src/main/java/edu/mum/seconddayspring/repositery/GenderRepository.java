package edu.mum.seconddayspring.repositery;

import edu.mum.seconddayspring.domain.Gender;
import org.springframework.data.repository.CrudRepository;

public interface GenderRepository extends CrudRepository<Gender,Long > {
}

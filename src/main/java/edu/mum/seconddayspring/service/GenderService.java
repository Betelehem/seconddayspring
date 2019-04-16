package edu.mum.seconddayspring.service;

import edu.mum.seconddayspring.domain.Gender;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GenderService {
    public List<Gender> findAll();

}

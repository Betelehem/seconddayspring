package edu.mum.seconddayspring.serviceimpl;

import edu.mum.seconddayspring.domain.Gender;
import edu.mum.seconddayspring.repositery.GenderRepository;
import edu.mum.seconddayspring.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenderServiceImpl implements GenderService {

    @Autowired
    GenderRepository genderRepository;
    @Override
    public List<Gender> findAll() {
        return (List<Gender>) genderRepository.findAll();
    }
}

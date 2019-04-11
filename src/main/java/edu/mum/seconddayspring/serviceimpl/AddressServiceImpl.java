package edu.mum.seconddayspring.serviceimpl;

import edu.mum.seconddayspring.domain.Address;
import edu.mum.seconddayspring.repositery.AddressRepository;
import edu.mum.seconddayspring.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> findAll() {
        return (List<Address>) addressRepository.findAll();
    }
}

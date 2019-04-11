package edu.mum.seconddayspring.repositery;

import edu.mum.seconddayspring.domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {



}

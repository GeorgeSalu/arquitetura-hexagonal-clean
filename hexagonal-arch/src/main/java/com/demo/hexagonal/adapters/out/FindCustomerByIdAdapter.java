package com.demo.hexagonal.adapters.out;

import com.demo.hexagonal.adapters.out.repository.CustomerRepository;
import com.demo.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.demo.hexagonal.application.core.domain.Customer;
import com.demo.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntit = customerRepository.findById(id);
        return customerEntit.map(entity -> customerEntityMapper.tuCustomer(entity));
    }
}

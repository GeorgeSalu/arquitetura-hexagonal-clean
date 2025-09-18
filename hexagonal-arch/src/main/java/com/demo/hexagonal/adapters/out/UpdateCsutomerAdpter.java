package com.demo.hexagonal.adapters.out;

import com.demo.hexagonal.adapters.out.repository.CustomerRepository;
import com.demo.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.demo.hexagonal.application.core.domain.Customer;
import com.demo.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateCsutomerAdpter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}

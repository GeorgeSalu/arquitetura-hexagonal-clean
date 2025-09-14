package com.demo.clean_arch.dataprovider;

import com.demo.clean_arch.core.dataprovider.UpdateCustomer;
import com.demo.clean_arch.core.domain.Customer;
import com.demo.clean_arch.dataprovider.repository.CustomerRepository;
import com.demo.clean_arch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

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

package com.demo.hexagonal.application.ports.out;

import com.demo.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}

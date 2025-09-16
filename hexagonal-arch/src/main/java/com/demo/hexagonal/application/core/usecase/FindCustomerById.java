package com.demo.hexagonal.application.core.usecase;

import com.demo.hexagonal.application.core.domain.Customer;
import com.demo.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerById {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerById(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}

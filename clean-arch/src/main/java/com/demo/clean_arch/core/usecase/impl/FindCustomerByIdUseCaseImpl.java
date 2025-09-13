package com.demo.clean_arch.core.usecase.impl;

import com.demo.clean_arch.core.dataprovider.FindCustomerById;
import com.demo.clean_arch.core.domain.Customer;
import com.demo.clean_arch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase  {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}

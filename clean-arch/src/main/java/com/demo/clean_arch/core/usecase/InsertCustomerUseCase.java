package com.demo.clean_arch.core.usecase;

import com.demo.clean_arch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer,String zipCode);

}

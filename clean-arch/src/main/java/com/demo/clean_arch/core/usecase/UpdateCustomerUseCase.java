package com.demo.clean_arch.core.usecase;

import com.demo.clean_arch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer,String zipCode);

}

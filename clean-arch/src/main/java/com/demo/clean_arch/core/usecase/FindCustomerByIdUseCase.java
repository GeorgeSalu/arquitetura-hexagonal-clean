package com.demo.clean_arch.core.usecase;

import com.demo.clean_arch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}

package com.demo.clean_arch.core.dataprovider;

import com.demo.clean_arch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);

}

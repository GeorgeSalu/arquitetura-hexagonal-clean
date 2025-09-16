package com.demo.hexagonal.adapters.out.repository.mapper;

import com.demo.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.demo.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer tuCustomer(CustomerEntity customerEntity);

}

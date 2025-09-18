package com.demo.hexagonal.adapters.in.controller.mapper;

import com.demo.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.demo.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.demo.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer tuCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}

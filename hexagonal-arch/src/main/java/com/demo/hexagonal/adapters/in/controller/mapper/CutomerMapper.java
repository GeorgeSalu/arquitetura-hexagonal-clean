package com.demo.hexagonal.adapters.in.controller.mapper;

import com.demo.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.demo.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CutomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer tuCustomer(CustomerRequest customerRequest);

}

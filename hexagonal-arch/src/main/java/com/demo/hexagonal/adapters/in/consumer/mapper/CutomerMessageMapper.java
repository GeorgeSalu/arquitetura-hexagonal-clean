package com.demo.hexagonal.adapters.in.consumer.mapper;

import com.demo.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.demo.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CutomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}

package com.demo.clean_arch.entrypoint.consumer.mapper;

import com.demo.clean_arch.core.domain.Customer;
import com.demo.clean_arch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessagemMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}

package com.demo.clean_arch.dataprovider.repository.mapper;

import com.demo.clean_arch.core.domain.Customer;
import com.demo.clean_arch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}

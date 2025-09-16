package com.demo.hexagonal.adapters.out.client.mapper;

import com.demo.hexagonal.adapters.out.client.response.AddressResponse;
import com.demo.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}

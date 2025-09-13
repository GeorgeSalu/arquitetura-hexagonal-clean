package com.demo.clean_arch.dataprovider.client.mapper;

import com.demo.clean_arch.core.domain.Address;
import com.demo.clean_arch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}

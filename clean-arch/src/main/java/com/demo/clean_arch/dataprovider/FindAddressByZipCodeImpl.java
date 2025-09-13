package com.demo.clean_arch.dataprovider;

import com.demo.clean_arch.core.dataprovider.FindAddressByZipCode;
import com.demo.clean_arch.core.domain.Address;
import com.demo.clean_arch.dataprovider.client.FindAddressByZipCodeClient;
import com.demo.clean_arch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}

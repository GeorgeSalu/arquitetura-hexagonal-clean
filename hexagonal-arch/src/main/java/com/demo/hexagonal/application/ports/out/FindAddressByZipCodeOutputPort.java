package com.demo.hexagonal.application.ports.out;

import com.demo.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}

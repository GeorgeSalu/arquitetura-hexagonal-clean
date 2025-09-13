package com.demo.clean_arch.core.dataprovider;

import com.demo.clean_arch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);

}

package com.demo.clean_arch.config;

import com.demo.clean_arch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.demo.clean_arch.dataprovider.FindAddressByZipCodeImpl;
import com.demo.clean_arch.dataprovider.InsertCustomerImpl;
import com.demo.clean_arch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode, InsertCustomerImpl insertCustomer, SendCpfForValidationImpl sendCpfForValidation) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}

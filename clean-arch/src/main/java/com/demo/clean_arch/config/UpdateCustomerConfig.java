package com.demo.clean_arch.config;

import com.demo.clean_arch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.demo.clean_arch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.demo.clean_arch.dataprovider.FindAddressByZipCodeImpl;
import com.demo.clean_arch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, FindAddressByZipCodeImpl findAddressByZipCode, UpdateCustomerImpl updateCustomer) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }

}

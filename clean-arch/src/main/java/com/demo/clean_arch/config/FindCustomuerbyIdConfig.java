package com.demo.clean_arch.config;

import com.demo.clean_arch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.demo.clean_arch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomuerbyIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }

}

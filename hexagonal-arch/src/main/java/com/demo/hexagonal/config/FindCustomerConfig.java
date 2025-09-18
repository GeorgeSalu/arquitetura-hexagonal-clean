package com.demo.hexagonal.config;

import com.demo.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.demo.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.demo.hexagonal.adapters.out.InsertCustomerAdapter;
import com.demo.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.demo.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}

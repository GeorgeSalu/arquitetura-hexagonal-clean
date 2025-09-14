package com.demo.clean_arch.config;

import com.demo.clean_arch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.demo.clean_arch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.demo.clean_arch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, DeleteCustomerByIdImpl deleteCustomerById) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }

}

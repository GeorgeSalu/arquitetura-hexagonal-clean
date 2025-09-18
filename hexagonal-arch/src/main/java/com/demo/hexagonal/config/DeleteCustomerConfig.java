package com.demo.hexagonal.config;

import com.demo.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.demo.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.demo.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerByIdAdapter deleteCustomerByIdAdapter) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }

}

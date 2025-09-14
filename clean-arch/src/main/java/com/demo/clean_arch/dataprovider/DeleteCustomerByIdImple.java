package com.demo.clean_arch.dataprovider;

import com.demo.clean_arch.core.dataprovider.DeleteCustomerById;
import com.demo.clean_arch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImple implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}

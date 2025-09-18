package com.demo.hexagonal.application.core.usecase;

import com.demo.hexagonal.application.core.domain.Customer;
import com.demo.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.demo.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.demo.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCsutomerUseCase {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCsutomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }

}

package com.demo.clean_arch.entrypoint.consumer;

import com.demo.clean_arch.core.usecase.UpdateCustomerUseCase;
import com.demo.clean_arch.entrypoint.consumer.mapper.CustomerMessagemMapper;
import com.demo.clean_arch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessagemMapper customerMessagemMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "arantes")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessagemMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }

}

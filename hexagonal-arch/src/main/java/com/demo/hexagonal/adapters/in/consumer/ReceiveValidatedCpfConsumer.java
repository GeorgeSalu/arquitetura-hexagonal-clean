package com.demo.hexagonal.adapters.in.consumer;

import com.demo.hexagonal.adapters.in.consumer.mapper.CutomerMessageMapper;
import com.demo.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.demo.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CutomerMessageMapper cutomerMessageMapper;

    @KafkaListener(topics = "tc-cpf-validated", groupId = "arantes")
    public void receive(CustomerMessage customerMessage) {
        var customer = cutomerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}

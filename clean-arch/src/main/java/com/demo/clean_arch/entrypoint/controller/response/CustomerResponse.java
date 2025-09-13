package com.demo.clean_arch.entrypoint.controller.response;

public class CustomerResponse {

    private String name;
    private String cpf;
    private Boolean isValidCpf;
    private AddressResponse addressResponse;

    public CustomerResponse() {
    }

    public CustomerResponse(String name, String cpf, Boolean isValidCpf, AddressResponse addressResponse) {
        this.name = name;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
        this.addressResponse = addressResponse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }

    public AddressResponse getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(AddressResponse addressResponse) {
        this.addressResponse = addressResponse;
    }
}

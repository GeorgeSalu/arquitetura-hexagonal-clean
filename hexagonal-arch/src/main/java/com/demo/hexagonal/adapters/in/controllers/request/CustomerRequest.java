package com.demo.hexagonal.adapters.in.controllers.request;

import jakarta.validation.constraints.NotBlank;

public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

    public CustomerRequest() {
    }

    public CustomerRequest(String name, String cpf, String zipCode) {
        this.name = name;
        this.cpf = cpf;
        this.zipCode = zipCode;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

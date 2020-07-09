package com.example.salutationservice;

public enum SalutationType {

    MR ("Mr"),
    MRS ("Mrs"),
    MISS ("Miss"),
    SIR ("Sir"),
    DOCTOR ("Dr.");

    private String salutationValue;

    SalutationType(String salutationValue) {
        this.salutationValue = salutationValue;
    }

    public String getSalutationValue() {
        return salutationValue;
    }
}

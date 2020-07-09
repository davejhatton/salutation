package com.example.salutationservice;

import java.util.HashMap;
import java.util.Map;

public class SalutationServiceImplementation implements SalutationService {

    private final Map<SalutationType, String> mapTypeToValue;

    public SalutationServiceImplementation(SalutationProperties salutationProperties) {
        this.mapTypeToValue = new HashMap<>();
        this.mapTypeToValue.put(SalutationType.MR, salutationProperties.getMr());
        this.mapTypeToValue.put(SalutationType.MISS, salutationProperties.getMiss());
        this.mapTypeToValue.put(SalutationType.MRS, salutationProperties.getMrs());
        this.mapTypeToValue.put(SalutationType.DOCTOR, salutationProperties.getDr());
        this.mapTypeToValue.put(SalutationType.SIR, salutationProperties.getSir());
    }

    @Override
    public String getSalutation(SalutationType type) {
        return mapTypeToValue.get(type);
    }

    @Override
    public String prefixSalutationToCandidate(SalutationType type, String candidate) {
        return mapTypeToValue.get(type) + " " + candidate;
    }
}

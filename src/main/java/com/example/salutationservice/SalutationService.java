package com.example.salutationservice;

public interface SalutationService {

    String getSalutation(SalutationType type);

    String prefixSalutationToCandidate(SalutationType type, String candidate);
}

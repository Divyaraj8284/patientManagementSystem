package com.patientmanagement.patientservice.exception;

public class PatientNoFoundExcepttion extends RuntimeException {
    public PatientNoFoundExcepttion(String message) {
        super(message);
    }
}

package com.example.Patient.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientServiseImpl implements PatientService {
    private List<String > names = Arrays.asList("Ahmed","Youssef","Khaled");
    @Override
    public String getName(String name) {
        return names.stream()
                .filter(s -> s.equals(name))
                .findAny()
                .orElse("Not Found")
                ;
    }
}

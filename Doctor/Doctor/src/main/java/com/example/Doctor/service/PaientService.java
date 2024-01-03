package com.example.Doctor.service;

import com.example.Doctor.proxy.PatientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaientService {
    @Autowired
    private PatientProxy proxy;
    public String getPatient(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:9000/search/" + name, String.class);
    }
    public String getPatientByFeifn(String name){
        return proxy.getPatientName(name);
    }
}

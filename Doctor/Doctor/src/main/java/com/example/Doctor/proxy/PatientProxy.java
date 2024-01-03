package com.example.Doctor.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PATIENT-SERVICE")
public interface PatientProxy {
    @GetMapping("/search/{name}")
    public String getPatientName(@PathVariable("name") String name);
}

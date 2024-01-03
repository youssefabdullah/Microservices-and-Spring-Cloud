package com.example.Patient.Controller;

import com.example.Patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientService service;
    @GetMapping("/search/{name}")
    public String getPatientName(@PathVariable("name") String name){
            return service.getName(name);
    }
}

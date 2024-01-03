package com.example.Doctor.Controller;

import com.example.Doctor.service.PaientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PaientService service;
    @GetMapping("/doctor/getPatient/{name}")
    public String gettPatient(@PathVariable("name") String name){
        return service.getPatient(name);
    }
    @GetMapping("/doctor/gettPatientFeign/{name}")
    public String gettPatientFeign(@PathVariable("name") String name){
        return service.getPatientByFeifn(name);
    }
}

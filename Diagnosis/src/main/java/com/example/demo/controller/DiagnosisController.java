package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Diagnosis;
import com.example.demo.service.DiagnosisService;

@RestController
public class DiagnosisController {
    
	@Autowired
	private DiagnosisService diagnosisService;
	
	@GetMapping("/{patientId}/diagnosis")
	private Diagnosis getHealthStatus(@PathVariable("patientId") int patientId) {
		return diagnosisService.getHealthStatus(patientId);
	}

	@RequestMapping(method = RequestMethod.POST,value = "/addPatient")
	private void  addPatientIdToDiagnosis(@RequestBody Diagnosis diagnosis) {
		System.out.println("Inside Diagnosis controller"+diagnosis.getPatientId());
		
		diagnosisService.addToDiagnosis(diagnosis);
	}
}

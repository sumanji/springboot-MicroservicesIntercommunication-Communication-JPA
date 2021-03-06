package com.example.demo.communicator;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Diagnosis;

@FeignClient(name = "diagnosis")
public interface IDiagnosis {
	@GetMapping("/{patientId}/diagnosis")
	public Diagnosis getPatientHealthStatus(@PathVariable(value = "patientId") Integer patientId);
	
	@PostMapping("/addPatient")
	public String addPatientToDiagnosis(Diagnosis patID) ;
}

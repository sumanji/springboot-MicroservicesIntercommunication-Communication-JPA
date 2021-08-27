package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.Patientservice;

@RestController
@CrossOrigin(origins = "*")
public class PatientController {

	
	@Autowired
	Patientservice patientservice;

	@RequestMapping(method = RequestMethod.POST, value = "/addPatient")
	private int addPatient(@RequestBody Patient patient) {
		return patientservice.savePatient(patient);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/patients")
	private List<Patient> getAllPatient() {
		return patientservice.getAllPatient();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/patient/{patientId}")
	private Patient getPatientByID(@PathVariable("patientId") int patientId) {
		return patientservice.getPatientById(patientId);
	}
}

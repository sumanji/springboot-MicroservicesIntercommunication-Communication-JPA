package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.communicator.IDiagnosis;
import com.example.demo.dao.PatientDAO;
import com.example.demo.entity.Diagnosis;
import com.example.demo.entity.Patient;

@Service
public class Patientservice {
	@Autowired
	IDiagnosis diagnosis;

	@Autowired
	PatientDAO patientDAO;

	public int savePatient(Patient patient) {
		int patientId= patientDAO.save(patient).getPatientId();
		Diagnosis diagnosisEntity= patient.getDiagnosis().get(0);
		diagnosisEntity.setPatientId(patientId);
		diagnosis.addPatientToDiagnosis(diagnosisEntity);		
		
		return patientId;

	}

	public List<Patient> getAllPatient() {
        return patientDAO.findAll();
	}
	
	public Patient getPatientById(int patientId) {
        Optional<Patient> patient=patientDAO.findById(patientId);
        if(patient.isPresent()) {
        	Patient patientEntity= patient.get();
        	patientEntity.setDiagnosis(diagnosis.getPatientHealthStatus(patientId));
        	return patientEntity;
        }
        else {
        	System.out.println("no patinet found with ID "+patientId);
        	return null;
        }
	}
}

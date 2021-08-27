package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Diagnosis;

@Service
public class DiagnosisService {

	public List<Diagnosis> diagnosisReportlist = new ArrayList<Diagnosis>();
     @Value("${server.port}")
	 private int portNumber;
	
	
	public Diagnosis getHealthStatus(int patientId) {
		return diagnosisReportlist.stream().filter(diagnosisEntity -> diagnosisEntity.getPatientId() == patientId)
				.findAny().orElse(null);
	}

	public void addToDiagnosis(Diagnosis diagnosis) {
		diagnosis.setPort(portNumber);
		diagnosisReportlist.add(diagnosis);
	}

}

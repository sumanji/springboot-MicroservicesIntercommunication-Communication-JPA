package com.example.demo.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DIAGNOSIS")
public class Diagnosis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int diagnosisId;
	
	
	private int patientId;
	private String report;
	private String diagnosedFor;

	private int port;

	@ManyToOne
	@JoinColumn(name="patinet_fk")
	private Patient patient;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getDiagnosedFor() {
		return diagnosedFor;
	}

	public void setDiagnosedFor(String diagnosedFor) {
		this.diagnosedFor = diagnosedFor;
	}
	
	
	

	public int getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(int diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public boolean equals(Object diagnosis) {
		boolean flag = false;
		if (diagnosis != null && ((Diagnosis) diagnosis).getPatientId() == this.patientId) {
			flag = true;
		}
		return flag;
	}

}

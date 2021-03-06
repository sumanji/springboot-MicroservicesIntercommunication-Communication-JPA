package com.example.demo.model;

public class Diagnosis {

	private int patientId;
	private String report;
	private String diagnosedFor;
	
	private int port;

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
	
	@Override
	public boolean equals(Object diagnosis) {
	   boolean  flag= false;
		if(diagnosis !=null && ((Diagnosis)diagnosis).getPatientId()==this.patientId) {
			flag=true;
		}
		return flag;
	}

}

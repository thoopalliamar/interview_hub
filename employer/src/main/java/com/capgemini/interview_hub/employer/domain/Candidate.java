package com.capgemini.interview_hub.employer.domain;

public class Candidate {

	private String name;
	private String employeeId;
	private String emailId;
	private Long mobileNumber;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Candidate(String name, String employeeId, String emailId, Long mobileNumber, String type) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.type = type;
	}
	public Candidate() {
		super();
	}
	
	
	
	
}

package com.capgemini.interview_hub.panelist.domain;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Panelist {

	@Id
	private String empID;
	private String name;
	private String emailID;
	private String city;
	private String location;
	private Long mobileNumber;
	private Long ExtensionNumber;
	private Long secondaryMobNum;
	private List<Project> projects;
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Long getExtensionNumber() {
		return ExtensionNumber;
	}
	public void setExtensionNumber(Long extensionNumber) {
		ExtensionNumber = extensionNumber;
	}
	public Long getSecondaryMobNum() {
		return secondaryMobNum;
	}
	public void setSecondaryMobNum(Long secondaryMobNum) {
		this.secondaryMobNum = secondaryMobNum;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> localPrj) {
		this.projects = localPrj;
	}
	public Panelist(String empID, String name, String emailID, String city, String location, Long mobileNumber,
			Long extensionNumber, Long secondaryMobNum, List<Project> projects) {
		super();
		this.empID = empID;
		this.name = name;
		this.emailID = emailID;
		this.city = city;
		this.location = location;
		this.mobileNumber = mobileNumber;
		ExtensionNumber = extensionNumber;
		this.secondaryMobNum = secondaryMobNum;
		this.projects = projects;
	}
	public Panelist() {
		super();
	}
	


}

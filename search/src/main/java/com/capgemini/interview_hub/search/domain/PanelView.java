package com.capgemini.interview_hub.search.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PanelView {

	@Id
	private String projectName;
	private String Position;
	private int noOfPositions;
	private Date interviewDate;
	private String meetingRoom;
	private String empID;
	private String name;
	private String emailID;
	private String city;
	private String location;
	private Long mobileNumber;
	private Long ExtensionNumber;
	private Long secondaryMobNum;
	private List<Candidate> candidates;
	
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public int getNoOfPositions() {
		return noOfPositions;
	}
	public void setNoOfPositions(int noOfPositions) {
		this.noOfPositions = noOfPositions;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getMeetingRoom() {
		return meetingRoom;
	}
	public void setMeetingRoom(String meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
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
	public List<Candidate> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	
	public PanelView(String projectName, String position, int noOfPositions, Date interviewDate, String meetingRoom,
			String empID, String name, String emailID, String city, String location, Long mobileNumber,
			Long extensionNumber, Long secondaryMobNum, List<Candidate> candidates) {
		super();
		this.projectName = projectName;
		Position = position;
		this.noOfPositions = noOfPositions;
		this.interviewDate = interviewDate;
		this.meetingRoom = meetingRoom;
		this.empID = empID;
		this.name = name;
		this.emailID = emailID;
		this.city = city;
		this.location = location;
		this.mobileNumber = mobileNumber;
		ExtensionNumber = extensionNumber;
		this.secondaryMobNum = secondaryMobNum;
		this.candidates = candidates;
	}
	
	
	public PanelView() {
		super();
	}
	
	
	
	
}

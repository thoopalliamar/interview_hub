package com.capgemini.interview_hub.panelist.domain;

import java.util.Date;
import java.util.List;

public class Project {
	
	private String projectName;
	private String Position;
	private int noOfPositions;
	private Date interviewDate;
	private String meetingRoom;
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
	public List<Candidate> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	public Project(String projectName, String position, int noOfPositions, Date interviewDate, String meetingRoom,
			List<Candidate> candidates) {
		super();
		this.projectName = projectName;
		Position = position;
		this.noOfPositions = noOfPositions;
		this.interviewDate = interviewDate;
		this.meetingRoom = meetingRoom;
		this.candidates = candidates;
	}
	public Project() {
		super();
	}
	


}

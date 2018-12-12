package com.capgemini.interview_hub.panelist.service;

import com.capgemini.interview_hub.panelist.domain.Candidate;
import com.capgemini.interview_hub.panelist.domain.Panelist;

public interface PanelistService {

	public Panelist savePanelist (Panelist panelist);
	
	public Panelist findPanelist(String empId);

	public Panelist updateCandidates(Candidate optedCandidates, String EmployeeId, String projectName);
	
}

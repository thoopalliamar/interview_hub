package com.capgemini.interview_hub.panelist.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.interview_hub.panelist.domain.Candidate;
import com.capgemini.interview_hub.panelist.domain.Panelist;
import com.capgemini.interview_hub.panelist.domain.Project;
import com.capgemini.interview_hub.panelist.repository.PanelistRepository;

@Service
public class PanelistServiceImpl implements PanelistService {

	// Instance of repository
	@Autowired
	private PanelistRepository panelistRepository;

	// @Autowired
	public PanelistServiceImpl(PanelistRepository panelistRepository) {
		this.panelistRepository = panelistRepository;
	}

	@Override
	public Panelist savePanelist(Panelist panelist) {

		Panelist savePanelist = panelistRepository.save(panelist);
		return savePanelist;
	}

	@Override
	public Panelist findPanelist(String empId) {
		Panelist savePanelist = panelistRepository.findByEmpID(empId);
		return savePanelist;
	}

	@Override
	public Panelist updateCandidates(Candidate optedCandidates, String EmployeeId, String projectName) {
		Panelist savePanelist = panelistRepository.findByEmpID(EmployeeId);
//		Candidate newCandidate = new Candidate( optedCandidates.getName(), optedCandidates.getEmployeeId(), optedCandidates.getEmailId(), optedCandidates.getMobileNumber(),optedCandidates.getType());
		List<Project> foundProject = savePanelist.getProjects();
		Iterator<Project> itr = foundProject.iterator();
		Iterator<Project> localPrj = itr;
		while (itr.hasNext()) {
			if (itr.next().getProjectName() == projectName) {
				List<Candidate> list = itr.next().getCandidates();
				list.add(optedCandidates);
			}
		}

		savePanelist.setProjects((List<Project>) localPrj);
		panelistRepository.save(savePanelist);
		return savePanelist;
	}

}

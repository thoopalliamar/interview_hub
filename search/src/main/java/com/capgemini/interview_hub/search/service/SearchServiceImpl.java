package com.capgemini.interview_hub.search.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.interview_hub.search.domain.Candidate;
import com.capgemini.interview_hub.search.domain.PanelView;
import com.capgemini.interview_hub.search.repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService {

	// Instance of repository
	@Autowired
	private SearchRepository searchRepository;

	// @Autowired
	public SearchServiceImpl(SearchRepository searchRepository) {
		this.searchRepository = searchRepository;
	}


	@Override
	public PanelView savePanelist(PanelView PanelView) {
		
		 return searchRepository.save(PanelView);
	
	}


	@Override
	public Iterable<PanelView> viewAll() {
		Iterable<PanelView> allProjects = searchRepository.findAll();
		return allProjects;
	}


	@Override
	public PanelView updatePanelCandidates(String projectName,Candidate optedCandidates) {
		PanelView foundProject = searchRepository.findByProjectName(projectName);
		Candidate candidate = new Candidate( optedCandidates.getName(), optedCandidates.getEmployeeId(), optedCandidates.getEmailId(), optedCandidates.getMobileNumber(),optedCandidates.getType());
		List<Candidate> existingCandidate = foundProject.getCandidates();
		existingCandidate.add(candidate);
		foundProject.setCandidates(existingCandidate);
		//kafka producer
		return foundProject;
	}
	
	//kafka listener
}

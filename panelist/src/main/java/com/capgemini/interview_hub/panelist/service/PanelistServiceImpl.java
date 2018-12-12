package com.capgemini.interview_hub.panelist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.interview_hub.panelist.domain.Panelist;
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
	


}

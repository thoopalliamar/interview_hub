package com.capgemini.interview_hub.search.service;

import java.util.List;

import com.capgemini.interview_hub.search.domain.Candidate;
import com.capgemini.interview_hub.search.domain.PanelView;

public interface SearchService {

	public PanelView savePanelist(PanelView PanelView) ;
	
	public Iterable<PanelView> viewAll();
	
	public PanelView updatePanelCandidates(String projectName,Candidate optedCandidates);
	
	
}

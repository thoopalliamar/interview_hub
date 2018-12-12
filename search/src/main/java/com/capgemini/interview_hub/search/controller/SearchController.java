package com.capgemini.interview_hub.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.interview_hub.search.domain.Candidate;
import com.capgemini.interview_hub.search.domain.PanelView;
import com.capgemini.interview_hub.search.service.SearchServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class SearchController {

	@Autowired
	private SearchServiceImpl SearchServiceImpl;

	// @Autowired
	public SearchController(SearchServiceImpl SearchServiceImpl) {
		this.SearchServiceImpl = SearchServiceImpl;
	}
	
	@RequestMapping(value = "/search/{projectId}", method = RequestMethod.PUT)
	public ResponseEntity<?> saveMovie(@PathVariable String projectId, @RequestBody Candidate candidate) {
		
		PanelView updatedProject = SearchServiceImpl.updatePanelCandidates(projectId, candidate);
		return new ResponseEntity<PanelView>(updatedProject, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/search/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveMovie(@RequestBody PanelView PanelView) {
	
		PanelView savedPanelist = SearchServiceImpl.savePanelist(PanelView);
		return new ResponseEntity<PanelView>(savedPanelist, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<?> viewAll() {
	
		Iterable<PanelView> savedPanelist = SearchServiceImpl.viewAll();
		return new ResponseEntity<Iterable<PanelView>>(savedPanelist, HttpStatus.OK);

	}
	
	

}

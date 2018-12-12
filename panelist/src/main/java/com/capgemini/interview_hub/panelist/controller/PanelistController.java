package com.capgemini.interview_hub.panelist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.interview_hub.panelist.domain.Panelist;
import com.capgemini.interview_hub.panelist.service.PanelistServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class PanelistController {
	
	// Instance of repository
	@Autowired
	private PanelistServiceImpl panelistServiceImpl;

	// @Autowired
	public PanelistController(PanelistServiceImpl panelistServiceImpl) {
		this.panelistServiceImpl = panelistServiceImpl;
	}
	
	@RequestMapping(value = "/panelist/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveMovie(@RequestBody Panelist panelist) {
		Panelist savedPanelist ;
		savedPanelist = panelistServiceImpl.savePanelist(panelist);
		return new ResponseEntity<Panelist>(savedPanelist, HttpStatus.OK);

	}

	

}

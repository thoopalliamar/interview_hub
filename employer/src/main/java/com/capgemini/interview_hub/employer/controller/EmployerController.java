package com.capgemini.interview_hub.employer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.interview_hub.employer.domain.Employer;
import com.capgemini.interview_hub.employer.service.EmployerServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class EmployerController {
	
	// Instance of repository
	@Autowired
	private EmployerServiceImpl employerServiceImpl;

	// @Autowired
	public EmployerController(EmployerServiceImpl employerServiceImpl) {
		this.employerServiceImpl = employerServiceImpl;
	}
	
	@RequestMapping(value = "/employer/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveEmployer(@RequestBody  Employer employer) {
		Employer savedEmployer ;
		savedEmployer = employerServiceImpl.saveEmployer(employer);
		return new ResponseEntity<Employer>(savedEmployer, HttpStatus.OK);

	}

}

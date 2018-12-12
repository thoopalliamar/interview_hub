package com.capgemini.interview_hub.employer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.interview_hub.employer.domain.Employer;
import com.capgemini.interview_hub.employer.repository.EmployerRepository;


@Service
public class EmployerServiceImpl implements EmployerService {

	// Instance of repository
	@Autowired
	private EmployerRepository employerRepository;

	// @Autowired
	public EmployerServiceImpl(EmployerRepository employerRepository) {
		this.employerRepository = employerRepository;
	}

	@Override
	public Employer saveEmployer(Employer employer) {

		Employer saveEmp = employerRepository.save(employer);

		return saveEmp;
	}

}

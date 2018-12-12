package com.capgemini.interview_hub.employer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.interview_hub.employer.domain.Employer;

@Repository
public interface EmployerRepository extends CrudRepository<Employer, String> {
	
	

}

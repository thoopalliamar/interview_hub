package com.capgemini.interview_hub.search.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.interview_hub.search.domain.PanelView;


@Repository
public interface SearchRepository extends CrudRepository<PanelView, String>{
	
	public PanelView findByProjectName(String projectName);
	

}

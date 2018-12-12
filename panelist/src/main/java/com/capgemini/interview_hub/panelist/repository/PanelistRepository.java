package com.capgemini.interview_hub.panelist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.interview_hub.panelist.domain.Panelist;


@Repository
public interface PanelistRepository extends CrudRepository<Panelist	, String>{

}

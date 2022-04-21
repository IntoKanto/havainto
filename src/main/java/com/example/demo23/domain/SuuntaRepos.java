package com.example.demo23.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SuuntaRepos extends CrudRepository<Suunta,Long> {
	
	List<Suunta>findByOsa(String osa);
	

}

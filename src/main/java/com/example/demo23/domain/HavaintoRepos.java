package com.example.demo23.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HavaintoRepos extends CrudRepository<Havainto,Long> {
	
	List<Havainto>findByName(String name);
	
}

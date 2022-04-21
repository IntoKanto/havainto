package com.example.demo23.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TyyppiRepo extends CrudRepository<Tyyppi, Long> {
	List<Tyyppi>findBySeloste(String seloste);

}

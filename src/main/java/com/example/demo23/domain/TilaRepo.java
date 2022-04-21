package com.example.demo23.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TilaRepo extends CrudRepository<Tila, Long> {
	List<Tila>findByTilassa(String tilassa);
}

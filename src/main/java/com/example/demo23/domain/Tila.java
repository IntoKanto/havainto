package com.example.demo23.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tila {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long tilaid;
	private String tilassa;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tila")
	private List<Havainto> havainnot;
	
	public Tila () {}

	public Tila (String tilassa) {
		this.tilassa = tilassa;
	}

	public Long getTilaid() {
		return tilaid;
	}

	public void setTilaid(Long tilaid) {
		this.tilaid = tilaid;
	}

	public String getTilassa() {
		return tilassa;
	}

	public void setTilassa(String tilassa) {
		this.tilassa = tilassa;
	}

	
	public List<Havainto> getHavainnot() {
		return havainnot;
	}

	public void setHavainnot(List<Havainto> havainnot) {
		this.havainnot = havainnot;
	}

	@Override
	public String toString() {
		return "Tila [tilaid=" + tilaid + ", tilassa=" + tilassa + ", havainnot=" + havainnot + "]";
	}

	
	
	
}

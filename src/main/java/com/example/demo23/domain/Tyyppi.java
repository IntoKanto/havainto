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
public class Tyyppi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tyyppiid;
	private String seloste;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tyyppi")
	List<Havainto> havainnot;
	
	public Tyyppi () {}
	
	public Tyyppi (String seloste) {
		super();
		this.seloste = seloste;
	}

	public Long getTyyppiid() {
		return tyyppiid;
	}

	public void setTyyppiid(Long tyyppiid) {
		this.tyyppiid = tyyppiid;
	}

	public String getSeloste() {
		return seloste;
	}

	public void setSeloste(String seloste) {
		this.seloste = seloste;
	}

	public List<Havainto> getHavainnot() {
		return havainnot;
	}

	public void setHavainnot(List<Havainto> havainnot) {
		this.havainnot = havainnot;
	}

	@Override
	public String toString() {
		return "Tyyppi [tyyppiid=" + tyyppiid + ", seloste=" + seloste + ", havainnot=" + havainnot + "]";
	}

	
	

}

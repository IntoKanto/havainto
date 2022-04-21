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
public class Suunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long suuntaid;
	private String osa;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "suunta")
	private List<Havainto> havainnot;
	
	public Suunta () {}
	
	public Suunta (String osa) {
		super() ;
		this.osa = osa;
	}
	
	

	public Long getSuuntaid() {
		return suuntaid;
	}

	public void setSuuntaid(Long suuntaid) {
		this.suuntaid = suuntaid;
	}

	public String getOsa() {
		return osa;
	}

	public void setOsa(String osa) {
		this.osa = osa;
	}

	public List<Havainto> getHavainnot() {
		return havainnot;
	}

	public void setHavainnot(List<Havainto> havainnot) {
		this.havainnot = havainnot;
	}

	@Override
	public String toString() {
		return "Suunta [suuntaid=" + suuntaid + ", osa=" + osa + ", havainnot=" + havainnot + "]";
	}

	
	

}

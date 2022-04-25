package com.example.demo23.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Havainto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long havaintoid;
	private String name;
	private String ilmoittaja;
	private String pvm;

	@ManyToOne
	@JoinColumn(name = "suuntaid")
	private Suunta suunta;
	@ManyToOne
	@JoinColumn(name = "tilaid")
	private Tila tila;
	@ManyToOne
	@JoinColumn(name = "tyyppiid")
	private Tyyppi tyyppi;
	
	public Havainto () {}
	
	public Havainto(String name, String ilmoittaja, Suunta suunta, Tila tila, Tyyppi tyyppi, String pvm) {
		super();
		this.name = name;
		this.ilmoittaja = ilmoittaja;
		this.suunta = suunta;
		this.tila = tila;
		this.tyyppi = tyyppi;
		this.pvm = pvm;
		
		
	}
	
	

	public Tyyppi getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(Tyyppi tyyppi) {
		this.tyyppi = tyyppi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getHavaintoid() {
		return havaintoid;
	}

	public void setHavaintoid(Long havaintoid) {
		this.havaintoid = havaintoid;
	}

	public String getIlmoittaja() {
		return ilmoittaja;
	}

	public void setIlmoittaja(String ilmoittaja) {
		this.ilmoittaja = ilmoittaja;
	}

	

	public Suunta getSuunta() {
		return suunta;
	}

	public void setSuunta(Suunta suunta) {
		this.suunta = suunta;
	}
	
	
	
	

	public Tila getTila() {
		return tila;
	}

	public void setTila(Tila tila) {
		this.tila = tila;
	}

	public String getPvm() {
		return pvm;
	}

	public void setPvm(String pvm) {
		this.pvm = pvm;
	}

	@Override
	public String toString() {
		return "Havainto [havaintoid=" + havaintoid + ", name=" + name + ", ilmoittaja=" + ilmoittaja + ", pvm=" + pvm
				+ ", suunta=" + suunta + ", tila=" + tila + ", tyyppi=" + tyyppi + "]";
	}

	

	
	
	
	
	
	

}

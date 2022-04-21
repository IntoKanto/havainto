package com.example.demo23;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo23.domain.Havainto;
import com.example.demo23.domain.HavaintoRepos;
import com.example.demo23.domain.Suunta;
import com.example.demo23.domain.SuuntaRepos;
import com.example.demo23.domain.Tila;
import com.example.demo23.domain.TilaRepo;
import com.example.demo23.domain.Tyyppi;
import com.example.demo23.domain.TyyppiRepo;



@SpringBootApplication
public class Demo23Application {
	private static final Logger log = LoggerFactory.getLogger(Demo23Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Demo23Application.class, args);
	}
	
	@Bean 
	public CommandLineRunner demoDemoDemo(HavaintoRepos hrepo, SuuntaRepos srepo, TilaRepo trepo, TyyppiRepo tyrepo) {
		return (args) -> {
			
			srepo.save(new Suunta("eteläinen"));
			srepo.save(new Suunta("pohjoinen"));
			srepo.save(new Suunta("läntinen"));
			srepo.save(new Suunta("itäinen"));
			
			trepo.save(new Tila("tehty"));
			trepo.save(new Tila("odottaa"));
			
			tyrepo.save(new Tyyppi("tievaurio"));
			tyrepo.save(new Tyyppi("Viheralueet"));
			tyrepo.save(new Tyyppi("Roskat"));
			
			
			hrepo.save(new Havainto("Jäätä käytäävällä", "Anatoli Tselms", srepo.findByOsa("eteläinen").get(0),trepo.findByTilassa("tehty").get(0), tyrepo.findBySeloste("tievaurio").get(0)));
			
			
		};
	}

}

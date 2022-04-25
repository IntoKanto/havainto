package com.example.demo23.web;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo23.domain.Havainto;
import com.example.demo23.domain.HavaintoRepos;

@RestController
public class HavaintoRestController {
	@Autowired
	private HavaintoRepos hrepo;
	@RequestMapping(value="/hapi", method=RequestMethod.GET)
	public @ResponseBody List<Havainto> hListRest() {
		return (List<Havainto>)hrepo.findAll();
		
	}


	

}

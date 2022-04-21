package com.example.demo23.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo23.domain.Havainto;
import com.example.demo23.domain.HavaintoRepos;
import com.example.demo23.domain.SuuntaRepos;
import com.example.demo23.domain.TilaRepo;
import com.example.demo23.domain.TyyppiRepo;





@Controller
public class HavaintoController {
	@Autowired
	private HavaintoRepos hrepo;
	@Autowired
	private SuuntaRepos srepo;
	@Autowired
	private TilaRepo trepo;
	@Autowired
	private TyyppiRepo tyrepo;
	
	@RequestMapping(value={"/", "hlista"})
	public String lista (Model model) {
		model.addAttribute("havainnot", hrepo.findAll());
		return "hlista";
	}
	 @RequestMapping(value = "/add")
	    public String addStudent(Model model){
	    	model.addAttribute("havainto", new Havainto());
	    	model.addAttribute("suunnat", srepo.findAll());
	    	model.addAttribute("tilat", trepo.findAll());
	    	model.addAttribute("tyypit", tyrepo.findAll());
	        return "addhavainto";
	    }  
	 
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(Havainto havainto){
	        hrepo.save(havainto);
	        return "redirect:hlista";
	    }    
	 
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	    public String deleteH(@PathVariable("id") Long havaintoId, Model model) {
	    	hrepo.deleteById(havaintoId);
	        return "redirect:../hlista";
	    }     

	 
	    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	    public String editH(@PathVariable("id") Long havaintoId, Model model) {
	    	model.addAttribute("havainto", hrepo.findById(havaintoId));
	    	model.addAttribute("suunnat", srepo.findAll());
	    	model.addAttribute("tilat", trepo.findAll());
	    	model.addAttribute("tyypit", tyrepo.findAll());
	    	return "edith.html";
	    }   
	    
	    @RequestMapping(value="/havaintoapi", method = RequestMethod.GET)
	    public @ResponseBody List<Havainto> havaintolistRest() {
	    	return(List<Havainto>)hrepo.findAll();
	    }
	
	}

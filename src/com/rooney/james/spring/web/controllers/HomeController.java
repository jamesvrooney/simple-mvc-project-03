package com.rooney.james.spring.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rooney.james.spring.web.model.Person;

@Controller
public class HomeController {

	@Autowired
	private Person person;
	
	@RequestMapping("/")
	public String showHome(Model model) {
		
		person.speak();
		
		model.addAttribute("name", "James R");
		
		return "home";
	}
}

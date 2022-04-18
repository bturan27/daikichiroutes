package com.javastack.spring.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiContoller {

	@RequestMapping("")
	public String daikichi() {
		return "Welcome";
	}
	@RequestMapping("/today")
	public String today() {
		return "today you will find luck in all your endeavors";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "tomorrow an opportunity will arise, so be sure to be open to new ideas";
	}
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return " Congratulations!You will soon travel to ";
	}
	
}
 
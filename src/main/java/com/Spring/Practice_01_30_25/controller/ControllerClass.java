package com.Spring.Practice_01_30_25.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
	public String mainPage() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/FirstPage",method = {RequestMethod.GET,RequestMethod.POST})
	public String firstPage() {
		return "welcome to First Page";
	}
}

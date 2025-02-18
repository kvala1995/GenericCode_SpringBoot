package com.Spring.Practice_01_30_25.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Practice_01_30_25.Bean.BeanClass;

@RestController
public class ControllerClass {

	//dependency injection
	@Autowired
	private BeanClass beobj;
	
	
	@RequestMapping(value = {"/home"},method = RequestMethod.GET)
	public String mainPage() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/FirstPage",method = {RequestMethod.GET,RequestMethod.POST})
	public String firstPage() {
		return "welcome to First Page";
	}
	
	//other way of using request Mapping is directly using getMapping
	
	@GetMapping("/secondPage")
	public String secondPage(){
		return "Second Page using GetMapping";
	}
	
	//localhost:9090/sum?a=7&b=9
	@GetMapping("/sum")
	public int sum(@RequestParam("a") int a, @RequestParam("b") int b) {
	    return beobj.sum(a,b);
    }
}

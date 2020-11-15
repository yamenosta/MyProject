package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	
	  @GetMapping("/")
	    public String hello() {
		  // test ggg hh
	       return  helloService.get();
	    }

}

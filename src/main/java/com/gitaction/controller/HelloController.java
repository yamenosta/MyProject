package com.gitaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitaction.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	
	  @GetMapping("/")
	    public String hello() {
		  // test
	       return  helloService.get();
	    }

}

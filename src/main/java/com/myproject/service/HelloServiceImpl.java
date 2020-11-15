package com.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {

	    @Autowired
	    HelloRepository helloRepository;

	    @Override
	    public String get() {
	        return helloRepository.get();
	    }
}

package com.gitaction.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hello from Repository";
	}

}

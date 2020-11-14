package com.gitaction.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.gitaction.repository.HelloRepository;


@ExtendWith(MockitoExtension.class)
class HelloServiceImplTest {
	
	@Mock
	private HelloRepository helloRepository;
	
	@InjectMocks
	private HelloService helloService = new HelloServiceImpl();;

	@Test
	void test() {
		when(helloRepository.get()).thenReturn("Hello Mockito From Responsitory");
		assertThat(helloService.get()).isEqualTo("Hello Mockito From Responsitory");
	}
		

}

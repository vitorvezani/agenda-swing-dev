package com.window.test.service.impl;

import org.springframework.stereotype.Service;

import com.window.test.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public void sayHello() {
		System.out.println("Digo Hello");
	}

}

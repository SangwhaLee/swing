package com.swing.user.model.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public String test () {
		return "HELLO!!";
	}
	
}

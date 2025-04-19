package com.demoExample.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoExample.DTOS.UserEntityResponseDto;
import com.demoExample.Entity.UserEntity;
import com.demoExample.service.UserEntityService;

@RestController
@RequestMapping("/name")
public class UserEntityController {
	
	@Autowired
	private UserEntityService userService;
	
	
	@PostMapping
	public UserEntityResponseDto  saveUsers(@RequestBody UserEntity user) {
		
		UserEntity us=userService.saveUserEntity(user);
		return userService.convertDto(us);
		
	}
	
	
	

}

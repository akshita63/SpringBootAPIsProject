package com.demoExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoExample.DTOS.UserEntityResponseDto;
import com.demoExample.Entity.UserEntity;
import com.demoExample.Repos.UserEntityRepo;

@Service
public class UserEntityService {
	
	@Autowired
	private UserEntityRepo userentityrepo;

	
	//service method to post data that is of typeUserEntity
	public UserEntity saveUserEntity(UserEntity user) {
		// TODO Auto-generated method stub
		
		return userentityrepo.save(user);
		//return null;
	}

	
	//conversion method of entity to dto object so that we can store in db
	public UserEntityResponseDto convertDto(UserEntity us) {
		// TODO Auto-generated method stub
		
		UserEntityResponseDto userentityresponsedto=new UserEntityResponseDto();
		userentityresponsedto.setId(us.getId());
		userentityresponsedto.setEmail(us.getEmail());
		userentityresponsedto.setName(us.getName());
		//here I excluded password as this field is not going to be shown to my UI
		
		
		
		
		return userentityresponsedto;
	}

	

}

package com.demoExample.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoExample.Entity.UserEntity;

public interface UserEntityRepo  extends JpaRepository<UserEntity, Integer>{
	

}

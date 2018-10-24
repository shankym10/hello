package com.daoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;


public interface Daointerface extends CrudRepository<Login, Integer>{
  
	
	Login findAllByUsernameAndPassword(String uname, String password);

}

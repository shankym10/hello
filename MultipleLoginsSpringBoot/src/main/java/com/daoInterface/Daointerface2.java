package com.daoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;
import com.model.Roll;

public interface Daointerface2 extends CrudRepository<Roll, Integer> {
	
	
	Roll findAllByRollname(String rollname);


}

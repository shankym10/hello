package com.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Serviceinterface.Serviceinterface;
import com.daoInterface.Daointerface;
import com.daoInterface.Daointerface2;
import com.model.Login;
import com.model.Roll;
@Service
public class Serviceimpl implements Serviceinterface {
	@Autowired
	Daointerface dao;
	@Autowired
	Daointerface2 dao2;

	public Daointerface2 getDao2() {
		return dao2;
	}

	public void setDao2(Daointerface2 dao2) {
		this.dao2 = dao2;
	}

	public Daointerface getDao() {
		return dao;
	}

	public void setDao(Daointerface dao) {
		this.dao = dao;
	}

	public Login SaveUser(Login login) {

		return dao.save(login);
	}

	public Roll getRoll(String rollname) {
		// TODO Auto-generated method stub
		return dao2.findAllByRollname(rollname);
	}

	public Login check(Login login) {
		// TODO Auto-generated method stub
		return dao.findAllByUsernameAndPassword(login.getUsername(), login.getPassword());
	}
	

}

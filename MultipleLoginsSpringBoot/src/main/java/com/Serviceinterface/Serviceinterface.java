package com.Serviceinterface;

import com.model.Login;
import com.model.Roll;

public interface Serviceinterface {

	Login SaveUser(Login login);

	Roll getRoll(String rollname);

	Login check(Login login);
	
	

}

package com.CODEX.Service;

import com.CODEX.Bean.UserLogBean;
import com.CODEX.DAO.UserDao;

public class UserService {

	public boolean checkUser(UserLogBean user) throws Exception
	{
		 UserDao us = new UserDao();
		return us.authenticateUser(user);
	}

}

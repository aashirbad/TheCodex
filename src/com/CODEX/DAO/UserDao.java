package com.CODEX.DAO;

import java.sql.Connection;

import com.CODEX.Bean.UserLogBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	
	/*
	 * Check Log In (validate User )
	 */
	public boolean authenticateUser(UserLogBean user) throws Exception
	{
		Connection con = null;
		con = DBConnection.getConnect();
		PreparedStatement p = con . prepareStatement("select * from test.user_login where u_id = ? and u_pass = ?");
		p.setInt(1, user.getUserId());
		p.setString(2, user.getUserPassword());
		ResultSet s =  p.executeQuery();
		if  ( s . next())
		{
			return true;
		}
		return false ; 
	}
	
	
	
	

}

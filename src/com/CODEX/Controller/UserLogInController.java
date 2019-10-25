package com.CODEX.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CODEX.Bean.UserLogBean;
import com.CODEX.Service.UserService;

@WebServlet("/userLogInAction")
public class UserLogInController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int uId = Integer.parseInt(request.getParameter("user_id")) ;
		String uPass = request.getParameter("user_pass");
		

		/* 
		 * Set value in Bean
		 */
		UserLogBean userLog = new UserLogBean();
		userLog.setUserId(uId);
		userLog.setUserPassword(uPass);
		
		/*
		 *  Log in validate
		 */
		boolean ch = false;
		UserService us = new UserService();
		try {
			ch = us.checkUser(userLog);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(ch + "The User :) >>");
		
		
	}

}

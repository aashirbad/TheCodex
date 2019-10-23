package com.CODEX.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CODEX.Bean.UserCheckLogBean;

@WebServlet("/userLogInAction")
public class UserLogInController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uId = request.getParameter("  ") ;
		String uPass = request.getParameter("  ");
		UserCheckLogBean log = new UserCheckLogBean();
		log.setUserId(uId);
		log.setUserPassword(uPass);
		
	}

}

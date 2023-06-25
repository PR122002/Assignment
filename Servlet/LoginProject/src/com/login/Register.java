package com.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.login.dao.UserDao;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("pass");
		
		UserDao dao=new UserDao();
		String message=dao.registerUser(username, password);
		if(message.equals("Registration Successful")) {
			
			request.setAttribute("message", message);
			RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("message", message);
			RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
			rd.forward(request,response);
			
		}
	}
}

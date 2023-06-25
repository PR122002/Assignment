package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import com.login.dao.UserDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("pass");
		
		UserDao dao=new UserDao();
		String message=dao.checkDetails(username, password);
		if(message.equals("true")) {
			
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("welcome.jsp");
		}
		else {			
			request.setAttribute("message", message);
			RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
			rd.forward(request,response);
		}
	}

	
}

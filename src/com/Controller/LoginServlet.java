package com.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.Controller.model.User;
import com.Controller.utilities.ConnectionManager;
import com.lti.dao.UserDao;
import com.lti.dao.UserDaoImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private Connection connection=null; 
	private UserDao dao=new UserDaoImpl();
	RequestDispatcher rd=null;
	private HttpSession session =null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	connection=ConnectionManager.getConnection();
	//response.getWriter().println(connection);
	String un= request.getParameter("userid");
	String pass=request.getParameter("pass");
	User user = new User(un,pass);
	if(dao.validateUser(user))
	{
		session=request.getSession();
		session.setAttribute("user",user);
		rd=request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	
	}
	else
	{
		response.getWriter().println("<h1> Invalid Credientials</h1>");
		rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		
	}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
	}

}

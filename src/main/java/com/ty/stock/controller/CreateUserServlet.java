package com.ty.stock.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.stock.dao.UserDao;
import com.ty.stock.dto.User;


@WebServlet(value="/registeruser")
public class CreateUserServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String email = req.getParameter("useremail");
		String password = req.getParameter("userpassword");
		String cno = req.getParameter("usercontact");
		String age = req.getParameter("userage");
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setCno(Long.parseLong(cno));
		user.setAge(Integer.parseInt(age));

		UserDao dao=new UserDao();
		dao.saveUser(user);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>User Added</h1></body></html>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
		dispatcher.include(req, resp);
	}	
}

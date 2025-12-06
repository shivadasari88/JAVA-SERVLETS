package com.shiva.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shiva.web.dao.PersonDao;
import com.shiva.web.model.Person;

public class GetPersonController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		
		PersonDao dao = new PersonDao();
		Person p1 = dao.getPerson(pid);
		
		request.setAttribute("p1", p1);
		
		RequestDispatcher rd = request.getRequestDispatcher("showPerson.jsp");
		rd.forward(request, response);
	}

	

}

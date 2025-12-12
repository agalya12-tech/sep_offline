package servlet_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/backendRequest")
public class HandlingFirstRequest extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     System.out.println("Request handled in Java Class");	
     PrintWriter writer=res.getWriter();
     writer.println("<h1 style='color:red;text-align: center;'>"
     		+ "Getting Response from Java Backend Class"
     		+ "</h1>");
	}
}

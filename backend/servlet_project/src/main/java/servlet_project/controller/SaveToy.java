package servlet_project.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/save")
public class SaveToy extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	String id=req.getParameter("id");	
    	String name=req.getParameter("name");	
    	String price=req.getParameter("price");	
    	String quantity=req.getParameter("quantity");	
    	
    	System.out.println(id+" "+name+" "+price+" "+quantity);



	}

}

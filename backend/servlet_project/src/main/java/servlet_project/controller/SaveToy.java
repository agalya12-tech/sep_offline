package servlet_project.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_project.dao.ToyCrud;
@WebServlet("/save")
public class SaveToy extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	String id=req.getParameter("id");	
    	String name=req.getParameter("name");	
    	String price=req.getParameter("price");	
    	String quantity=req.getParameter("quantity");	
    	ToyCrud crud=new ToyCrud();
    	try {
			if(crud.insertToy(Integer.parseInt(id),
					name,Double.parseDouble(price) , Integer.parseInt(quantity))>0) {
				 System.out.println(name +" saved successfully");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}


	}

}

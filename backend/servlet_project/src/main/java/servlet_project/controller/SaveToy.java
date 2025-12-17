package servlet_project.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_project.dao.ToyCrud;
import servlet_project.dto.Toy;
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
    		Toy toy=new Toy();
    		toy.setId(Integer.parseInt(id));
    		toy.setName(name);
    		toy.setPrice(Double.parseDouble(price));
    		toy.setQuantity(Integer.parseInt(quantity));
			if(crud.insertToy(toy)>0) {
				RequestDispatcher dispatcher=req.getRequestDispatcher("dashboard.jsp");
				dispatcher.forward(req, res);
			}
		} catch (SQLException e) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("saveToy.html");
			dispatcher.include(req, res);
		}


	}

}

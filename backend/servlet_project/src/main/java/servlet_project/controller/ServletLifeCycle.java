package servlet_project.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lifeCycle")
public class ServletLifeCycle extends GenericServlet {
	public ServletLifeCycle(){
		System.out.println("instance Members are loaded...!!");
	}
	@Override
	public void init() throws ServletException {
	  System.out.println("inti method ...!!");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Method...!!");
	}
	@Override
	public void destroy() {
		System.out.println("Destroy Method...!!");
	}
	static{
		System.out.println("Class Members are loaded...!!");
	}

}

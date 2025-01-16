package servlet_tut;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet{
	
	private ServletConfig servletConfig;
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletConfig=arg0;
		System.out.print("Initailazing Servlet");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.print("Service Request");
	}
	@Override
	public void destroy() {
		System.out.print("Destroying Servlet");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.servletConfig ;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by Author: Karan Chirde";
	}

	

	

}

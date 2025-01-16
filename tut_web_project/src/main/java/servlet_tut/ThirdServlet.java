package servlet_tut;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("processing do get by third servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String massage=req.getParameter("massage");
		System.out.println("Form Submitted");
		System.out.println("Massage: "+massage);
		
		//Sending data to browser 
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		
		writer.print("<h1>From Submitted</h1>");
		Date date=new Date();
		writer.print("""
				<h2>Massage: %s"</h2>
				<h3>Current Data is: %s</h3>
				""".formatted(massage,date));
		resp.setStatus(401);
	}
	
	
}

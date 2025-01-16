package feedback_app.session.manage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet2") // Kept URL mapping unique
public class Request2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        var writer = resp.getWriter();
        Cookie[] cookies = req.getCookies();
    	StringBuilder content=new StringBuilder();

        boolean flag = false;
        if (cookies != null) {
            for (Cookie c : cookies) {
            	String name=c.getName();
                if ("username".equals(c.getName()) && c.getValue() != null) { // Added null check for cookie value
                	System.out.print("username: "+c.getValue());
                    content.append("""
                        <h1>Welcome: %s</h1>
                    """.formatted(c.getValue()));
                    flag = true;
                }
                else if(name.equals("userid")) {
                	System.out.print("username:"+c.getValue());
                	content.append("""
                			<h1>Userid: %s</h1>
                			""".formatted(c.getValue()));
                	flag=true;
                }
            }
        }

        HttpSession session=req.getSession();
        String secret=(String)session.getAttribute("userSecret");
        content.append("""
        		<h1>Session Secret: %s</h1>
        		""".formatted(secret));
        
        if (flag) {
        	writer.print("<h1>User is present</h1>");    
        	writer.print(content);
        }
        else{
            writer.println("<h1>No username found in cookies</h1>");
            writer.println("<h1>Username cookie is not present in the request</h1>");
        }
    }
}

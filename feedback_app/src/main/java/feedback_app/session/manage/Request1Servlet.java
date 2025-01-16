package feedback_app.session.manage;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1") // Changed URL mapping
public class Request1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = "karan";
        String userid="12341";
        Cookie cookie = new Cookie("username", username);
        var cookie1=new Cookie("userid",userid);
        
        cookie.setMaxAge(10 * 60);
        cookie.setMaxAge(5*60);// Cookie will expire in 10 minutes
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        
        
        HttpSession session=req.getSession();
        session.setAttribute("userSecret",UUID.randomUUID().toString());
//        session.setAttribute("userid", userid);
        session.setMaxInactiveInterval(10*60);
        resp.setContentType("text/html");
        var writer = resp.getWriter();
        writer.println("<h1>Cookie 'username' has been set successfully!</h1>");
    }
}

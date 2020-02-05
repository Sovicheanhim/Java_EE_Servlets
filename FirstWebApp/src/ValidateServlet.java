import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidateServlet")
public class ValidateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//
//        if(name.trim().equals("Dane")) {
//            Cookie nameCookie = new Cookie("name", name);
//            response.addCookie(nameCookie);
//            Cookie emailCookie = new Cookie("email", email);
//            PrintWriter pw  = response.getWriter();
//            pw.println("Success");
//        }
        String user = request.getParameter("name");

        Cookie ck = new Cookie("user", user);
        response.addCookie(ck);
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("Welcome : " + user);
        out.println("<a href ='LogOutServlet'> Click to logout </a>");

    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Hidden")
public class Hidden extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<form action= 'Hidden2' method = 'post'>");
        pw.println("<input type = 'hidden' name='user' value='"+user+"'>");
        pw.println("<input type = 'submit' value = 'Login'>");
        pw.println("</form>");
    }
}

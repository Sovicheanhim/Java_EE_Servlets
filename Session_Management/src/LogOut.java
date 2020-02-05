import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogOut")
public class LogOut extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset = UTF-8");
        try (PrintWriter out = response.getWriter()){
            request.getSession().invalidate();
            request.getRequestDispatcher("index.jsp").forward(request, response);
//            response.sendRedirect("index.jsp");
        }
    }
}

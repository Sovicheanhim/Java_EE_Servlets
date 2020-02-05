import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String role = req.getParameter("role");
        if(role.equals("admin")){
            chain.doFilter(req, resp);
//            out.println("Welcome admin!");
        }
        else{
//            out.println("username or password error");
            RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
            rd.include(req, resp);
        }
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}

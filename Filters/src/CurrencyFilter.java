import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "CurrencyFilter")
public class CurrencyFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        int money = Integer.parseInt(req.getParameter("money"));
        if (money>0 && money <= 1000){
            chain.doFilter(req, resp);
        }else {
            out.println("You're not allowed to exchange the money. Please follow our policy.");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

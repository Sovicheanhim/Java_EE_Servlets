import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CurrencyServlet")
public class CurrencyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String currency = request.getParameter("type");
        int amount = Integer.parseInt(request.getParameter("money"));
        switch (currency){
            case "riel":
                amount = amount * 4000;
                break;
            case "baht":
                amount = amount * 31;
                break;
            case "yuan":
                amount = amount * 7;
                break;
        }
        PrintWriter out = response.getWriter();
        out.println("Your money in "+currency+" is : "+amount);
    }
}

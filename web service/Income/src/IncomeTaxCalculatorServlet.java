import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncomeTaxCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double income = Double.parseDouble(request.getParameter("income"));
        double tax = calculateTax(income);

        request.setAttribute("income", income);
        request.setAttribute("tax", tax);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private double calculateTax(double income) {
        double tax;

        if (income <= 5000) {
            tax = 0;
        } else if (income <= 10000) {
            tax = (income - 5000) * 0.1;
        } else {
            tax = 5000 * 0.1 + (income - 10000) * 0.2;
        }

        return tax;
    }
}

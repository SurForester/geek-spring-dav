import resources.Product;
import resources.ProductRepository;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/first-http-servlet/*")
public class FirstHttpServlet extends HttpServlet {
    private ProductRepository productRepository;

    @Override
    public void init() {
        this.productRepository = (ProductRepository) getServletContext().getAttribute("userRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("<table>");
        resp.getWriter().println("<tr>");
        resp.getWriter().println("<th>Product ID</th>");
        resp.getWriter().println("<th>Product Title</th>");
        resp.getWriter().println("<th>Product Cost</th>");
        resp.getWriter().println("</tr>");
        for (Product product : productRepository.findAll()) {
            resp.getWriter().println("<tr>");
            resp.getWriter().println("<td>" + product.getId() + "</td>");
            resp.getWriter().println("<td>" + product.getTitle() + "</td>");
            resp.getWriter().println("<td>" + product.getCost() + "</td>");
            resp.getWriter().println("</tr>");
        }
        resp.getWriter().println("</table>");
    }
}
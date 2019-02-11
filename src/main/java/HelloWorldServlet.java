
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/home")
public class HelloWorldServlet extends HttpServlet {
    private int counter = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
        response.getWriter().println("You have refreshed the page " + counter + " times");
        counter += 5;
    }
}
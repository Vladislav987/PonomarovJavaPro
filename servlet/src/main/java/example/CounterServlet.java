package example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
public class CounterServlet extends HttpServlet {
	
	private int x;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// int x = 0;
		resp.getWriter().println("<html><h1>" + (x++) + "</h1></html>");
	}
}

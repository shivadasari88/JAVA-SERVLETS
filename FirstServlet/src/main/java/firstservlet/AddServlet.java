package firstservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Sum is: " + sum + "</h1>");
        
        request.setAttribute("sum", sum);
        
		RequestDispatcher rd = request.getRequestDispatcher("/mul");
        rd.forward(request,response);
        		
    }
}

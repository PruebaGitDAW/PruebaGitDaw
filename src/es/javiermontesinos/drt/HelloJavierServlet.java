package es.javiermontesinos.drt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by fjmontesinos on 14/2/15.
 */
public class HelloJavierServlet extends HttpServlet {
    private String message;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello, ";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        String nombre = request.getParameter("n");
        if(nombre == null) nombre = "Rafa Montesinos";

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + nombre + "</h1>");
    }
}

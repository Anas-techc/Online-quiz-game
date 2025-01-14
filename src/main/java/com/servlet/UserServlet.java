package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Annotation to map the servlet to a URL
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Hardcoded credentials for demonstration (Replace with database validation)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Retrieve form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        // Validate credentials
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            out.println("<h2>Login Successful!</h2>");
            out.println("<h3>Welcome, " + username + "!</h3>");
            out.println("<a href='index.html'>Go to Home</a>");
        } else {
            out.println("<h2>Login Failed!</h2>");
            out.println("<p>Invalid username or password.</p>");
            out.println("<a href='login.html'>Try Again</a>");
        }

        out.println("</body></html>");
        out.close();
    }
}


package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Annotation to map the servlet to a URL
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Retrieve form data
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // For simplicity, assume registration is successful
        // In a real-world application, you'd save this data in a database

        // Display user profile
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<h3>User Profile</h3>");
        out.println("<p><b>Username:</b> " + username + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Password:</b> " + password + " (Don't show this in production!)</p>");
        out.println("<a href='index.html'>Go to Home</a>");
        out.println("</body></html>");
        out.close();
    }
}


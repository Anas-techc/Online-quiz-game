package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Annotation to map the servlet to a URL
@WebServlet("/profile")
public class UserProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get user data from session
        HttpSession session = request.getSession(false);
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        if (session != null && session.getAttribute("username") != null) {
            String username = (String) session.getAttribute("username");
            String email = (String) session.getAttribute("email");

            // Display user profile
            out.println("<h2>User Profile</h2>");
            out.println("<p><b>Username:</b> " + username + "</p>");
            out.println("<p><b>Email:</b> " + email + "</p>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            // Redirect to login page if session is invalid
            out.println("<h2>You are not logged in!</h2>");
            out.println("<a href='login.html'>Login</a>");
        }

        out.println("</body></html>");
        out.close();
    }
}

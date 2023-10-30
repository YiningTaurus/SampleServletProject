package com.example.sampleservletproject;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "AboutMeServlet", value = "/about-me")
public class AboutMeServlet extends HttpServlet {
    private String name;
    private String interests;

    public void init() {
        name = "Yining Xu";
        interests = "Cooking; Playing computer games";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>About Me</h1><br>");
        out.println("<p>" + name + "</p>");
        out.println("<p>" + interests + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        String lyrics = req.getParameter("lyrics");
        PrintWriter out = resp.getWriter();
        out.println(lyrics);
    }

    public void destroy() {
    }
}
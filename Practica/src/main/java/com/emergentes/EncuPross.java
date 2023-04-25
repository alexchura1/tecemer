package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EncuPross", urlPatterns = {"/EncuPross"})
public class EncuPross extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String sistOp = request.getParameter("sistOp");
        
        Encu encu = new Encu(nombre, sistOp);
        
        request.setAttribute("encu", encu);
        
        request.getRequestDispatcher("encuExit.jsp").forward(request, response);
    }


}

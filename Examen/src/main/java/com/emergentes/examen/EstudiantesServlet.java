/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.examen;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EstudiantesServlet")
public class EstudiantesServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Obtener la sesión
        HttpSession session = request.getSession();
        
        // Obtener la lista de estudiantes de la sesión
        ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) session.getAttribute("estudiantes");
        
        // Si la lista de estudiantes no existe, crear una nueva lista vacía
        if (estudiantes == null) {
            estudiantes = new ArrayList<Estudiante>();
        }
        
        // Agregar la lista de estudiantes al atributo "estudiantes" de la sesión
        session.setAttribute("estudiantes", estudiantes);
        
        // Redirigir a la página de estudiantes
        request.getRequestDispatcher("estudiantes.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

package com.emergentes.examen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NuevoEstudianteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("nuevo-estudiante.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int parcial1 = Integer.parseInt(request.getParameter("parcial1"));
        int parcial2 = Integer.parseInt(request.getParameter("parcial2"));
        int finalExamen = Integer.parseInt(request.getParameter("finalExamen"));

        EstudianteDAO estudianteDAO = new EstudianteDAO();

        Estudiante estudiante = new Estudiante(nombre, parcial1, parcial2, finalExamen);

        estudianteDAO.agregarEstudiante(estudiante);

        HttpSession session = request.getSession();
        session.setAttribute("mensaje", "Estudiante agregado correctamente");
        response.sendRedirect("listado-estudiantes.jsp");
    }

}

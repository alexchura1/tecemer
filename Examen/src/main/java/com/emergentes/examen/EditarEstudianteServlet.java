package com.emergentes.examen;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditarEstudianteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener el id del estudiante y la lista de estudiantes de la sesión
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter("id"));
        List<Estudiante> estudiantes = (List<Estudiante>) session.getAttribute("estudiantes");

        // Buscar el estudiante con el id especificado y actualizar sus datos
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                estudiante.setNombre(request.getParameter("nombre"));
                estudiante.setParcial1(Integer.parseInt(request.getParameter("parcial1")));
                estudiante.setParcial2(Integer.parseInt(request.getParameter("parcial2")));
                estudiante.setFinalExamen(Integer.parseInt(request.getParameter("finalExamen")));
                estudiante.setNota(calcularNota(estudiante));
                break;
            }
        }

        // Redirigir a la página principal
        response.sendRedirect("index.jsp");
    }

    private int calcularNota(Estudiante estudiante) {
        int promedioParciales = (estudiante.getParcial1() + estudiante.getParcial2()) / 2;
        int notaFinal = (int) Math.round(promedioParciales * 0.4 + estudiante.getFinalExamen() * 0.6);
        return notaFinal;
    }
}

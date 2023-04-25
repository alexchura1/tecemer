package com.emergentes.examen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EliminarEstudianteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener el ID del estudiante a eliminar
        int id = Integer.parseInt(request.getParameter("id"));
        
        // Obtener la sesión
        HttpSession session = request.getSession();
        
        // Obtener la lista de estudiantes de la sesión
        EstudianteDAO dao = (EstudianteDAO) session.getAttribute("dao");
        if (dao == null) {
            dao = new EstudianteDAO();
            session.setAttribute("dao", dao);
        }
        
        // Eliminar el estudiante de la lista
        dao.eliminarEstudiante(id);
        
        // Redirigir de vuelta a la página principal
        response.sendRedirect(request.getContextPath() + "/");
    }

}

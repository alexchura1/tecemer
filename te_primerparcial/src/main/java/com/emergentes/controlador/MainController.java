package com.emergentes.controlador;

import com.emergentes.modelo.Estudiante;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
        if (ses.getAttribute("listaest") == null) {
            ArrayList<Estudiante> listaux = new ArrayList<Estudiante>();
            ses.setAttribute("listaest", listaux);
        }
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) ses.getAttribute("listaest");
        String op = request.getParameter("op");
        String opcion = (op != null) ? request.getParameter("op") : "view";
        Estudiante estudiante = new Estudiante();
        switch (opcion) {
            case "nuevo":
                request.setAttribute("miEstudiante", estudiante);
                request.getRequestDispatcher("editar.jsp").forward(request, response);
                break;
            case "editar":
                estudiante = lista.get(buscarIndice(request, Integer.parseInt(request.getParameter("id"))));
                request.setAttribute("miEstudiante", estudiante);
                request.getRequestDispatcher("editar.jsp").forward(request, response);
                break;
            case "eliminar":
                lista.remove(buscarIndice(request, Integer.parseInt(request.getParameter("id"))));
                ses.setAttribute("listaest", lista);
                response.sendRedirect("index.jsp");
                break;
            case "view":
                response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) ses.getAttribute("listaest");
        Estudiante estudiante = new Estudiante();
        estudiante.setId(Integer.parseInt(request.getParameter("id")));
        estudiante.setNombres(request.getParameter("nombre"));
        estudiante.setP1(Integer.parseInt(request.getParameter("p1")));
        estudiante.setP2(Integer.parseInt(request.getParameter("p2")));
        estudiante.setEf(Integer.parseInt(request.getParameter("ef")));
        estudiante.setNota(estudiante.getP1() + estudiante.getP2() + estudiante.getEf());
        int idtemp = estudiante.getId();
        if (idtemp == 0) {
            int ultId = ultimoId(request);
            estudiante.setId(ultId);
            lista.add(estudiante);
        } else {
            lista.set(buscarIndice(request, idtemp), estudiante);
        }
        ses.setAttribute("listaest", lista);
        response.sendRedirect("index.jsp");
    }

    private int buscarIndice(HttpServletRequest request, int id) {
        HttpSession ses = request.getSession();
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) ses.getAttribute("listaest");
        int indice = 0;
        if (lista.size() > 0) {
            while (indice < lista.size()) {
                if (lista.get(indice).getId() == id) {
                    break;
                } else {
                    indice++;
                }
            }
        }
        return indice;
    }

    private int ultimoId(HttpServletRequest request) {
        HttpSession ses = request.getSession();
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) ses.getAttribute("listaest");
        int idaux = 0;
        for (Estudiante estudiante : lista) {
            idaux = estudiante.getId();
        }
        return idaux + 1;
    }
}

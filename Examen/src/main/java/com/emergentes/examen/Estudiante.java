package com.emergentes.examen;

public class Estudiante {
    private int id;
    private String nombre;
    private int parcial1;
    private int parcial2;
    private int finalExamen;
    private int nota;

    public Estudiante(String nombre, int parcial1, int parcial2, int finalExamen) {
        this.nombre = nombre;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.finalExamen = finalExamen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParcial1() {
        return parcial1;
    }

    public void setParcial1(int parcial1) {
        this.parcial1 = parcial1;
    }

    public int getParcial2() {
        return parcial2;
    }

    public void setParcial2(int parcial2) {
        this.parcial2 = parcial2;
    }

    public int getFinalExamen() {
        return finalExamen;
    }

    public void setFinalExamen(int finalExamen) {
        this.finalExamen = finalExamen;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

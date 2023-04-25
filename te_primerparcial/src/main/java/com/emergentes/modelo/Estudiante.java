package com.emergentes.modelo;

public class Estudiante {

    private int id;
    private String nombres;
    private int p1;
    private int p2;
    private int ef;
    private int nota;

    public Estudiante() {
        id = 0;
        nombres = "";
        p1 = 0;
        p2 = 0;
        ef = 0;
    }

    public Estudiante(int id, String nombres, int p1, int p2, int ef) {
        this.id = id;
        this.nombres = nombres;
        this.p1 = p1;
        this.p2 = p2;
        this.ef = ef;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}

package com.emergentes;

public class Encu {
    private String nombre;
    private String sistOp;

    public Encu(String nombre, String sistOp) {
        this.nombre = nombre;
        this.sistOp = sistOp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSistOp() {
        return sistOp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSistOp(String sistOp) {
        this.sistOp = sistOp;
    }

    @Override
    public String toString() {
        return "Encu{" + "nombre=" + nombre + ", sistOp=" + sistOp + '}';
    }
}

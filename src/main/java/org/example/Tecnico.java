package org.example;

public class Tecnico {
    private int codigo;
    private String nombre;
    private String apellido;
    private String estado;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Tecnico(int codigo, String nombre, String apellido, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

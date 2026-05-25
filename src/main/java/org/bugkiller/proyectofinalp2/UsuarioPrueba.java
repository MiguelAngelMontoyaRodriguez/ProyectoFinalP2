package org.bugkiller.proyectofinalp2;

public class UsuarioPrueba {

    private int id;
    private String nombre;
    private String correo;
    private String telefono;
    private String estado;

    public UsuarioPrueba(int id, String nombre, String correo, String telefono, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }
}

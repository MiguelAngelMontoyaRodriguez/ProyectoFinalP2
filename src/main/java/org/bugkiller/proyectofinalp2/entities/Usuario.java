package org.bugkiller.proyectofinalp2.entities;


import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int idUsuario;
    private String nombre;
    private String correoElectronico;
    private int numeroTelefonico;
    private String nombreUsuario;
    private String contrasena;


    private List<MetodoPago> metodosPago = new ArrayList<>();

    public Usuario(int idUsuario, String nombre, String correoElectronico, int numeroTelefonico,
                   String nombreUsuario, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
        this.nombreUsuario = nombreUsuario;
        this.contrasena= contrasena;


    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }
    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public List<MetodoPago> getMetodosPago() {
        return metodosPago;
    }
    public void setMetodosPago(MetodoPago metodosPago) {
        this.metodosPago.add(metodosPago);
    }
    public void removeMetodosPago(MetodoPago metodosPago){
        this.metodosPago.remove(metodosPago);
    }




}

package org.bugkiller.proyectofinalp2.entities;

public class MetodoPago {

    private String tipo; //tarjeta, Daviplata, Nequi
    private String numero;//tarjeta, cuenta
    private String titular; //Nombre dueño
    private String fechaExpiracion; //MM/YY
    private String  cvv; //Codigo seguridad tarjeta
    private String banco;

    public MetodoPago(){}

    public MetodoPago(String tipo, String numero, String titular, String fechaExpiracion,
                      String cvv, String banco) {
            this.tipo = tipo;
            this.numero = numero;
            this.titular = titular;
            this.fechaExpiracion = fechaExpiracion;
            this.cvv = cvv;
            this.banco = banco;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }
    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }

}

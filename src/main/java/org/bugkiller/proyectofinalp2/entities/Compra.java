package org.bugkiller.proyectofinalp2.entities;

public class Compra {
    private String evento;
    private double monto;

    public Compra(String evento, double monto){
        this.evento = evento;
    }
    public String getEvento(){
        return evento;
    }
    public double getMonto(){
        return monto;
    }
    @Override
    public String toString(String evento, double monto){
        System.out.println("Evento: "+evento+" Monto: $"+monto);
    }
}

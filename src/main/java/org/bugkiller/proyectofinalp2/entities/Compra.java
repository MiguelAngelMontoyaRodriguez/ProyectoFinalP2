package org.bugkiller.proyectofinalp2.entities;

public class Compra {
    private String evento;
    private double monto;

    public Compra(String evento, double monto) {
        this.evento = evento;
        this.monto = monto;  // FIX: faltaba asignar monto
    }

    public String getEvento() { return evento; }
    public double getMonto()   { return monto; }

    @Override
    public String toString() {  // FIX: firma correcta de toString
        return "Evento: " + evento + " | Monto: $" + monto;
    }
}

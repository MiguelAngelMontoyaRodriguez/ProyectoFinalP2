package org.bugkiller.proyectofinalp2.strategy;

public class PagoNequi implements EstrategiaPago {  // FIX: faltaba implements
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con Nequi");
    }
}

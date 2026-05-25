package org.bugkiller.proyectofinalp2.repository;

import org.bugkiller.proyectofinalp2.entities.Compra;

import java.util.ArrayList;
import java.util.List;

public class HistorialCompras {
    private List<Compra> compras= new ArrayList<>();

    public  void registrarCompras(Compra compra){
        compras.add(compra);
    }
    public double getTotalVentas() {
        return compras.stream().mapToDouble(Compra::getMonto).sum();
    }

    public int getCantidadCompras() {
        return compras.size();
    }

    public double getPromedio() {
        return compras.isEmpty() ? 0 : getTotalVentas() / compras.size();
    }

    public List<Compra> getCompras() {
        return compras;
    }
}

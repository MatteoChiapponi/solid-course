package main.java.SRP;

import java.time.LocalDate;

public class Factura {
    public String codigo;
    public LocalDate fechaEmision;
    public double importeFactura;
    public double importeTotal;

    private ICalculateDiscount ICalculateDiscount;
    private ICalculateIva ICalculateIva;

    // Método que calcula el total de la factura
    public void calcularTotal() {

        var calculatedDiscount = ICalculateDiscount.calculateDiscount(importeFactura);
        // Calculamos el IVA
        var calculatedIva = ICalculateIva.calculateIva(importeFactura, codigo);

        // Calculamos el total
        importeTotal = (importeFactura - calculatedDiscount) + calculatedIva;
    }
}

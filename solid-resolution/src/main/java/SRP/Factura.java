package main.java.SRP;

import java.time.LocalDate;

public class Factura {
    public String codigo;
    public LocalDate fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    // Método que calcula el total de la factura
    public void calcularTotal() {

        // Calculamos la deducción
        importeDeduccion = (importeFactura * porcentajeDeduccion) / 100;
        // Calculamos el IVA
        importeIVA = (float) (importeFactura * 0.16);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}

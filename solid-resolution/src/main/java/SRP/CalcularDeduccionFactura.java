package main.java.SRP;

public class CalcularDeduccionFactura implements ICalculateDiscount {
    private int porcentajeDeduccion;

    @Override
    public double calculateDiscount(double totalAmount) {

        double totalDiscount;
        if (totalAmount > 1000)
            totalDiscount = (totalAmount * porcentajeDeduccion + 3) / 100;
        else
            totalDiscount = (totalAmount * porcentajeDeduccion) / 100;
        return totalDiscount;
    }

    public CalcularDeduccionFactura(int porcentajeDeduccion) {
        this.porcentajeDeduccion = porcentajeDeduccion;
    }
}

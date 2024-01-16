package main.java.SRP;

public class CalcularIvaFacturaI implements ICalculateIva {
    private final double IVA = 0.18;

    @Override
    public double calculateIva(double totalAmount, String invoiceCode) {
        if (invoiceCode.equals("0"))
            return 0;
        return totalAmount * IVA;
    }
}

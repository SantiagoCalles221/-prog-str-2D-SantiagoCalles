public class ShippingCalculator {

    public double calcularSubtotal(double pesoKg, double distanciaKm, int tipoServicio, boolean zonaRemota){
        double costoBase = 0;
        if (tipoServicio == 1) {
            costoBase = 50;
        } else{
            costoBase = 90;
        }
        double costoPeso = pesoKg * 12;
                costoBase += costoPeso;
        double costoDistancia = 0;
        if (distanciaKm <= 50) {
            costoDistancia = 20;
        } else if (distanciaKm <= 200) {
            costoDistancia = 60;
        } else if (distanciaKm > 200){
            costoDistancia = 120;
        }
        costoBase += costoDistancia;
        if (zonaRemota == true)
            costoBase = costoBase + ( costoBase * .10);
                    return costoBase;
    }
    public double calcularIVA(double subtotal) {
        return subtotal * .16;
    }
    public double calcularTotal(double subtotal, double iva) {
        return subtotal + iva;
    }
}

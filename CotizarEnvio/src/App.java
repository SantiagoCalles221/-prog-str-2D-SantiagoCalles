import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ShippingCalculator calcEnvio = new ShippingCalculator();
        NumeroValido verificar = new NumeroValido();
        Ticket imprimir = new Ticket();
        double distancia = verificar.leerDoubleEnRango(sc, "Ingrese la distancia (0-2000):", 0, 2000);
        System.out.println("Ingrese el peso del paquete, el maximo son 50 Kg");
        double peso = verificar.leerDoubleEnRango(sc, "Ingrese el peso del paquete (.1 a 50 Kg", .1, 50);
        int servicio = verificar.leerIntEnRango(sc, "ingrese el tipo de servicio: 1 para estandar y 2 para express", 1, 2);
        boolean zonaRemota = verificar.leerBoolean(sc, "Indique si su envio sera a una zona remota:, (true/false)");
        double subtotal = calcEnvio.calcularSubtotal (peso, distancia, servicio, zonaRemota);
        double iva = calcEnvio.calcularIVA (subtotal);
        double total = calcEnvio.calcularTotal(subtotal, iva);
        imprimir.ticket ( distancia, peso, servicio, iva, subtotal, total, zonaRemota);

    }
}
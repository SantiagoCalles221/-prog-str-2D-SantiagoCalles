public class Ticket {
    public void ticket(double distancia, double peso, int servicio, double iva, double subtotal, double total,  boolean zonaRemota) {
        System.out.println("**********TICKET**********");
        System.out.println("**Tipo de servicio**");
        if (servicio == 1) {
            System.out.println("Estandar");
        } else {
            System.out.println("Express");
        }
        System.out.println("**Zona remota**");
        if (zonaRemota == true){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        System.out.println("**Peso**");
        System.out.println(peso + "Kg");
        System.out.println("**Distancia**");
        System.out.println(distancia + "Km");
        System.out.println("**Subtotal");
        System.out.printf( " $%.2f", subtotal  );
        System.out.println("**IVA**");
        System.out.printf(" $%.2f",subtotal * .16 );
        System.out.println("****Total****");
        System.out.printf(" $%.2f", total);


    }
}
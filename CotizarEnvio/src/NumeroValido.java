import java.util.Scanner;

public class NumeroValido {

    public int validarDistancia(Scanner scanner, String msg) {
        int valordistancia;
        while (true) {
            System.out.println(msg);
            if (valordistancia > 0 && valordistancia <= 2000) {
                return valordistancia;


            if (valordistancia > 2000) {
                System.out.println("Excede la distancia permitida (máx 2000)");
            } else {
                System.out.println("El dato debe ser mayor a 0");
            }
            } else {
            System.out.println("Error: el dato no es numérico");
            scanner.next();
        }
    }
}

    public int validarServicio(Scanner scanner, String msg) {
        int servicio;
        while (true) {
            System.out.println(msg);
            if (scanner.hasNextInt()) {
                servicio = scanner.nextInt();
                if (servicio > 0) {
                    if (servicio == 1) {
                        System.out.println("Ha elegido el servicio estandar");
                    }
                    if (servicio == 2) {
                        System.out.println("Ha elegido el servicio Express");
                    }return servicio;

                }
                System.out.println("El dato esta fuera de rango (1-n)");
                if (servicio > 2) {
                    System.out.println("Excede la distancia permitida");
                }
            } else {
                System.out.println("El dato no es numerico");
                scanner.next();

            }
        }
    }
    public double validarPeso(Scanner scanner, String msg){
        double peso;
    }
}

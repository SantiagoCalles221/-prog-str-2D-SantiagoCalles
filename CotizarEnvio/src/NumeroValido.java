import java.util.Scanner;

public class NumeroValido {

    public int leerIntEnRango(Scanner sc, String msg, int min, int max) {
        int valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();

                if (valor >= min && valor <= max) {
                    return valor;
            }

            if (valor> max) {
                System.out.println("Error: el valor no puede ser mayor a " + max);
            } else {
                System.out.println("El dato debe ser mayor o igual a" + min);
            }
            } else {
            System.out.println("Error: el dato no es numérico");
            sc.next();
        }
    }
}


   public double leerDoubleEnRango(Scanner sc, String msg, double min, double max) {
        double valor;
            while (true) {
                System.out.println(msg);
                if (sc.hasNextDouble()) {
                    valor = sc.nextDouble();
                    if (valor >= min && valor <= max) {
                        return valor;
                    }
                    if (valor > max) {
                        System.out.println("Error; el peso excede el maximo permitido: " + max + "kg");
                    } else {
                        System.out.println("Error: el peso debe ser de almenos: " + min + "kg");
                    }
                } else {
                    System.out.println("El dato no es numerico");
                    sc.next();
                }
            }
    }

    public boolean leerBoolean(Scanner sc, String msg) {
        boolean valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextBoolean()) {
                valor = sc.nextBoolean();
                return valor;
            } else {
                System.out.println("Error: debe escribir true or false");
                sc.next();
            }
        }
    }

}


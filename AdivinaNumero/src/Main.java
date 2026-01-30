//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Adivinarnumero {
    public static int NoNum;
    public static int RangoPast;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int max = 100;
        int min = 1;
        int secreto = random.nextInt(5) + 1;
        int intentos = 0;
        int limiteIntentos = 7;
        boolean gano = false;
        System.out.println(secreto);
        System.out.println("Adivina el numero secreto (1-100)");

        while(intentos < limiteIntentos) {
            int numero = obtenerNumeroValido(sc, "Intento: " + (intentos + 1), min, max);
            ++intentos;
            if (numero == secreto) {
                System.out.println("Eres un crack, ganaste en el intento " + intentos);
                gano = true;
                System.out.println("Valores no numericos utilizados: " + NoNum);
                System.out.println("Veces que te pasaste de rango: " + RangoPast);
                break;
            }

            if (numero > secreto) {
                System.out.println("El numero que estas buscando es menor a " + numero);
                ++RangoPast;
            } else {
                System.out.println("El numero que estas buscando es mayor a " + numero);
                ++RangoPast;
            }
        }

        if (!gano) {
            System.out.println("Perdiste, el numero secreto es " + secreto);
        }

    }

    public static int obtenerNumeroValido(Scanner sc, String mensaje, int min, int max) {
        while(true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
                if (valor >= min && valor <= max) {
                    return valor;
                }

                System.out.println("El valor ingresado esta fuera de rango (1-100)");
            } else {
                System.out.println("El dato ingresado no es numerico");
                sc.next();
                ++NoNum;
            }
        }
    }
}
import java.util.Scanner;

/**
 * Clase principal en la que se encuentra el menu para realizar operaciones
 * @author Santiago Calles
 * @version 1.0
 */
public class Main {
    /**
     * Menu el cual se controla desde consola.
     * @param args Argumentos de la linea de comandos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seleccion;

        do {
            System.out.println("---Menu---");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular area de un rectangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular el area de un circulo");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.print("Ingrese peso en kilogramos: ");
                    double p = sc.nextDouble();
                    System.out.print("Ingrese altura en metros: ");
                    double a = sc.nextDouble();
                    System.out.println("El IMC es: " + calculoIcm(p, a));
                    break;
                case 2:
                    System.out.println("Ingrese la medida de la base");
                    double b = sc.nextDouble();
                    System.out.println("Ingrese la medida de la altura");
                    double h = sc.nextDouble();
                    System.out.println("El area del rectangulo es: " + CalculoRectangulo(b, h));
                    break;
                case 3:
                    System.out.println("Ingrese los grados a convertir a farenheit");
                    double c = sc.nextDouble();
                    System.out.println("El resultado de la conversion a farenheit es: " + ConversionGrados(c));
                    break;
                case 4:
                    System.out.println("Ingrese el radio del circulo");
                    double r = sc.nextDouble();
                    System.out.println("El area del circulo es: " + CalculoCirculo(r));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (seleccion != 5);
    }
    /**
     * Calcula el Indice de Masa Corporal.
     * @param peso El peso en kilogramos.
     * @param altura La altura en metros.
     * @return El valor del IMC calculado.
     */
    public static double calculoIcm(double peso, double altura) {
        return peso / (altura * altura);
    }
    /**
     * Calcula el area de un rectangulo
     * @param base base del rectangulo
     * @param altura altura del rectngulo
     * @return area del rectangulo
     */
    public static double CalculoRectangulo(double base, double altura){
        return base * altura;
    }
    /**
     * Convierte la temperatura de grados celcius a farenheit
     * @param celcius grados celsius a convertir
     * @return temperatura en grados farenheit
     */
    public static double ConversionGrados (double celcius){
        return (celcius * 1.8) + 32;        }
    /**
     * Calcula el area de un circulo
     * @param  radio Radio del circulo
     * @return Area del circulo
     */
    public static double CalculoCirculo (double radio){
        return Math.PI *(Math.pow(radio, 2));
    }
}

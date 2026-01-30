import java.util.Scanner;
public class Main {
    public static int conversiones;
    public static int CelciusaFarenheit;
    public static int FarenheitaCelcius;
    public static int KmaMillas;
    public static int MillasaKm;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---Menu---");
            System.out.println("1. Convertir °C a °F ");
            System.out.println("2. Convertir °F a °C");
            System.out.println("3. Convertir millas a kilometros");
            System.out.println("4. Convertir kilometros a millas");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    conversiones++;
                    System.out.print("Ingrese los grados en °C");
                    double p = sc.nextDouble();
                    System.out.println("El resultado es: " + ConversionGradosCelius(p));
                    break;
                case 2:
                    conversiones++;
                    System.out.println("Ingrese los grados en °F");
                    double b = sc.nextDouble();
                    System.out.println("El resultado es: " + ConversionGradosFarenheit (b));
                    break;
                case 3:
                    conversiones++;
                    System.out.println("Ingrese las millas a convertir");
                    double c = sc.nextDouble();
                    System.out.println("El resultado de la conversion es: " + ConversionMillasKm (c));
                    break;
                case 4:
                    conversiones++;
                    System.out.println("Ingrese los kilometros a convertir");
                    double r = sc.nextDouble();
                    System.out.println("El resultado de la conversion es: " + ConversionKmMillas (r));
                    break;
                case 5:
                    System.out.println("Conversiones totales: "+ conversiones);
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);
    }
    public static double ConversionGradosCelius (double celcius){
        return (celcius * 1.8) + 32;        }
    public static double ConversionGradosFarenheit (double farenheit){
        return (farenheit - 32) * 5 / 9; }
    public static double  ConversionMillasKm (double millas) {
        return (millas * 1.609); }
    public static double ConversionKmMillas (double km) {
        return (km / 1.609); }

    }
}
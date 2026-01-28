import java.util.Scanner;
    public class ActividadSwitchCalculadora {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido, seleccione la opcion deseada");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            int opcion = sc.nextInt();
            double Resultado = 0;
            double Numero1, Numero2;
            switch (opcion) {
                case 1:
                    System.out.println("Opcion elegida: Suma");
                    System.out.println("Ingrese el primer valor a sumar");
                    Numero1= sc.nextDouble();
                    System.out.println("Ingrese el segundo valor a sumar");
                    Numero2 = sc.nextDouble();
                    Resultado = Numero1 + Numero2;
                    System.out.println("El resultado es: " + Resultado);
                        break;
                case 2:
                    System.out.println("opcion elegida: Resta");
                    System.out.println("Ingrese el primer valor a restar");
                    Numero1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo valor a restar");
                    Numero2 = sc.nextDouble();
                    Resultado = Numero1 - Numero2;
                    System.out.println("El resultado es: " + Resultado);
                        break;
                case 3:
                    System.out.println("opcion elegida: Multiplicacion");
                    System.out.println("Ingrese el primer valor a multiplicar");
                    Numero1= sc.nextDouble();
                    System.out.println("Ingrese el segundo valor a multiplicar");
                    Numero2 = sc.nextDouble();
                    Resultado = Numero1*Numero2;
                    System.out.println("El resultado es: " + Resultado);
                        break;
                case 4:
                    System.out.println("opcion elegida: Division");
                    System.out.println("Ingrese el primer valor a dividir");
                    Numero1= sc.nextDouble();
                    System.out.println("Ingrese el segundo valor a dividir");
                    Numero2 = sc.nextDouble();
                    if(Numero2==0)
                        System.out.println("No se puede dividir entre 0");

                        else
                        Resultado = Numero1/Numero2;
                    System.out.println("El resultado es: " + Resultado);
                        break;
                default:
                    System.out.println("Opcion invalida");
                        break;

            }

        }
    }


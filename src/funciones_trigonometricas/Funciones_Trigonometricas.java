package funciones_trigonometricas;

import java.util.Scanner;

public class Funciones_Trigonometricas {

    private static double valor;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String continuar;
        int opcion;
        do {
            System.out.println("Elige tu opcion"
                    + "\n1.Seno"
                    + "\n2.Coseno"
                    + "\n3.Tangente");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    calcularSeno();
                   break;
                case 2:

                    calcularCoseno();
                    break;
                case 3:

                    calcularTangente();
                    break;

                default:
                   System.out.println(opcion + " no es una opcion valida");
            }
          
           continuar = lector.next();
            continuar = continuar.toLowerCase();
        } while (continuar.equals("s"));
    }
    public static void Ingresar_Valores() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        valor = lector.nextDouble();
    }
    private static void calcularSeno() {
        double seno;
        Ingresar_Valores();
        seno = Math.sin(valor);
        System.out.println("Seno de " + valor + " = " + seno);
    }
    private static void calcularCoseno() {
        double coseno;
        Ingresar_Valores();
        coseno = Math.sin(valor) / Math.cos(valor);
        System.out.println("Tangente de " + valor + " = " + coseno);
    }
    private static void calcularTangente() {
        double tangente;
        Ingresar_Valores();
        tangente = Math.sin(valor) / Math.cos(valor);
        System.out.println("Tangente de " + valor + " = " + tangente);
    }
}

package Arrays;

import java.util.Scanner;

public class Main {

    public static int [] datos = new int[10];
    public static Scanner sc = new Scanner(System.in);
    final int MAXIMO = 10;

    public static void main(String[] args) {

        /*
         * Programa 1 que lea datos de teclado, los almacene en un array y a
         * continuación pinte en pantalla los elementos que ocupan las
         * posiciones pares y dicha posición Lectura y escritura (Solución:
         * Leer_Escribir_Array)
         */

        //vamos a leer 10 num por teclado
        leerNum(datos);

        //vamos a imprimir los numeros de las posiciones pares del array
        imprimir();


    }

    private static void imprimir(){
        for (int i=0; i< datos.length; i=i+2){
            System.out.println("El dato de la posición "+ i + " es: " + datos[i]);
        }
    }

    private static void leerNum(int[] datos) {

        for (int i = 0; i< Main.datos.length; i++){
            boolean error = true;
            try {
                System.out.println("Introduzca el dato de la posición");
                Main.datos[i]=sc.nextInt();
                error=false;
            }catch (Exception e){
                System.out.println("Introduxca datos numéricos sin decimales");
                error=true;

            }
        }
    }
}

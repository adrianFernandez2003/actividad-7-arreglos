import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo;
        arreglo = new int[20];


        System.out.println("este programa almacena 20 numeros enteros que se le asigne \n");

        for (int i=0; i<20; i++) {
            System.out.print("ingrese el numero " + (i+1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        System.out.println("\nlos numeros ingresados fueron: \n" + Arrays.toString(arreglo) + "\n");
        for (int i=0; i<20; i++){
            System.out.println("numero: " + arreglo[i] + "\t cuadrado: "+ (Math.pow(arreglo[i], 2)) + "\t cubo: " + (Math.pow(arreglo[i], 3)));
        }
    }
}
package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio3_2 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numVeces = 0;
        int numVerify = 0;

        do {

            System.out.printf("Introduce el numero de veces que quieres introducir numeros : ");
            numVeces = Integer.parseInt(teclado.nextLine());

        } while (numVeces <= 0);
        for (int i = 0; i <= numVeces; i++) {
            System.out.println("Introduce el numero");
            numVerify = Integer.parseInt(teclado.nextLine());

            if (numVerify % 2 == 0) {
                System.out.println(numVerify + " Es numero par ");
            } else {
                System.out.println(numVerify + " Es numero impar ");
            }
        }
        teclado.close();
    }

}

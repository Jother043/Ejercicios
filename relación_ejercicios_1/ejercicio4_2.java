package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio4_2 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int num = 0;
        int total=0;

        do {

            System.out.printf("Introduce un numero para calcular ");
            num = Integer.parseInt(teclado.nextLine());

        } while (num <= 0);

        for (int i = 1; i <= num; i++) {

            total = total + i;

        }
        System.out.println("es " + total);
        teclado.close();
    }
}

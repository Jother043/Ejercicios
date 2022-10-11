package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio10_2 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        int factorial = 1;

        System.out.println("Introduce un numero para clacular su factorial : ");
        num = Integer.parseInt(teclado.nextLine());

        for(int i = 1; i <= num; i++){
            factorial=factorial*i;
        }

        System.out.println("Factorial de " + num + " es " + factorial);

        teclado.close();
    }
}

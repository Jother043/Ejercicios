package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio2_2 {

    public static Scanner teclado = new Scanner(System.in);

    private static final int MAXIMO=10;

    public static void main(String[] args) {

        int num = 0;
        int total = 0;

        System.out.printf("Introduce el numero que quieres visualizar la tabla : ");
        num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i <= MAXIMO ; i++ ){
            total=num*i;
            System.out.println(num + "x" + i + "=" + total );
        }

        teclado.close();
    }
}

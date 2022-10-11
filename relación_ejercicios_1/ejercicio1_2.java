package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio1_2 {
    public static Scanner teclado = new Scanner(System.in);

    private static final int MAXIMO=100;
    private static final int MULTIPLO1=7;
    private static final int MULTIPLO2=13;

    public static void main(String[] args) {

        for(int i = 0 ; i <= MAXIMO; i++ ){

            if(i % MULTIPLO1 == 0){
                System.out.println(i + " es multiplo de "+  MULTIPLO1);
            }if (i % MULTIPLO2 == 0){
                System.out.println(i + " es multiplo de "+  MULTIPLO2);
            }

        }
        teclado.close();
    }
}

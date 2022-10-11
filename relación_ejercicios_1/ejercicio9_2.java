package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio9_2 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int suma = 0;
        int num1 = 0;

        System.out.printf("Introduce un numero para saber si es perfecto : ");
        num1 = Integer.parseInt(teclado.nextLine());

        for( int i = 1; i <= num1-1; i++){
            if(num1 % i == 0){
                suma = suma + i;
            }
        }
        if(num1 == suma){
            System.out.println("Numero es perfecto");
        }else{
            System.out.printf("Numero no es perfecto");
        }
        teclado.close();
    }
}

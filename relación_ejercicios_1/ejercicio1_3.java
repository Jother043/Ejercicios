package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio1_3 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int [] arEnteros = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 };
        int total = 0;
        for (int i = 0; i <= arEnteros.length-1 ;i++){
            if(arEnteros[i]%2==0){
                total = total + arEnteros[i];
                System.out.println(arEnteros[i]+" es un numero par ");
            }else {
                System.out.println(arEnteros[i]+" es un numero impar ");
            }
        }
        System.out.println("total de numeros pares " + total);
    }
}

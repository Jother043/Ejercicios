package relación_ejercicios_1;


import java.util.Scanner;

public class ejercicio7_2 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numRep = 0;
        int num = 0;
        int total=0;
        double media;
        int contador = 0;

        do {
            System.out.print("introduce la cantidad de números que vas a introducir números : ");
            numRep = Integer.parseInt(teclado.nextLine());
        }while (numRep < 1);

        for( contador = 1; contador <= numRep ; contador++){

            System.out.print("introduce el número que quieres introducir : ");
            num = Integer.parseInt(teclado.nextLine());
            total=total+num;
        }
        media =(double)total/(contador-1);

        System.out.print("la suma de los numeros es : " + total + " y la media de todos ellos : " + media );

        teclado.close();


    }


}
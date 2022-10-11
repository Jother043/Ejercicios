package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio5_2 {

    static public Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int num = 0 ;
        int contador = 0 ;

        do{

            System.out.println("Introduce un numero (negativo si quieres terminar) : ");
            num = Integer.parseInt(teclado.nextLine());
            contador ++;


        }while(num > 0);

        //aqui podemos ver el predecremento ya que resta directamente con un posdecremento coge el valor y despues lo resta

        System.out.printf("Los numeros positivos introducidos son " + --contador);

        teclado.close();
    }

}

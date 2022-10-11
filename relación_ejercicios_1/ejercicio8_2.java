package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio8_2 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 0; // Numero introducido por teclado.
        char sn;      // variable char en la que registraremos el S/N
        char snMayus;// variable en la que guardamos el s/n convertidos a mayuscula.
        int numMenor;// Variable que guarda el numero más pequeño.

        System.out.println("Introduce un numero : ");   // Pedimos el numero y asignamos fuera de cualquier bucle ya que si no siempre sera el ultimo numero introducido el que nos saldrá como menor.
        num1 = Integer.parseInt(teclado.nextLine());

        numMenor = num1;  // asignamos num1 a numMenor para deter un valor a comparar.

        do {       // hacemos un do en el que indicamos que mientras hayamos pulsado 's' ejecutara el bucle.

            do {    // mientras snMayus sea distinto de s y n dara un error y entrara de nuevo en el bucle.
                System.out.println("deseas seguir introduciendo numeros ? : ");
                sn = teclado.nextLine().charAt(0);
                snMayus = Character.toUpperCase(sn);

                if (snMayus != 'S' && snMayus != 'N') {
                    System.out.println("Error, introduce s/n. ");
                }

            } while (snMayus != 'S' && snMayus != 'N');

            if (snMayus == 'S') { // Indicamos  que si es s nos pedira otro numero.
                System.out.println("Introduce un numero : ");
                num1 = Integer.parseInt(teclado.nextLine());
            }

            if (num1 < numMenor) { // aqui es donde verificamos que numero es menor, si el numero que introduzcamos es menor que numMenor, numMenor coge el valor de num1 por tanto se convierte en el numero menor.
                numMenor = num1;
            }


        } while (snMayus == 'S');

        System.out.println("El numero menor es : " + numMenor); //Pintamos el numero menor.

        teclado.close(); // cerramos teclado.

    }

}


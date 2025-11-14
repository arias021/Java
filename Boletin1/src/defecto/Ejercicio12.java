package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio12 {

	public static void main(String[] args) {
		
	    //Escribir un programa que sirva como asistente para un juego de rol. Tu programa debería de
		//pedir por teclado el número de dados que se van a tirar y el número de caras de estos (4, 6,
		//8, 12, etc.) A continuación debería de hacer la tirada y mostrarla.


        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos dados quieres?: ");
        int dados = teclado.nextInt();

        System.out.print("Cuantas caras quieres?: ");
        int cara = teclado.nextInt();

        Random azar = new Random();

        for (int i = 1; i <= dados; i++) {
            int resultado = azar.nextInt(cara) + 1;
            System.out.println("Dado " + i + ": " + resultado);
        }

        teclado.close();
    }


}

package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio14 {

	public static void main(String[] args) {

		// Escribir un programa que nos pida dos números por teclado y genere un número
		// aleatorio
		// comprendido entre ambos. Por el momento no te preocupes de que el primer
		// número
		// siempre debería de ser menor que el segundo, simplemente no los metas en un
		// orden
		// incorrecto.

		Scanner teclado = new Scanner(System.in);
		Random azar = new Random();
		int num1, num2;
		System.out.print("Escribe un numero: ");
		num1 = teclado.nextInt();
		System.out.print("Escribe un numero: ");
		num2 = teclado.nextInt();
		int min, max;
		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		int aleatorio = azar.nextInt(max - min + 1) + min;
	System.out.println("El numero aleatorio entre " + min + " y " + max + " es: " + aleatorio + ".");
		teclado.close();

	}

}

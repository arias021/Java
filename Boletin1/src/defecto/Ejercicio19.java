package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio19 {

	public static void main(String[] args) {

		// Escribir un programa que pida un número por teclado y nos muestre sus
		// divisores

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número para ver sus divisores: ");
		int numero = teclado.nextInt();
		System.out.println("Los divisores de " + numero + " son:");
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

}

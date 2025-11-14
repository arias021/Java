package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EJercicio23 {

	public static void main(String[] args) {

		// Escribir un programa que pida por teclado un número al usuario y calcule si
		// es primo o no

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero y te digo si es primo o no");
		int numero = teclado.nextInt();
		
		teclado.close();
	}
}
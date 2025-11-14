package defecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {

	public static void main(String[] args) {

		// 5. Escribir un programa que pida por teclado un número al usuario y diga si
		// es par o impar

		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime un numero y te digo si es divisible a 3: ");
		int numero = teclado.nextInt();
		if (numero % 3 == 0) {
			System.out.println("El numero " + numero + " es divisible a 3");
		} else
			System.out.println("El numero " + numero + " no es divisible a 3");
		teclado.close();
	}

}

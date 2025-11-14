package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio21 {

	public static void main(String[] args) {
		
	//	Escribir un programa que pida por teclado un número al usuario y calcule si es primo o no
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		int numero = teclado.nextInt();
		if (numero % 2 == 0 )
			System.out.print("Es primo el numero: " + numero);
		else
			System.out.print("No es primo el numero " + numero);
		
		teclado.close();
	}
}
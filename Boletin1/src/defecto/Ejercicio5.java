package defecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//5. Escribir un programa que pida por teclado un número al usuario y diga si es par o impar
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime un numero y te digo si es par o impar: ");
		int numero = teclado.nextInt();
		if (numero%2==0) {
			System.out.println();
		System.out.println("Es par el numero: " + numero);
	}else
		
		System.out.println("Es impar el numero: " + numero);
 teclado.close();
	}

}

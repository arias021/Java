package defecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {

	public static void main(String[] args) {

		//Escribir un programa que pida un número por teclado al usuario que simule ser el precio de un artículo y escriba el resultado de aplicarle el IVA del 21%
	
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime un precio y te lo digo sin y con IVA: ");
		double precio = teclado.nextInt();
		System.out.println( "EEsto es lo que pagaras de IVA: " + precio*0.21);
		System.out.println( "Este es el precio sin IVA: " + precio);
		double precio1 = precio*0.21 + precio;
		System.out.println( "Este es el precio con IVA: " + precio1 );
		teclado.close();
	}

}

package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio15 {
	
	//Modificar el programa del punto anterior para que si el primer número que metemos es
	 //mayor que el segundo funcione correctamente. Es decir, si metemos en primer lugar el 50 y
	//en segundo el 10 nos debería de generar un número aleatorio entre el 10 y el 50 (y no entre el
	 //50 y el 10 que no tiene mucha lógica…)

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random azar = new Random();
		int num1, num2;
		System.out.println("Escribe un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Escribe un numero: ");
		num2 = teclado.nextInt();
		int min, max;
		if (num1 > num2) {
			min = num2;
			max = num1;
		} else {
			min = num1;
			max = num2;
		}
		int aleatorio = azar.nextInt(max - min + 1) + min;
		System.out.println("El numero aleatorio entre " + min + " y " + max + " es: " + aleatorio);
		teclado.close();

	}

}

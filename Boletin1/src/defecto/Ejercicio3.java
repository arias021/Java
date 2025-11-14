package defecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

	public static void main(String[] args) {
	//	3. Escribir un programa donde se muestren los 5 primeros números múltiplos de uno dado por el usuario (se introducirá por teclado)
	
		Scanner teclado = new Scanner(System.in);
		 int numero;

		 System.out.print("Escribe un numero: ");
		 numero = teclado.nextInt();
		 for (int i = 1; i <= 5; i++) {
		 System.out.println(numero*i);
teclado.close();
		 }
	}
}

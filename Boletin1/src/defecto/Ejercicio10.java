package defecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Escribir un programa que genere dos números aleatorios simultáneamente entre el 1 y el 6(simulando una tirada de dos dados)

		int inicio = 1;
		int fin = 6;
		for (int i = 0; i < 2; i++) {
			int dado = (int) (Math.random() * (fin - inicio + 1)) + inicio;
			System.out.println(dado);
		}
	}
}
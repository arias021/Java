package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio22 {

	public static void main(String[] args) {

		// Escribir un programa que genere un número primo aleatorio entre el 10.000.000
		// y el 50.000.000

		int inicio = 10000000;
		int fin = 50000000;
		for (int i = 0; i < 1; i++) {
			int dado = (int) (Math.random() * (fin - inicio + 1)) + inicio;
			System.out.println(dado);
		}
	}
}
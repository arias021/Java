package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio17 {

	// Escribir un programa que nos permita generar una quiniela. Para ello nos debe
	// generar
	// quince números aleatorios entre el 1 y el 3. Recuerda que los resultados
	// válidos son 1 X o 2,
	// así que si te sale un 3 lo que tienes que imprimir en pantalla es una X

	public static void main(String[] args) {

		Random Random = new Random();
		for (int i = 1; i <= 15; i++) {
			int a = Random.nextInt(3) + 1;
			if (a == 3) {
				System.out.println("x");
			} else
				System.out.println(a);
		}
	}
}

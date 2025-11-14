package defecto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
import java.util.Arrays;

public class PruebaArray {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numdado, numcara;
		do {
			System.out.println("Cuantos dados quieres tirar?: ");
			numdado = teclado.nextInt();
			System.out.println("Cuantos caras quieres?: ");
			numcara = teclado.nextInt();
		} while (numdado % 2 == 0 || numcara % 2 == 0);
		System.out.println(numdado);
		System.out.println(numcara);

	}

}

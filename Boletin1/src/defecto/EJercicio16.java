package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EJercicio16 {
	
	//Escribir un programa que genere seis números aleatorios entre el 1 y el 49 (simulando una
	//lotería primitiva). Por el momento no te preocupes de que algunos números puedan salir
	//repetidos. Ya resolveremos eso más adelante.

	public static void main(String[] args) {

		Random Random = new Random();
		for (int i = 1; i <= 6; i++) {
			int a = Random.nextInt(59) + 1;
			System.out.println(a);
		}

	}

}

package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Explicaion4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero entero de 4 cifras con al menos una diferencia: ");
		int entrada = -1;
		final int kaprekar = 6174;
		int contador = 0;
		try {
			entrada = teclado.nextInt();
		} catch (Exception e) {
			System.out.println("Eso no es un numero entero");
		} finally {
			teclado.close();
		}
		if (entrada != -1) {
			System.out.println("Has metido un numero entero, vamos alla...");
			String numTxt = Integer.toString(entrada);
			if (numTxt.length() != 4)
				System.out.println("Tu numero no tiene exactamente 4 cifras");
			else {
				boolean hayDiferencias = false;
				for (int i = 1; i < 4; i++)
					if (numTxt.charAt(0) != numTxt.charAt(i))
						hayDiferencias = true;
				if (hayDiferencias == false)
					System.out.println("Todos los digitos son iguales");
				else {
					System.out.println("No son iguales los numeros.");
					if (entrada == kaprekar)
						System.out.println("Tu numero es ya la constante de kaprekar");
					else {
						while (entrada != kaprekar) {
							contador++;
							int vector[] = new int[4];
							for (int i = 0; i < 4; i++)
								vector[i] = Character.getNumericValue(numTxt.charAt(i));
							Arrays.sort(vector);
							String Ascendente = "";
							String Descendente = "";
							for (int i = 0; i < 4; i++) {
								Ascendente = Ascendente + vector[i];
								Descendente = vector[i] + Descendente;
							}
							System.out.println("Ascendente = " + Ascendente);
							System.out.println("Descendente = " + Descendente);
							entrada = Integer.parseInt(Descendente) - Integer.parseInt(Ascendente);
							numTxt = Integer.toString(entrada);
							for( int i=numTxt.length(); i<4; i++)
							System.out.println(Descendente + " - " + Ascendente + " - " + entrada);
						}
						System.out.println("Comprobaciones terminadas.");
					}
					System.out.println("Has hecho " + contador + " interacciones para conseguirlo");
				}
			}
		}
	}
}

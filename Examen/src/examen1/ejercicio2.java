package examen1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio2 {

	public static void main(String[] args) {

		final double cambioPeso = 27.93;
		final double cambioRupia = 102.81;
		final double cambioFranco = 0.93;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la cantidad; ");
		String entrada = teclado.nextLine();
		teclado.close();
		char moneda = entrada.charAt(entrada.length() - 1);
		double cantidad = Double.parseDouble(entrada.substring(0, entrada.length() - 1));
		switch (moneda) {
		case 'P':
			double cambio = cantidad / cambioPeso;
			System.out.println(cantidad + "pesos cubanos equivalen a " + cambio + " euros");
			break;
		case 'R':
			break;
		case 'F':
			break;
		case 'E':
			break;

		}

	}

}

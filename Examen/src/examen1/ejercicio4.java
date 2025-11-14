package examen1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio4 {

	public static void main(String[] args) {
		String texto1 = "Examen 1T01";
		String texto2 = "Octubre-2025";
		int posicion = texto1.indexOf(" ");
		String uno = texto1.substring(posicion + 1);
		String tres = texto1.substring(0, posicion);
		posicion = texto2.indexOf("-");
		String dos = texto2.substring(posicion + 1);
		String cuatro = texto2.substring(0, posicion);
		int longitud = texto1.length() + texto2.length();
		String resultado = uno + "-" + dos + " " + tres + " " + cuatro + "(" + longitud + ")";
		System.out.println("Resultado: " + resultado);

	}

}

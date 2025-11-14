package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Explicacion5 {

	public static String creaLinea(int veces,char caracter) {
		String cadena = "";
		for (int i=0; i<veces;i++)
			cadena +=caracter;
		return cadena;
	}
	 public static void main(String[] args) {
			muestraNumero(5);
			int n = 6;
			String texto =creaLinea(5,'X');
			muestraNumero(n);
			System.out.println(texto);
			texto =creaLinea(10,'E');
		System.out.println(texto);
	}
	 public static void muestraNumero(int numero) {

	}
}

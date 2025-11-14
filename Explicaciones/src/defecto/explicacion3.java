package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class explicacion3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime un numero: ");
	int numero = teclado.nextInt();
	String textoNum = String.valueOf(numero);
	char cifras [] = new char[textoNum.length()];
	for(int i =0; i<textoNum.length();i++)
		cifras[i] = textoNum.charAt(i);
	
	Arrays.sort(cifras);
	
	String textoAscendente = "";
	for(int i =0; i<cifras.length;i++)
		textoAscendente += cifras[i];
	
	int numAscendente = Integer.parseInt(textoAscendente);
	System.out.println(numAscendente);
	
	String textoDescendente = "";
	for(int i =cifras.length-1; i>=0;i--)
		textoDescendente += cifras[i];
	
	int numDescendente = Integer.parseInt(textoDescendente);
	System.out.println(numDescendente);

	}

}

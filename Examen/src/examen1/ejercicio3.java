package examen1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio3 {

	public static void main(String[] args) {
		int vector [] = new int [10];
		System.out.print("Generando array:");
		for(int i=0; i<10; i++)
			vector[i] = (int)(Math.random()*50)+1;
		String texto = Arrays.toString(vector);
		texto = texto.replace("[","");
		texto = texto.replace("[","");
		System.out.println(texto);

		Scanner teclado = new Scanner(System.in);
		int numero;
		do {
			System.out.print("Introduce un numero del 1 al 50: ");
			numero = teclado.nextInt();
		} while(numero<1 || numero>50);
		int contador = 0;
		for(int elemento: vector)
		if ( elemento > numero)
			contador++;
	System.out.println("En el array aparecen "  + contador + " numeros mayores que el " + numero);	
		teclado.close();
				

	}

}

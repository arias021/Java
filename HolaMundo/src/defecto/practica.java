package defecto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la frase:");
		String frase = teclado.nextLine();
		System.out.println("Introduce la letra a conservar: ");
		String letra = teclado.nextLine();
		String fraseAhorcado = "";
	for(int i=0; i<frase.length(); i++)
		
		if(frase.charAt(i)== ' ' || frase.charAt(i) == letra.charAt(0))
			fraseAhorcado = fraseAhorcado + frase.charAt(i); 
		else
			fraseAhorcado = fraseAhorcado + '*';
	System.out.println("Resultado: " + fraseAhorcado);
	
	
	int contador = 0;
	boolean fraseTerminada = false;
	while(fraseTerminada=false);
	int contadorAsteriscos = 0;
	int contadorIntentos = 1;
	System.out.println("Introduce la letra a conservar: ");
	String letra1 = teclado.nextLine();
	contador++;
	String fraseNueva ="";
	
			
	teclado.close();
	for(int i=0; i<frase.length(); i++)
		if(frase.charAt(i)== letra.charAt(0)) {
			fraseNueva = fraseNueva + frase.charAt(i);
	contador++;
	}
		else
			fraseNueva = fraseNueva + fraseAhorcado.charAt(i);
	fraseAhorcado = fraseNueva;
	System.out.println("La letra" + letra + "aparece en" + contador + "ocasiones");
	System.out.println("Resultado: " + fraseAhorcado);
if(contadorAsteriscos==0) {
	fraseTerminada= true;
	System.out.println("Has necesitado" + contadorIntentos + "intentos");
	
}
		



	}

}

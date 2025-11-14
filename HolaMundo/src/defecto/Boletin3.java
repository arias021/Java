package defecto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boletin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 3
		// Scanner teclado = new Scanner(System.in);
		// String nombre = " ";
		// String apellido = " ";

		// System.out.println("Dime tu nombre");
		// nombre = teclado.nextLine();
		// System.out.println("Dime tu apellido");
		// apellido = teclado.nextLine();
		// teclado.close();
		// System.out.println(apellido + " , " + nombre);

//BOLETIN 4, 9
//Scanner teclado = new Scanner(System.in);
///		System.out.print("Escribe un texto: ");
//		String texto = teclado.nextLine();
///		System.out.print("Escribe un caracter: ");
//		String temporal = teclado.nextLine();
		// char caracter = temporal.charAt(0);
		/// teclado.close();
		// int contador = 0;
//		for(int i=0; i<texto.length(); i++)
//			if(texto.charAt(i) == caracter)
		// contador++;
///				System.out.println("El caracter " + caracter + " aparece en " + contador + " ocasiones");
		// System.out.print("Las posiciones en las que aparece son: ");
//		int contadorPosiciones = 0;
		// for(int i=0; i<texto.length(); i++) {
		// if (texto.charAt(i) == caracter) {
		// System.out.print(i + ", ");
		//
//	}
		/// }

		// BOLETIN 4, 2
		// boolean salir = false;
		// Scanner teclado = new Scanner(System.in);
		// while (salir == false) {
//			System.out.print("Escribe tu contraseña: ");
		// String contraseña = teclado.nextLine();
		// System.out.print("Confirma tu contraseña: ");
		// String contraseña1 = teclado.nextLine();
		// if (contraseña.compareTo(contraseña1) == 0) {
		// System.out.println("La contraseña coindicen");
//			salir = true;
//			}
//			else
///				System.out.println("Las contraseñas no coinciden. Intentalo de nuevo");
///		}
//		teclado.close();

		// Ejercicio 2 boletin 4
		// int veces = 10;
		// int num1 = 0;
		// int num2 = 1;
		// System.out.print("Los " + veces + " numeros de la sucesion de fibonacci: 0,
		// 1");
		// for (int i = 2; i <= veces; i++) {
		// int nuevoNumero = num1 + num2;
		// System.out.print(", " + nuevoNumero);
		// num1 = num2;
		// num2 = nuevoNumero;
/// Ejercicio 3 boletin 4
///
//	Scanner teclado = new Scanner(System.in);
		// int num1 = 0;
		// int num2 = 1;
		// System.out.print("Cuantoas veces quieres de fibbonacci?: ");
		// int veces = teclado.nextInt();
		// teclado.close();
		// System.out.print("Los " + veces + " numeros de la sucesion de fibonacci: 0,
		// 1");
//	for (int i = 2; i <= veces; i++) {
		// int nuevoNumero = num1 + num2;
		// System.out.print(", " + nuevoNumero);
		// num1 = num2;
		// num2 = nuevoNumero;
		// }

		// EJERCICIO 10 BOLETIN 4
		// Scanner teclado = new Scanner(System.in);
		// System.out.print("Introduce un texto con cifras y letras");
		// String texto = teclado.nextLine();
		// teclado.close();
		// System.out.println("Las cifras en ese texto son: ");
		// for(int i=0; i<texto.length(); i++) {
		// char caracter = texto.charAt(i);
		/// switch (caracter) {
		// case '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9':
		// System.out.print(caracter);
		// }
//		}

		// Ejercicio 6 boletin4

		// Scanner teclado = new Scanner(System.in);
//		System.out.print("Introduce un Pais de estos: Francia, Italia, Chile o Japon y te digo su capital: ");
		// String Francia = teclado.nextLine();
		// String Chile = teclado.nextLine();
//		String Italia = teclado.nextLine();
//		String Japon = teclado.nextLine();
		// if ( Francia == Francia) {
//		System.out.println("La capital de Francia es Paris");
		// } else if (Chile == Chile) {
		// System.out.print("La capital de Chile es Santiago de Chile");
		// } else if (Italia == Italia) {
		// System.out.print("La capital de Italia es Roma");
		// } else (Japon = Japon) {
		// System.out.print("La capital de Japon es Tokio");
		// teclado.close();
		// }
///	Scanner teclado = new Scanner (System.in);
//	int numero = teclado.nextInt();
///	teclado.close();
//	System.out.println("Los divisores de " + numero + " son: ");
//	for(int i=0; i<1; i++) {
//		 System.out.print(i);
		// }

	//	Scanner teclado = new Scanner(System.in);
	//	System.out.println("Escribe el DNI o NIF");
	//	String DNI = teclado.nextLine();
 	//String NIE = teclado.nextLine();
	//	if(DNI.matches("[0-9]{8}[S//-][A-Za-zÑñ]") == true)
	//	System.out.println("Es un DNI");
	// else if (NIE.matches("[XxYyZz][S//-][0-9]{7}") == true)
//		System.out.println("Es un NIE");
//	 else 
//		 System.out.println("No es ni DNI ni NIE");
	//	teclado.close();
		int numero = 1;
		for (int contador = 0; contador <50; contador++) {
		boolean esprimo;
		do {
			esprimo = true;
					int raiz = (int) Math.sqrt(numero) +1;
			for (int i= 2; i < raiz; i++) {
				if (numero % i == 0)
					esprimo = false;
			}
	if (esprimo ==false)
		numero++;
		} while (esprimo == false);
	double numeroraiz = Math.sqrt(numero);
	int cuadrado = numero * numero;
	int cubo = numero * numero * numero;
	System.out.println(numero + " - " + numero);
numero++;			
	}
}
}

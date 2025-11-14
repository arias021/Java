package defecto;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner teclado = new Scanner(System.in);

		// int tecla = 9;
		// while (tecla != 0) {

		// System.out.println("Escribe un numero entero, usa el 0 para salir");
		/// tecla = teclado.nextInt();
		/// System.out.println(tecla);
//
		// }

		// System.out.println("Fin del programa");
		//;
		// Scanner teclado = new Scanner(System.in);
		// System.out.println("Dime 3 palabras");

///teclado.close();
///
///
///
///
///
///ejercicio 4
	//	String texto = "Hola mundo";
	////	String Sinvocales = "";
	//	String minusculas = texto.toLowerCase();
	//			System.out.println(minusculas);
//for(int i=0;i<texto.length();i++) {
//	char c = texto.charAt(i);
	//if(c !='a' && c!='e' && c!='i' && c!='o' && c!='u')
	//	Sinvocales = Sinvocales + texto.charAt(i);
//		}
//Sinvocales = Sinvocales + minusculas;
//System.out.println(Sinvocales);
		//System.out.println("Cadena DNI" + DNI);
//	System.out.println("Cadena NIF" + NIF);
	
		//EJERCICIO 13/4
		
	//	Scanner teclado = new Scanner(System.in);
	//	System.out.print("Introduce un caracter: ");
	//	String caracter = teclado.nextLine();
	//	System.out.print("Introduce un numero de repeticiones ");
		//int repeticiones = teclado.nextInt();
	///	teclado.close();
		/////	
		//for(int i=0; i<repeticiones; i++) {
	//		for(int j=0; j<repeticiones; j++) {
		//	System.out.print(caracter);
	//	}
	//		System.out.println();
	//	}
	//ejercicio 9/2
		
	//	Scanner teclado = new Scanner(System.in);
////	System.out.println("Introduce el radio de tu circunferencia: ");
	//Como necesitamos decimales usamos double y no int
//	Double radio = teclado.nextDouble();
	//	calculamos longitud y area
//	Double longitud = 2*3.14159 * radio;
///	Double area = 3.12159 * radio * radio;
			//damos salida de los datos a consola
//System.out.println("La longitud de la circunferencia es: " + longitud);
//System.out.println("El area del circulo es: " + area);

//Para conseguir 5 cifras decimales
// 1- multiplicamos por 1 seguido de ceros
//longitud = 

//	teclado.close();
		
	
		Scanner teclado = new Scanner(System.in);
		boolean hemosAcabado = false;
		String patronNumerico = "[0-9]+";
		do {
			System.out.println("Introduce un numero total del 1 al 100 o FIN para salir: ");
			String entrada = teclado.nextLine();
			if(entrada.equals("FIN")) 
			hemosAcabado = true;
			else if (entrada.matches("[0-9)+") == true) {
				System.out.println("Es un numero entero");
				int numero = Integer.parseInt(entrada);
				if (numero >=1 && numero <=100) {
contador++
System.out.println("No esta entre el1 y el 100");
			} else
				System.out.println("Es otra cosa");
		} while (hemosAcabado == false);
			
		}
		
	}

}

package defecto;

import java.util.Random;
import java.util.Scanner;

public class ejerciciomalo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// EJERCICIO 1

		// for (int i = 1; i <= 10; i++ ) {
		// System.out.println(i);

		// EJERCICIO 2

		// for (int i = 2; i <= 50; i+=2 ) {
		// System.out.println(i);

		// EJERCICIO 3

		// Scanner teclado = new Scanner(System.in);
		// int numero;

		// System.out.println("Escribe un numero");
		// numero = teclado.nextInt();
		// for (int i = 1; i <= 5; i++) {
		// System.out.println(numero*i);

		// teclado.close();

		// EJERCICIO5

		// Scanner teclado; //
		// int numero;
		// teclado = new Scanner(System.in); //

		// System.out.println("Escribe un numero: ");
		// numero = teclado.nextInt();

		// if(numero%2==0)
		// System.out.println("el numero " + numero + " es par");
		// else
		// System.out.println("el numero" + numero + "es imparpar");
		// teclado.close();

		// EJERCICIO 4

		// Scanner teclado = new Scanner(System.in);
		// int numero;

		// System.out.println("Pon 7 y salen los multiplos de 7 hasta el 1000");
		// numero = teclado.nextInt();
		// for (int i = 1; i <= 1428; i++) {
		// System.out.println(7 * i);
		// System.out.println(multiplos de 7);

		// teclado.close();
		// }

		// EJERCICIO 6

		// Scanner teclado; //hemos definido el objeto teclado
		// int numero;
		// teclado = new Scanner(System.in); //hemos creado el objeto teclado

		// System.out.println("Escribe un numero: ");
		// numero = teclado.nextInt();

		// if(numero%3==0)
		// System.out.println("el numero " + numero + " es divisible de 3");
		// else
		// System.out.println("el numero " + numero + " no es divisible de 3");
		// teclado.close();
		// for (int i=3; i<101; i+=3);

		// EJERCICIO 9

//int inicio = 0;
//int fin = 50;
		// int dado = (int)(Math.random()*(50-0+1))+0;
//	System.out.println(dado);

		// EJERCICIO 10

		// int inicio = 1;
		// int fin = 6;
		// for(int i =0; i<2; i++) {
		// int dado = (int)(Math.random()*(final-inicio+1))+inicio;
//			System.out.println(dado);

		// EJERCICIO 7

		// Scanner IVA = new Scanner(System.in);

		// System.out.print("Introduce el precio del artículo: ");
		// double precio = IVA.nextDouble();

		// double iva = precio * 0.21;

		// double precioFinal = precio + iva;
		// IVA.close();

		// System.out.printf("+(21%%) IVA es: " + precioFinal);

		// EJERCICIO 8

		// Scanner teclado = new Scanner(System.in);

		// System.out.print("Introduce el importe total a pagar (en euros): ");
		// double importeTotal = teclado.nextDouble();

		// System.out.print("Introduce el número de meses para pagar: ");
		// int meses = teclado.nextInt();

		// if (meses <= 0) {
		// System.out.println("El número de meses debe ser mayor que cero.");
		// } else {

		// double cuotaMensual = importeTotal / meses;

		// System.out.printf("Debes pagar %.2f euros al mes durante %d meses.%n",
		// cuotaMensual, meses);
		// }

		// teclado.close();

		// EJERCICIO 11

		// int contador = 0;
		// int dado1, dado2;
		// do {
		// dado1 = (int) (Math.random() * 6) + 1;
		// dado2 = (int) (Math.random() * 6) + 1;
		// System.out.println(dado1 + " " + dado2);

		// } while (dado1 != dado2);

		// System.out.println("¡Dados iguales! Se han necesitado " + contador + "
		// tiradas.");

		// EJERCICIO 12

		// Scanner teclado = new Scanner(System.in);

		// System.out.println("cuantos dados quieres tirar?");
		// int numdados = teclado.nextInt();

		// System.out.println("Cuantas caras tiene cada dado?");
		// int caras = teclado.nextInt();

		// Random azar= new Random();
		// for (int i=1; i <=numdados; i++) {
		// int resultado = azar.nextInt(caras) + 1;
		// System.out.println("dado " + i + ": " + resultado);

//	}

		// Scanner teclado = new Scanner(System.in);

		/// System.out.println("cuantos dados quieres tirar?");
		// int numdados = teclado.nextInt();

		// System.out.println("Cuantas caras tiene cada dado?");
		// int numcaras = teclado.nextInt();

//		Random azar= new Random();
///		for (int i=0; i <=numdados; i++) {
		// int resultado = azar.nextInt(numcaras) + 1;
		// System.out.println("dado " + i + ": " + resultado);

		// if(numdados%3==0)
		// System.out.println("el numero " + numdados + " es par");
		// while (numdados%2 ==0)
		// System.out.println("error4");

		// teclado.close();

		// EJERCICIO 13

		// {
		// Scanner teclado = new Scanner(System.in);
		// int numdados;
		// int numcaras;

		// do {
		// System.out.println("¿Cuántos dados quieres tirar?");
		// numdados = teclado.nextInt();

		// System.out.println("¿Cuántas caras tiene cada dado?");
		// numcaras = teclado.nextInt();

		// if (numdados % 2 == 0 || numcaras % 2 == 0) {
		// System.out.println("¡Ambos números deben ser impares! Intenta de nuevo.");
		// }

		// } while (numdados % 2 == 0 || numcaras % 2 == 0);

		// Random azar = new Random();
		// for (int i = 1; i <= numdados; i++) {
		// int resultado = azar.nextInt(numcaras) + 1;
		// System.out.println("Dado " + i + ": " + resultado);
		// }

		// System.out.println("¡Perfecto! Has elegido " + numdados + " dados de " +
		// numcaras + " caras.");
		// }
//	}
//}

		// EJERCICIO 14

		// Scanner teclado = new Scanner(System.in);
		// Random azar = new Random();
		// int num1, num2;
		// System.out.println("Escribe un numero");
		// num1 = teclado.nextInt();
		// System.out.println("Escribe un numero");
		// num2 = teclado.nextInt();
		// int min, max;
		// if (num1 < num2) {
		// min = num1;
		/// max = num2;
		// } else {
		// min = num2;
		// max = num1;
		// }
		// int aleatorio = azar.nextInt(max - min + 1) + min;
		// System.out.println("El numero aleatorio entre " + min + " y " + max + " es: "
		// + aleatorio);
		// teclado.close();

		// EJERCICIO 15

		// Scanner teclado = new Scanner(System.in);
		// Random azar = new Random();
		// int num1, num2;
		// System.out.println("Escribe un numero");
		// num1 = teclado.nextInt();
		// System.out.println("Escribe un numero");
		// num2 = teclado.nextInt();
		// int min, max;
		// if (num1 > num2) {
		// min = num2;
		// max = num1;
		// } else {
		// min = num1;
		// max = num2;
		// }
		// int aleatorio = azar.nextInt(max - min + 1) + min;
		// System.out.println("El numero aleatorio entre " + min + " y " + max + " es: "
		// + aleatorio);
		// teclado.close();

		// EJERCICIO 16
		// Random Random = new Random();
		// for (int i = 1; i <= 6; i++) {
		// int a = Random.nextInt(59) + 1;
		// System.out.println(a);
		// }
		// EJERCICIO 17
		// Random Random = new Random();
		// for (int i = 1; i <= 15; i++) {
		// int a = Random.nextInt(3) + 1;
		// if (a == 3) {
		// System.out.println("x");
		// } else
		// System.out.println(a);

//EJERCICIO18
		// Random Random = new Random();
//	int contador=0;
		// int numero =0;

		// while (numero !=666) {
		// numero = Random.nextInt(1000) + 1;
		// contador++;
		// System.out.println(numero);
		// }

		// System.out.println("Faltan " + contador + " dias para que sea el
		// apocalipsis");

		// EJERCICIO 22
		// int inicio = 10000000;
		// int fin = 50000000;
		// for(int i =0; i<1; i++) {
		// int dado = (int)(Math.random()*(fin-inicio+1))+inicio;
		// System.out.println(dado);

		// EJERCICIO 21
		// String texto1 = "Hola mundo";
		// String texto2 = new String("Hola mundo cruel");
		// texto1 = texto1 + " cruel";
		// System.out.println(texto1);
		// texto1 = texto1.concat(" Bienvenido al Goya");
		// System.out.println(texto1.concat(texto1));
		// int precio = 55;
		// System.out.println("El precio es " + precio + " euros");
//	System.out.println(texto2,length());
//	System.out.println(texto2.charAt(3);
		/// for (int i = 0; i < texto2.length(); i++)
		// ;
		// System.out.println(texto2.charAt(1));
		// ;
		// System.out.println(texto2.toLowerCase());
		// System.out.println(texto2.toUpperCase());
		// String nombre1 = "Rodriguez";
		// String nombre2 = "Romero";
		// if (nombre1.compareTo(nombre2) == 0)
		// System.out.println("Son iguales");
//		else if (nombre1.compareTo(nombre2) > 0)
//			System.out.println(nombre1 + " va detras de " + nombre2);
//		else
		// System.out.println(nombre1 + " va delante de " + nombre2);
//		System.out.println(nombre1.substring(3));
//		System.out.println(nombre1.substring(3, 7));
//		System.out.println(nombre1.indexOf("z"));

//		String cadenaVacia = ""; //
//		String CadenaNula;
		// String cadenanula2 = null

		// if (cadenaVacia.isEmpty() == true)
		;
		// System.out.println("La cadena esta vacia");
		// if (cadenaVacia.equals("") == true)
		;
		/// System.out.println("La cadena esta vacia");//
		// if (cadenaVacia.compareTo("") == 0) //
		;
		// System.out.println("La cadena esta vacia");

		// String texto = "hola mundo cruel"; //
		/// System.out.println(texto.indexOf("h")); //0

		// System.out.println(texto.replace("o", "a")); // no lo guarda
		// texto= texto.replace("o", "a"); // para que lo guarde
		// System.out.println(texto);

		// Scanner teclado = new Scanner(System.in);
		// String letra;
		// System.out.println("Escribe tres letras");
		// letra = teclado.nextLine();
		// if (letra.length() != 3) {
		// }

		// Scanner teclado = new Scanner(System.in);
		// System.out.print("Introduce el primer número: ");
		// int num1 = teclado.nextInt();
		// System.out.print("Introduce el segundo número: ");
		// int num2 = teclado.nextInt();
		// int min, max;
		// if (num1 < num2) {
		// min = num1;
		/// max = num2;
		/// } else {
		/// min = num2;
		// max = num1;
		// }
		/// Random azar = new Random();
		// int aleatorio = azar.nextInt(max - min + 1) + min;
		// System.out.println("El número aleatorio entre " + min + " y " + max + " es: "
		// + aleatorio);
		// teclado.close();

		// EJERCICIO 19
		// Scanner teclado = new Scanner(System.in);
		// System.out.print("Introduce un número para ver sus divisores: ");
		// int numero = teclado.nextInt();
		// System.out.println("Los divisores de " + numero + " son:");
		/// for (int i = 1; i <= numero; i++) {
		// if (numero % i == 0) {
		// System.out.println(i);
		/// }
		// }
		// teclado.close();

		// Scanner teclado = new Scanner(System.in);
		// System.out.print("Pulsa P para jugar, C para configurar o X para salir: ");
		// String opcion = teclado.nextLine();
		// switch(opcion) {
		// case "P":
		// case "p":
		// System.out.println("Vamos a jugar partida nueva!");
		// break;
		// case "C":
		/// case "c":
		// System.out.println("Entrando en el menu de configuracion");
		// break;
		//// case "X":
		//// case "x":
		// System.out.println("Hasta luego Lucas!");
		/// break;
		// default:
		// System.out.println("Has elegido el 1 o un numero incorrecto");
		// }

		// Scanner teclado= new Scanner(System.in);
		/// System.out.println("Vamos a jugar partida nueva!");
		//// int numero = teclado.nextInt();
		// for (int i = 2; i <= numero; i++)f {
		// if (numero % i == 0) {
		// System.out.println(i);
		// }
		// }

		// EJERCICIO 12
		// int azar = (int) (Math.random() * 50) + 1;
		// System.out.println(azar);
		// Scanner teclado = new Scanner(System.in);
		// int intentos = 1;
		// intentos++;
		// boolean acertado = false;
		// while (!acertado) {
		// System.out.println("Adivina el numero entre 1 y 50");
		// int numero = teclado.nextInt();
		// if (numero < azar) {
		/// System.out.println("El numero es mayor");
		/// } else if (numero > azar) {
		// System.out.println("El numero es menor");
		/// } else {
		/// System.out.println("Has acertado!");
		// acertado = true;
		/// System.out.println("Lo has conseguido en " + intentos + " intentos");
		// }
		// }
////
		// System.out.println("El numero era " + azar);

		// EJERCICIO 14

	///	int azar = (int) (Math.random() * 50) + 1;
		//System.out.println(azar);
	//	Scanner teclado = new Scanner(System.in);
	///	int intentos = 1;
	///	intentos++;
	//	boolean acertado = false;
		///while (!acertado && intentos <= 5) {
		///	System.out.println("Adivina el numero entre 1 y 50");
		///	int numero = teclado.nextInt();
		/////	if (numero < azar) {
		//		System.out.println("El numero es mayor");
	///		} else if (numero > azar) {
	//			System.out.println("El numero es menor");
	///		} else {
	///			System.out.println("Has acertado!");
	//			acertado = true;
		///		System.out.println("Lo has conseguido en " + intentos + " intentos");
	///			System.out.println("Quieres jugar otra vez? (S/N)");
	///			String respuesta = teclado.next();
	//			if (respuesta.equalsIgnoreCase("S")) {
	//				azar = (int) (Math.random() * 50) + 1;
	///				intentos = 1;
	//				acertado = false;
	///			} else {
			//		System.out.println("Gracias por jugar. Hasta luego!");
			//	}
				
		//	}
		//}
		
		

	}
}

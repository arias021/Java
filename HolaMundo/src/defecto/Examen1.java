//ALBERTO ARIAS								PROGRAMACION							30/10/2025/JUEVES/OCTUBRE

package defecto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examen1 {

	public static void main(String[] args) {

		//// EJERCICIO 1
				Random Random = new Random();
		int inicio = 10000;
	int fin = 99999;
	int codigo1, codigo2, codigo3, codigo4, codigo5;
	codigo1 = Random.nextInt(fin-inicio+1)+10000;
	codigo2 = Random.nextInt(fin-inicio+1)+10000;
		codigo3 = Random.nextInt(fin-inicio+1)+10000;
		codigo4 = Random.nextInt(fin-inicio+1)+10000;
		codigo5 = Random.nextInt(fin-inicio+1)+10000;
		for (int i=0; i<4; i++)
			System.out.println(codigo1 + "-" + codigo2 + "-" + codigo3 + "-" + codigo4 + "-" + codigo5);
	//	while 
			
		//// EJERCICIO COMPLLETADO

		/// EJERCICIO 2

		// Scanner teclado = new Scanner(System.in);

		// double pesosCubanos = 27.93;
		// double rupias = 102.81;
		// double francosSuizos = 0.93;
		// double euro = 1.00;
		// System.out.print("Introduce la cantidad: ");
		// String Convertir = teclado.nextLine();
		// if(euro == rupias) {
		// System.out.println();
		//
		// }if else (euro == pesosCubanos){
		// }if else(euro == francosSuizos){
		// }
		// System.out.println(euro);

//		teclado.close();

		//// EJERCICIO NO TERMINADO

		/// EJERCICIO 3
	//	Scanner teclado = new Scanner(System.in);
	//	int numero = teclado.nextInt();
	//	int cantidad = 0;
	//	int vector[] = new int[cantidad];
	//	for (int i = 10; i<cantidad; i++)
	//		vector[i] = (int) (Math.random() * 50) + 1;
	//	Arrays.sort(vector);
	//	System.out.println("En el array aparecen " + numero + " mayores que el " + cantidad);
	//	teclado.close();
		//EJERCICIO NO TERMINADO

		/// EJERCICIO4

		// String texto1 = "Examen 1T01";
		// String texto2 = "Octubre-2025";
		// String texto3[] = new String [5];
		// texto3 [] = {"Examen", "1T01", "Octubre", "-", "2025"};
//		String texto3 = "1T01-2025 Examen Octubre";
		// System.out.println(texto3);

	}

}

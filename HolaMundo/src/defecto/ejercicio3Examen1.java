//ALBERTO ARIAS								PROGRAMACION							30/10/2025/JUEVES/OCTUBRE

package defecto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio3Examen1 {

	public static void main(String[] args) {
		
		
		///EJERCICIO 3
			Scanner teclado = new Scanner(System.in);
			int numero = teclado.nextInt();
			int cantidad = 0;
			int vector[] = new int[cantidad];
			for (int i = 10; i<cantidad; i++)
				vector[i] = (int) (Math.random() * 50) + 1;
			Arrays.sort(vector);
			System.out.println("En el array aparecen " + numero + " mayores que el " + cantidad);
			teclado.close();
			//EJERCICIO NO TERMINADO


	}

}

package defecto;

import java.util.Scanner;

public class explicacion2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double importe = 0;
		int personas = 0;
		try {
		System.out.print("Cuanto ha costado la cena? ");
		importe = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Cuantos habeis cenado? ");
		personas = teclado.nextInt();
		} catch(Exception e) {
			System.out.println("Ha ocurrido un error");
		}
		finally {
			System.out.println("Se ejecuta siempre. Haya o no excepcion");
		}
		teclado.close();
		if (importe != 0 || personas !=0) {
			double fin = importe/personas;
			System.out.printf("Tocais a %.2f € por cabeza", fin);	
		}else
			System.out.println("No se puede 0");
		//Es un especificador de formato para números decimales (float o double).
		//%.2f indica:
		//% → aquí va una variable numérica.
		//.2 → mostrar 2 cifras decimales.
	//	f → el número es de tipo float o double.
	
	
	}
}

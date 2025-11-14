package defecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio8 {

	public static void main(String[] args) {
		//8.Escribir un programa que reciba por teclado el importe de una cantidad a pagar en euros (puede tener decimales) y el número de meses que contamos para pagarla (tiene que ser un número entero) y nos devuelva el dinero que tendríamos que pagar cada mes. No aplicamos intereses de ningún tipo y redondeamos a dos decimales

		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime la cantidad: ");
double pago = teclado.nextDouble();
System.out.println("Dime en cuantos meses: ");
int meses = teclado.nextInt();
double total = pago/meses;
System.out.print("Pagarias en total: " + total + " en " + meses + " cuotas " );




teclado.close();
	}

}

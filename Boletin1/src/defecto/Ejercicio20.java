package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio20 {

	public static void main(String[] args) {

		// Escribir un programa que nos pida tres números por teclado en cualquier orden y nos los
		// muestre en pantalla ordenados de menor a mayor
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Introduce el primer número: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Introduce el segundo número: ");
		        double num2 = scanner.nextDouble();
		        System.out.print("Introduce el tercer número: ");
		        double num3 = scanner.nextDouble();
		        double menor, medio, mayor;

		        if (num1 <= num2 && num1 <= num3) {
		            menor = num1;
		            if (num2 <= num3) {
		                medio = num2;
		                mayor = num3;
		            } else {
		                medio = num3;
		                mayor = num2;
		            }
		        } else if (num2 <= num1 && num2 <= num3) {
		            menor = num2;
		            if (num1 <= num3) {
		                medio = num1;
		                mayor = num3;
		            } else {
		                medio = num3;
		                mayor = num1;
		            }
		        } else {
		            menor = num3;
		            if (num1 <= num2) {
		                medio = num1;
		                mayor = num2;
		            } else {
		                medio = num2;
		                mayor = num1;
		            }
		        }

		        System.out.println("Números ordenados de menor a mayor:");
		        System.out.println(menor + ", " + medio + ", " + mayor);

		        scanner.close();
	}
}
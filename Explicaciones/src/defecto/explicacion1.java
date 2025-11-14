package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class explicacion1 {

	public static void main(String[] args) {
		
		//Hacer que salgan x dados que pidas igual, ademas te diga las tiradas y el porcentaje que ha salido cada numero
		
Scanner teclado = new Scanner(System.in);
System.out.print("Dime cuantos dados vas a tirar: ");
		int contador = 0;
		int dados = teclado.nextInt();
		int resultados[] = new int [dados];
		int frecuencia[] = new int [7];
		boolean todosIguales = false;
		do {
			contador++;
		for( int i = 0; i<dados; i++) {
			int dado = (int) (Math.random() * 7) + 1;
			if  (dado == 7 || dado == 6)
				dado = 6;
			frecuencia[dado]++;
			resultados[i] = (dado);
			if(i == dados-1)
				System.out.println(dado);
			else
				System.out.print(dado + "-");
			teclado.close();
		
		}
		todosIguales = true;
		for(int j=1;j<dados; j++) {
			if(resultados[0]!=resultados[j])
			todosIguales = false;
		}
		}while (todosIguales == false);
		System.out.println("Has necesitado: " + contador + " tiradas para que salgan todos iguales");
		for(int k=1; k<7; k++)
			System.out.println("El numero " + k + " ha salido el " + (100*frecuencia[k])/(dados*contador) + "% de las veces");
		
		
		
	}
}

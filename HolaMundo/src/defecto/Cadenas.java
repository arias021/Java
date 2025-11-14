package defecto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {

		
int cantidad = 20;
int table [] = new int [cantidad];
for (int i=0; i<cantidad; i++)
	table [i] = (int)(Math.random()*50)+1;
Arrays.sort(table);
System.out.println("El menor es " + table[0] + "y el mayor es" + table[cantidad-1]);
for(int n: table)
	System.out.print(n + " , " );
System.out.println("\n#######");
for(int i=0; i<cantidad-1; i++)
if(table[1] == table[1+1])
	System.out.println("El elemento " + table[1] + "esta repetido con su contiguo");
		
		
	}
}

package defecto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Modificar el programa anterior para que tu programa tire dos dados de forma continuadahasta que el número que salga en ambos sea el mismo. En ese momento debería de parar laejecución e informarnos de cuantas tiradas ha tenido que hacer para llegar a ese resultado

		
		 int contador = 0;
		 int dado1, dado2;
		 do {
		 dado1 = (int) (Math.random() * 6) + 1;
		 dado2 = (int) (Math.random() * 6) + 1;
		 System.out.println(dado1 + " " + dado2);
		 contador++;
		 } while (dado1 != dado2);
	
		 System.out.println("¡Dados iguales! Se han necesitado " + contador + " tiradas.");
	}

}

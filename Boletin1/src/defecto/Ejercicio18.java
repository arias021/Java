package defecto;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		// Escribe un programa que genere números aleatorios entre el 1 y el 1000 sin parar y que sólo
		// se detenga cuando salga el 666. Los números que ha tenido que generar tu programa hasta
		// aparecer el 666 son los que restan para el apocalipsis. Tu programa debería de indicarlo con
		// un mensaje tétrico (¡Faltan 236 días para que se acabe todo! por ejemplo)
		
		 Random Random = new Random();
		int contador=0;
			 int numero =0;

			 while (numero !=666) {
			 numero = Random.nextInt(1000) + 1;
			 contador++;
			 System.out.println(numero);
			 }

			 System.out.println("Faltan " + contador + " dias para que sea el apocalipsis");
	}
}
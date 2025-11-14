package defecto;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

	//	13. Modifica el programa anterior para que no admita dados con un número de caras impares
	//	(¡no existen!). En el caso de meter un número impar de caras el programa debería de
	//	informarnos de que es erróneo y volver a preguntarnos por este dato.


        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos dados quieres?: ");
        int dados = teclado.nextInt();

        System.out.print("Cuantas caras quieres?: ");
        int cara = teclado.nextInt();

        Random azar = new Random();
        

		if(dados%3==0)
		 System.out.println("el numero " + dados + " es impar");
		 while (dados%2 ==0)
		 System.out.println("error444");


        for (int i = 1; i <= dados; i++) {
            int resultado = azar.nextInt(cara) + 1;
            System.out.println("Dado " + i + ": " + resultado);
        }

        teclado.close();
	}

}

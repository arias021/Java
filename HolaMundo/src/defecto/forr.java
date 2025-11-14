package defecto;

import java.util.Scanner;

public class forr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int i=1;
	//	while(i<8) {
	//		System.out.println(i);
		//	i++;
  //      Random random = new Random();

   //     int dado1 = random.nextInt(6) + 1;
   //     int dado2 = random.nextInt(6) + 1;

   //     System.out.println("Dado 1: " + dado1);
   //    System.out.println("Dado 2: " + dado2);
    //    System.out.println("Suma: " + (dado1 + dado2));
		Scanner teclado = new Scanner(System.in);
		String entrada ="";
		while (!entrada.equals("salir")) {
		    System.out.print("Escribe algo (o 'salir'): ");
		    entrada = teclado.nextLine();

		    if (entrada.equals("hola")) {
		        System.out.println("¡Hola! ¿Cómo estás?");
		    } else if (entrada.equals("gracias")) {
		        System.out.println("¡De nada!");
		    }
		}

    }
}
		





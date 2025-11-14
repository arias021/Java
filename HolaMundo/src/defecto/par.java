package defecto;

import java.util.Scanner;

public class par {
	public static void main(String[] args) {

		/// Scanner teclado; //hemos definido el objeto teclado
		// int numero;
		/// teclado = new Scanner(System.in); //hemos creado el objeto teclado

		// System.out.println("Escribe un numero: ");
		// numero = teclado.nextInt();

		// if(numero%2==0)
		// System.out.println("el numero " + numero + " es par");
		// else
		// System.out.println("error4");
		// teclado.close();
		// for (int i=4; i<101; i+=4)
		// System.out.println(i);
//	System.out.println("Dime una frase");
//	Scanner teclado = new Scanner(System.in);
		// String Texto = " ";
		// Texto = teclado.next();
		// String TextoPares = "" + Texto.charAt(0) + "";

///	for(int posicion=1; posicion<Texto.length(); posicion++) {
		// TextoPares = TextoPares +"-"+Texto.charAt(posicion);

		// }
//		System.out.println(TextoPares);
		
		//12.4 Escribe un programa que reciba por teclado una fecha en el formato DD/MM/YYYY. El programa debe de comprobar si la fecha es correcta teniendo en cuenta:Qué el formato sea el correcto Que la fecha sea totalmente válida teniendo en cuenta incluso los años que son bisiestos (aquellos que son divisibles entre cuatro).
		String fecha = "22/10/2024";
		boolean fechaCorrecta = true;
		if (fecha.length() != 10)
			fechaCorrecta = false;
		else if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/')
			fechaCorrecta = false;
		else {
			int dia = Integer.parseInt(fecha.substring(0,2));
			int mes = Integer.parseInt(fecha.substring(3,5));
			if(dia < 1 || dia > 31)
				fechaCorrecta = false;
			if(mes < 1 || mes > 12)
				fechaCorrecta = false;
		}
			if (fechaCorrecta == true)
				System.out.println("La fecha " + fecha + " es correcta");
			else
				System.out.println("La fecha " + fecha + " es incorrecta");

	}

}
char[] letrasAdivinadas = new char[palabraSecreta.length()];

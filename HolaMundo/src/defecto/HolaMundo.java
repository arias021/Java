package defecto;
import java.util.Scanner;


public class HolaMundo {

	public static void main(String[] args) {
		String texto = "Hola Mundo";
		texto = "";
		texto = "Hola" + " " + "mundo";
		boolean acertado = true;
		boolean encontrado = false;
		System.out.println(texto);
		System.out.println("HolaMundo"); // lo que sale en la consola
		// System.err.println("Bienvenidos todos"); error en rojo
		int curso = 1 + 1;
		int edadSegunda = 21;
		curso = curso + 3; // 2 + 3 = 5");
		curso += 3; // seria 8 5+3 = 8
		double precio = 4.5;
		float iva = 12; // no se puede poner coma
		float iiva = (float) 12.5;
		System.out.println(5 / 2);
		int x = 5;
		int y = 3;
		x++;
		// x - x +1
		// x += 1;
		y--;
		// y = y- 1;
		// y -= 1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x + x);
		System.out.println(y + y);
		System.out.println(x++);

		double sueldo = 11200;
		double neto = 0;
		// int sueldo = 995699;
		if (sueldo < 1000)

		{
			System.out.println("Tu sueldo es menor a 1.000");
			System.out.println("No pagas impuestos");
		} else if (sueldo <= 10000) {
			System.out.println("Tu sueldo es mayor a 1.000 pero menor a 10.000");
			System.out.println("Pagas 10% de impuestos");
			// System.out.println(1700*0.9);
			neto = sueldo - (sueldo * 10 / 100);
			System.out.println("Vas a cobrar: ");
			System.out.println(neto);
		} else // si no
		{
			System.out.println("TU sueldo es mayor a 10.000");
			System.out.println("Pagas 50% de impuestos");
			neto = sueldo - (sueldo * 50 / 100);
			System.out.println("Vas a cobrar: ");
			System.out.println(neto);
		}
		System.out.println("Gracias por usar nuestros servicios. Adios");
		for (int i=4; i<101; i+=4)
			System.out.println(i);
		Scanner teclado; //hemos definido el objeto teclado
        teclado = new Scanner(System.in); //hemos creado el objeto teclado
        
         System.out.println("Escribe tu nombre: ");
         String nombre = teclado.nextLine();
        System.out.println("Tu nombre es: + nombre");
     
        teclado.close();
        
     // EJERCICIO 19
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número para ver sus divisores: ");
        int numero = teclado.nextInt();
        System.out.println("Los divisores de " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        teclado.close();
        

	
	}
}

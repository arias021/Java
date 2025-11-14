package defecto;

public class valorentero {

	public static void main(String[] args) {
		
		String Textoentero = "33";
		String TextoCondecimales = "33.56";
		int entero = 42;		
		double textoCondecimales = 44.67;
		
		int num1 = Integer.parseInt(Textoentero);
		System.out.println(num1);
		
		double num2 = Double.parseDouble(TextoCondecimales);
		System.out.println(num2);

		String texto1 = String.valueOf(entero);
		System.out.println(texto1);
		
		String texto2 = String.valueOf(textoCondecimales);
		System.out.println(texto2);
		
		double num3 = (double)entero;
		int num4 = (int)textoCondecimales;
		System.out.println(num4);
		
		int num5 = (int)Math.round(textoCondecimales);
		System.out.println(num5);
		
		final double PI = 3.14159;
		double piRedondeado = Math.round(PI * 10000.0) / 10000.0;
		System.out.println(piRedondeado);
		
		double maximo = Math.max(539.8, 3);
		System.out.println(maximo);
		
		double minimo = Math.min(539.8, 3);
		System.out.println(minimo);
	}

}

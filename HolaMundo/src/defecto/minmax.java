package defecto;

public class minmax {

	public static void main(String[] args) {
		
		int[] numeros = {34, -5, 67, 0, 23, -89, 12, 45};
		
		int maximo = numeros[0];
		int minimo = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
		}
		
		System.out.println("El numero maximo es: " + maximo);
		System.out.println("El numero minimo es: " + minimo);

	}

}

package defecto;

import java.util.Scanner;

public class BuscaMInas {

    public static void main(String[] args) {
        int lados = 5;
        int minas = 5;
        boolean correcto = false;
        Scanner teclado = new Scanner(System.in);

        do {
            try {
                System.out.print("De cuanto es el tablero?: ");
                lados = teclado.nextInt();
                System.out.print("Cuantas minas vas a poner? ");
                minas = teclado.nextInt();
                if (minas < lados * lados)
                    correcto = true;
                else
                    System.out.println("No puedes poner tantas minas.");
            } catch (Exception e) {
                System.out.println("No has metido un numero entero.");
                teclado.nextLine(); // limpiar buffer
            }
        } while (!correcto);

        teclado.close();

        int[][] tablero = new int[lados][lados];
        colocarMinas(tablero, minas, lados);
        mostrarTablero(tablero, lados);
    }

    public static void mostrarTablero(int[][] tablero, int lados) {
        for (int j = 0; j < lados; j++) {
            for (int i = 0; i < lados; i++)
            	if(tablero)
                System.out.print(tablero[i][j] + " ");
            System.out.println();
        }
    }

    public static void colocarMinas(int[][] tablero, int minas, int lados) {
        int numMinas = 0;
        while (numMinas < minas) {
            int fila = (int) (Math.random() * lados);
            int columna = (int) (Math.random() * lados);
            if (tablero[fila][columna] == 0) {
                tablero[fila][columna] = 1;
                numMinas++;
            }
        }
    }
}


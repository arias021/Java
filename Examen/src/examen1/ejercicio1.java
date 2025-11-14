package examen1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio1 {

	public static void main(String[] args) {

		for (int k = 0; k < 4; k++) {
		for (int j = 0; j < 5; j++) {
		String segmento = "";
		for (int i = 0; i < 5; i++)	
		segmento += (int) (Math.random() * 10);
		System.out.print(segmento);
		if(j !=4)
System.out.print("-");
	}
		System.out.println();
		}
	}
}

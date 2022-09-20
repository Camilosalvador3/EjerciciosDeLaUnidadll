package paquetedeApps;

import java.util.Scanner;

public class IfElseCondicional {

	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Ingrese el Promedio de notas: ");
		int notas = lector.nextInt();
		
		if (notas <= 59) {
			System.out.println("Su promedio es: " + notas + " puntos ");
			System.out.println("Su rendimiento es Deficiente!");
		} else if (notas <= 70 ) {
			System.out.println("Su promedio es: " + notas + " puntos ");
			System.out.println("Su rendimiento es Regular!");
		} else if (notas <= 80) {
			System.out.println("Su promedio es: " + notas + " puntos ");
			System.out.println("Su rendimiento es Bueno!");
		} else if (notas <= 90) {
			System.out.println("Su promedio es: " + notas + " puntos ");
			System.out.println("Su promedio es Muy Bueno!");
		}else {
			System.out.println("Su promedio es: " + notas + " puntos ");
			System.out.println("Su rendimiento es Excelente!");
		}
		

	}

}

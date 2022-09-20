package paquetedeApps;

import java.util.Scanner;

public class SwitchSelectivo {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		double n1, n2, Resultado;
		System.out.println("Ingrese primer numero n1: ");
		n1 = lector.nextDouble();
		System.out.println("Ingrese primer numero n2: ");
		n2 = lector.nextDouble();
		System.out.println("Menu de Opciones: ");
		System.out.println("1-Sumar");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("5-Salir");
		System.out.println("Opción:");
		int op = lector.nextInt();
		switch (op) {
		case 1:
			Resultado = n1 + n2;
			System.out.println("La Suma es: " + Resultado);
			break;
		case 2:
			Resultado = n1 - n2;
			System.out.println("La Resta es: " + Resultado);
			break;
		case 3:
			Resultado = n1 * n2;
			System.out.println("La Multiplicación es: " + Resultado);
			break;
		case 4:
			Resultado = n1 / n2;
			System.out.println("La División ess: " + Resultado);
			break;
		case 5:
				System.out.println("Gracias por utilizar esta App!!");
				System.out.println("Hasta Pronto!!!");
				break;
		default:
			System.out.println("NO ES UNA OPCION VALIDA!!!");
			break;
		}
	}

}


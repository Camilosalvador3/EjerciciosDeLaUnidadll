package paquetedeApps;

import java.util.Scanner;

public class PedirDatosAlusuario {
 
	static Scanner lector = new Scanner(System.in);
	static Scanner otrolector = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Ingrese su nombre: ");
		String nombre = lector.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = lector.nextInt();
		
		System.out.println("Ingrese su salario: ");
		double salario = lector.nextDouble();
		
		System.out.println("Ingrese su género");
		String gen = otrolector.nextLine();
		char genero = gen.charAt(0);
		
		
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su edad es: " + edad);
		System.out.println("Su salario es: " + salario);
		System.out.println("Su género es: " + genero);
		
		

	}

}

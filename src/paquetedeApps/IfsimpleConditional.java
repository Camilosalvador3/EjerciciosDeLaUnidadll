package paquetedeApps;

import java.util.Calendar;
import java.util.Scanner;

public class IfsimpleConditional { 
		static Scanner lector = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Ingrese el año de su nacimiento: ");
			int ADN = lector.nextInt();
			int AA = Calendar.getInstance().get(Calendar.YEAR);
			int edad = AA-ADN;
			
			if (edad <= 18 ) {
				System.out.println("Su Edad es: " + edad + " Años ");
				System.out.println("No puede entrar a la Disco");
			}
			if (edad > 18) {
				System.out.println("Su Edad es: " + edad + "Años");
				System.out.println("Puede Ingresar a la Disco");
			}


	}

}

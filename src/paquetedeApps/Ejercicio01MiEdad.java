package paquetedeApps;
import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio01MiEdad {

	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese el año de su nacimiento: ");
		int ADN = lector.nextInt();
		int AA = Calendar.getInstance().get(Calendar.YEAR);
		int edad = AA-ADN;
		
		System.out.println("Su Edad es: " + edad + " Años ");

	}

}

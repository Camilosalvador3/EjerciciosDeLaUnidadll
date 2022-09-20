package paquetedeApps;

public class ConvertirEntreTiposDeDatos {

	public static void main(String[] args) {
		int edad = 18;
		double salario = 2500.5;
		boolean completado = false;
		
		//convertir a cadena 
		String nuevaEdad = String.valueOf(edad);
		String nuevoSalario = String.valueOf(salario);
		String nuevoCompletado = String.valueOf(completado);
		
		String rating = "3";
		//convertir a Entero 
		int nuevoRating = Integer.parseInt(rating);
		int otroSalario = (int) salario;
		
		//convertir a double 
		double otroRating = Double.parseDouble(rating);
		double otraEdad = (double) edad;
		
		System.out.println("Edad como entero: " + edad);
		System.out.println("Edad como cadena: " + nuevaEdad);
		System.out.println("Edad como double: " + otraEdad);
		System.out.println("Completado como boolean:" + completado);
		System.out.println("Completado como cadena: " + nuevoCompletado);
		System.out.println("Salario como double: " + salario);
		System.out.println("Salario como cadena: " + nuevoSalario);
		System.out.println("Salario como entero: " + otroSalario);
		System.out.println("Rating como cadena: " + rating);
		System.out.println("Rating como entero: " + nuevoRating);
		System.out.println("Rating como double: " + otroRating);
		
	}

}

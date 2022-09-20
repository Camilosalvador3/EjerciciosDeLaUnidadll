package paquetedeApps;

public class BreakYContinue {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(i); // vamos a imprimir los valores anteriores 
			if (i  == 10) {
				System.out.println("---");
				System.out.println(i);	
				break ;
				// si la condición if se cumple, Java ignora
				// el número, se ignorará todo el código que 
				// todo el código que sigue y termina la app
			}
					
		}
			
	}

}

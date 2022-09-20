package paquetedeApps;

public class CicloWhile {

	public static void main(String[] args) {
		int i = 100;
		while (i <= 50) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("No entró al ciclo While!");
		System.out.println("La App ha finalizado!");

	}

}

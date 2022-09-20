package paquetedeApps;

public class IncrementoYDecremento {

		/*
		 * 0- ()
		 * 1- --,++ antes -> ++ incremento, -- decremento 
		 * 2- ^
		 * 3- * y /
		 * 4- + y -
		 * 5- =
		 * 6- --,++ despues -> ++ incremento, -- decremento 
		 */
	
	public static void main(String[] args) {
		// notar la diferencia entre ++x y x++
		int x = 1;
		++x;
		System.out.println("x = " + x);
		System.out.println("x = " + x++);
		System.out.println("x = " + x);
		System.out.println(" ---------------- ");
		//Notar la diferencia entre --x y --
		x = 1;
		--x;
		System.out.println("x = " + x);
		System.out.println("x = " + x--);
		System.out.println("x = " + x);
		
		
		

	}

}

package paquetedeApps;

public class LogicaBooleana {

	public static void main(String[] args) {
		System.out.println("(3>1)? -> " + (3>1));
		System.out.println("(3>5)? -> " + (3>5));
		System.out.println("(3==3)? -> " + (3==3));
		//La negación (!) cambia el valor de verdad de la expresión
		System.out.println("(3!=3)? -> " + (3!=3));
		System.out.println("(3>1)? -> " + (3>1));
		System.out.println("(3<=3)? -> " + (3<=3));
		//Operación o (&&)
		//Resultado V si ambas condiciones son V
		System.out.println("((3>2) && (-1<0))? -> " + ((3>2) && (-1<0)));
		System.out.println("((3>5) && (-1<0))? -> " + ((3>5) && (-1<0)));
		//operación o (||)
		//Resultado V si por los menos una de las condiciones es V
		System.out.println("((3>5) || (-1<0))? -> " + ((3>5) || (-1<0)));
		System.out.println("((3>5) || (-1<0))? -> " + ((3>5) || (-1>0)));
		
	}

}

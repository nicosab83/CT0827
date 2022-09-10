package ejemplosJava;

public class Ejemplo_Metodo {

	public static void main(String[] args) {
		
		int resultado = suma(50,20);
		System.out.println(resultado);

		int resultado2 = suma(50,20,52); // Sobrecarga de metodos
		System.out.println(resultado2);
		
		String marca = carro(2);
		System.out.println(marca);
		
		System.out.println(carro(0));
		
	}
	
	// public = publico // static = que se lo puede invocar.
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {  // Sobrecarga de metodos
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		return cars[a];
	}
	
}

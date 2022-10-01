package ejemplosJava;

public class Ejemplo_IfAnidado {

	public static void main(String[] args) {

		int temperatura = 20;

		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("A la playa!");
			} else {
				System.out.println("A la montaña!");
			}
		} else {
			System.out.println("A descansar!");
		}

	}

}

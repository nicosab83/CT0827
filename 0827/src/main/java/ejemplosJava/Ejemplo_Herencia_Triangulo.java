package ejemplosJava;

public class Ejemplo_Herencia_Triangulo extends Ejemplo_Herencia_DosDimensiones {
	
	String estilo;
	
	double area() {
		return base * altura / 2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}

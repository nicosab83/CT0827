package ejemplosJava;

public class Ejemplo_Array2D {

	public static void main(String[] args) {
		int arr[][] = { { 4, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

		//System.out.println(arr[2][1]);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]); // print se hace sobre la misma linea, println salta linea
			}
			System.out.println();
		}
	}
}

package prova;

public class Prova {

	public static void main(String[] args) {
		int[] v2 = new int[5];
		int[] v = { 9, 7, 5, 3, 0 };
		System.out.println("El vector es: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		// System.out.println();

		int i = 0;
		while (i < 5 && v[i] != 0) {
			// while (v[i] != 0 && i < 5) { // Index 5 out of bounds for length 5
			i++;
		}
		if (v[i] == 0) {
			System.out.println("Hay algún 0");
		} else {
			System.out.println("No hay ningún 0");
		}

	}

}

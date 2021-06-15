
package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
	public static void main(String[] args) {

		int n = 5;
		int[][] array = new int[n][n];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(1000);
			}
		}

		System.out.println("Quadratic matrix: ");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%5d]", array[i][j]);
			}
			System.out.println();
		}

		System.out.println("\n" + "Elements that stand on the diagonal: ");

		for (int i = 0; i < n; i++) {
			System.out.printf("[%5d]", array[i][i]);
		}
	}
}
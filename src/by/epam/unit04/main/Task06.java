package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		int n, m;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Пожалуйста введите количество строк массива: ");
		n = scanner.nextInt();

		System.out.print("Пожалуйста введите количество столбцов массива: ");
		m = scanner.nextInt();

		int[][] array = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(12);
			}
		}

		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 7) {
					counter++;
				}
				System.out.printf("[%3d]", array[i][j]);
			}
			System.out.println();
		}

		System.out.println("Number of seven even: " + counter);

	}

}

// for example 5 x 5
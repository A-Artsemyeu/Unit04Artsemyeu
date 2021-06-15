package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		int n, m;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество строк массива: ");
		n = scanner.nextInt();

		System.out.print("Введите количество столбцов массива: ");
		m = scanner.nextInt();

		int[][] array = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(1000);
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%5d]", array[i][j]);
			}

			System.out.println();
		}

		System.out.println();

		int k = 0;
		int p = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == array[i][p]) {
					System.out.printf("[%5d]", array[i][j]);
				} else if (array[i][j] == array[k][j]) {
					System.out.printf("[%5d]", array[i][j]);
				}
			}

			System.out.println("\t");
		}

	}

}

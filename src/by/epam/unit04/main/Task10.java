package by.epam.unit04.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		int n;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите четное число: ");
		n = scanner.nextInt();
		if ((n % 2) == 0) {
			int[][] array = new int[n][n];

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (i == 0 || i == array.length - 1) {
						array[i][j] = 1;
					} else if (j == 0 || j == array[i].length - 1) {
						array[i][j] = 1;
					}
				}
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.printf("[%5d]", array[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
		else
			  System.out.println("Вы ввели нечетное число"); 
	}

}
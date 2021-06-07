package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		int array[], numberItem, temp;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива: ");
		numberItem = scanner.nextInt();

		array = new int[numberItem];

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d ", array[i]);
		}
		System.out.println();

		for (int j = 0; j < array.length; j++) {
			temp = array[j];
			int i = j - 1;
			for (i = j - 1; i >= 0; i--) {
				if (temp < array[i]) {
					array[i + 1] = array[i];
				} else {
					break;
				}

			}
			array[i + 1] = temp;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d ", array[i]);
		}
		System.out.println();
		scanner.close();

	}

}
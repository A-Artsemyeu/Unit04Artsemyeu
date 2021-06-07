package by.epam.unit04.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {

		boolean sorted = false;
		int temp;

		int[] array = new int[7];
		Random randNumber = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = randNumber.nextInt(1000);
		}

		System.out.println("Текущий массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d]", array[i]);
		}
		System.out.println();

		while(!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				}
			}
		}

		System.out.println("Массив, отсортированный по убыванию методом пузырька: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d]", array[i]);
		}
	}
}
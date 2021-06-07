package by.epam.unit04.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {

		int min, max, difference; 
		int str = 0;

		int[] array = new int[7];
		Random number = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = number.nextInt(1000);
		}

		System.out.println("Последовательность чисел: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d]", array[i]);
		}
		System.out.println();

		min = array[str];
		max = array[str];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		difference = max - min;
		
		System.out.println("Наименьшая длина числовой оси = " + difference);
	}
}
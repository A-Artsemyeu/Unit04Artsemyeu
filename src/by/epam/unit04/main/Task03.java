package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		int array[], sizeArray;
		int positive = 0, negative = 0, zeroItem = 0;

		Random rand = new Random();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите пожалуйста действительное число: ");
		sizeArray = scanner.nextInt();

		array = new int[sizeArray];

		for (int i = 0; i < sizeArray; i++) {
			array[i] = rand.nextInt(10000) - 700;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positive = ++positive;
			} else {
				if (array[i] == 0) {
					zeroItem = ++zeroItem;
				} else {
					negative = ++negative;
				}
			}
		}

		System.out.println("Количество положительных элементов: " + positive);
		System.out.println("Количество отрицательных элементов: " + negative);
		System.out.println("Количество нулевых элементов: " + zeroItem);

	}
}
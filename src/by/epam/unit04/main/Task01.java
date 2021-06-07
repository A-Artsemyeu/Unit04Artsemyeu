package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	  public static void main(String[] args) {

			int numbers[], array[], a;

			int indexForEvenNumbers = 0;

			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите длину массива числом: ");
			a = scanner.nextInt();
			numbers = new int[a];
			array = new int[a];

			System.out.println();
			Random rand = new Random();

			System.out.println("Масив: ");

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(100);
				System.out.println("numbers[" + i + "]= " + numbers[i]);
			}

			System.out.println();
			System.out.println("Массив из четных чисел:");

			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] % 2 == 0) {
					array[indexForEvenNumbers] = numbers[i];

					System.out.println("array[" + indexForEvenNumbers + "]= " + array[indexForEvenNumbers]);

					indexForEvenNumbers++;
					

					if (indexForEvenNumbers == 0) {
						System.out.println("Четных чисел в массиве нет");
					}

				}

			}
			scanner.close();
	  }
}


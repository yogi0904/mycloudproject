package Test;

import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7};

		randomize(arr);
	}

	static void randomize(int arr[]) {

		Random randomArray = new Random();

		for (int i = arr.length - 1; i > 0; i--) {

			int j = randomArray.nextInt(i + 1);

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
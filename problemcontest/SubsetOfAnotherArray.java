package problemcontest;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetOfAnotherArray {
	public static boolean checkSubset(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] == arr2[j]) {
				i++;
				j++;
			} else {
				return false;
			}
		}
		return i == arr1.length;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the first array:");
		int size = sc.nextInt();

		System.out.println("enter the size of the second array:");
		int size1 = sc.nextInt();

		int[] arr1 = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("enter the first ARRAY value:");
			arr1[i] = sc.nextInt();
		}

		int[] arr2 = new int[size1];

		for (int i = 0; i < size1; i++) {
			System.out.print("enter the second ARRAY value:");
			arr2[i] = sc.nextInt();
		}

		if (checkSubset(arr2, arr1)) {
			System.out.println("arr2 is a subset of arr1");
		} else {
			System.out.println("arr2 is not a subset of arr1");
		}
	}
}

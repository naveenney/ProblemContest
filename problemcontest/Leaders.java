package problemcontest;

import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter the value:");
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		int max = arr[size - 1];

		for (int i = size - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				list.add(arr[i]);
			}

		}
		list.add(arr[size - 1]);
		System.out.println("LEADERS OF THE ARRAY:");
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

}

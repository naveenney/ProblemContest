package problemcontest;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllTheZerosToEndOfTheArray {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter the value:");
			arr[i] = sc.nextInt();
		}
		
		int i=0;
		
		for(int j=0;j<size;j++)
		{
			if(arr[j]!=0)
			{
				arr[i]=arr[j];
				i++;
			}
		}
		
		while(i<size)
		{
			arr[i]=0;
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	

}

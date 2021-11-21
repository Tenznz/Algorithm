package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort {
	Scanner sc = new Scanner(System.in);

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	private int[] input() {
		int[] arr = new int[10];
		int i = 0;
		while (i < 10) {
			arr[i] = sc.nextInt();
			i++;
		}
		return arr;
	}
	void display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println("Enter ten number:");
		Scanner sc = new Scanner(System.in);

		int arr[] = bubbleSort.input();
		bubbleSort.bubbleSort(arr);
		System.out.println("Sorted array");
		bubbleSort.display(arr);
	}


}

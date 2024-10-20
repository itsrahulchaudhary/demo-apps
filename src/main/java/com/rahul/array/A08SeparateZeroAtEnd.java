package com.rahul.array;

public class A08SeparateZeroAtEnd {

	public static void main(String[] args) {
		int arr[] = { 2, 0, 4, 1, 0, -3, 0, 8 };
		separateZeroAtEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void separateZeroAtEnd(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
	}

}

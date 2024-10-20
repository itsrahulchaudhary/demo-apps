
package com.rahul.test;

public class Solution2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 7, 8, 9, 9, 9, 11 };
		int n = 10;
		int target = 9;
		System.out.println(lowerBound(arr, n, target));
	}
	
	 

	public static int lowerBound(int arr[], int n, int target) {
		int low = 0;
		int high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= target) {
				high = mid - 1;
				ans = mid;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
}

package com.sinsoft.suanfa;

public class ErFen {

	public static void main(String[] args) {
		// 对象数组
		int[] arr = { 9, 10, 11, 1, 2, 3, 4, 5, 6, 7, 8 };
		// 要找的值
		int search = 11;
		changeIndex(arr);
		for (int syso = 0; syso < arr.length; syso++) {
			System.out.print(arr[syso] + " ");
		}

		String a = "";
		System.out.println("返回的下标为：" + searchIndex(arr, search));
		
	}

	public static int searchIndex(int[] arr, int a) {
		int per = 0;
		int last = arr.length - 1;
		int m = 0;
		while (per <= last) {
			m = (per + last) / 2;
			if (arr[m] == a) {
				return m;
			} else if (arr[m] < a) {
				per = m + 1;
			} else if (arr[m] > a) {
				last = m - 1;
			} else {
				return -1;
			}
		}
		return -1;
	}

	public static int[] changeIndex(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					int te = arr[i];
					arr[i] = arr[j];
					arr[j] = te;
				}
			}
		}
		return arr;
	}

}

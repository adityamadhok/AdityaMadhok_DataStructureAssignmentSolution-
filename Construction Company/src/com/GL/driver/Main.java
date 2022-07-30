package com.GL.driver;

import java.util.Stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stackOfFloor = new Stack<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of floors:");
		int n = sc.nextInt();
		int x[] = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			System.out.println("enter the floor size given on the day: " + i);
			int m = sc.nextInt();
			x[m] = i;
		}
		int j = n;

		System.out.println("The order of construction is :");
		for (int k = 1; k <= n; k++) {

			System.out.println("Day " + k + " :");
			while (j >= 1 && x[j] <= k) {
				stackOfFloor.push(j);
				j--;
			}

			while (!stackOfFloor.isEmpty()) {
				System.out.println(stackOfFloor);
				stackOfFloor.clear();
			}
		}

	}

}

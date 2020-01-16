package com.sid.DAA;

import java.util.Scanner;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int p[] = new int[10];
		int w[] = new int[10];
		int total = 0, temp, n, W, i;
		int a[] = new int[10];
		System.out.println("Enter number of items:");
		n = input.nextInt();
		System.out.println("Enter the weight of knapsack:");
		W = input.nextInt();
		System.out.println("Enter the price and weight of items:");
		for (i = 0; i < n; i++) {
			System.out.println("Price of item ");
			p[i] = input.nextInt();
			System.out.println("Weight of item  ");
			w[i] = input.nextInt();
		}

		for (i = 0; i < n; i++) {
			a[i] = p[i] / w[i];
		}
		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					temp = w[i];
					w[i] = w[j];
					w[j] = temp;
					temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			if (w[i] > W)
				break;
			else {
				total = total + p[i];
				W = W - w[i];
			}
		}
		if (i < n)
			total = total + (a[i] * W);
		System.out.println("The maximum value is: "+total);
		input.close();

	}

}

package com.sid.DAA;

import java.util.Scanner;

public class heap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int heap[] = new int[10];
		int number, c, root, temp;
		System.out.println("Enter number of elements:");
		number = sc.nextInt();
		System.out.println("Enter the elements:");
		for (int i = 0; i < number; i++) {
			heap[i] = sc.nextInt();
		}

		for (int i = 1; i < number; i++) {
			c = i;
			do {
				root = (c - 1) / 2;
				if (heap[root] < heap[c]) {
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				c = root;
			} while (c != 0);

		}
		System.out.println("Heap array:");
		for (int i = 0; i < number; i++) {
			System.out.println(heap[i]);
		}

		for (int i = number - 1; i >= 0; i--) {
			temp = heap[0];
			heap[0] = heap[i]; /* swap max element with rightmost leaf element */
			heap[i] = temp;
			root = 0;
			do {
				c = 2 * root + 1; /* left node of root element */
				if ((heap[c] < heap[c + 1]) && c < i - 1)
					c++;
				if (heap[root] < heap[c] && c < i) /* again rearrange to max heap array */
				{
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				root = c;
			} while (c < i);

		}

		System.out.println("The Sorted Array :");
		for (int i = 0; i < number; i++) {
			System.out.println(heap[i]);
		}
		sc.close();
	}
}

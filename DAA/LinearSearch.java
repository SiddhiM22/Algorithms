package com.sid.DAA;

import java.util.Scanner;

public class LinearSearch {

	void print(int arr[]) {
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"");
		}
	}
	
	void linearSearch(int arr[], int key) {
		int found=0,position=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				found++;
				position=i+1;
			}
		}
		 if(found==0) 
			 System.out.println("Element not found!!");
		 else {
			 System.out.println("Element found!!");
		     System.out.println("position: " + position);}
	}
	public static void main(String[] args) {
		 int arr[]= {1,4,2,67,55,99,0,78,55,12,34};
		 int key;
		 Scanner obj=new Scanner(System.in);
		 LinearSearch ls= new LinearSearch();
		 System.out.println("The array is:");
		 ls.print(arr);
		 System.out.println("Enter the element you want to search");
		 key=obj.nextInt();
		 ls.linearSearch(arr, key);
		 obj.close();
		 
	}

}

package com.sid.DAA;

import java.util.Scanner;

class BinarySearch { 
     
    int binarySearch(int arr[], int key) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == key) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < key) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        
        return -1; 
    } 
    void print(int arr[]) {
    	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"");
		}
	}
    
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        Scanner input=new Scanner(System.in);
        int arr[] = { 2,3,4,10,40,45,11,23,90,200 }; 
        System.out.println("THe array is:");
        ob.print(arr);
      
        System.out.println("Enter the element you want to search:");
        int key=input.nextInt();
        int result = ob.binarySearch(arr, key); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
        input.close();
    } 
} 
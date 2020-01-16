package com.sid.DAA;

public class SelectionRecursion {
	static int minIndex(int a[], int i, int j) 
    { 
        if (i == j) 
            return i;       
        // Find minimum of remaining elements 
        int k = minIndex(a, i + 1, j); 

        return (a[i] < a[k])? i : k; 
    } 
    static void recurSelectionSort(int a[], int n, int index) 
    { 

        if (index == n) 
           return; 
        int k = minIndex(a, index, n-1); 
        if (k != index){ 
           // swap 
           int temp = a[k]; 
           a[k] = a[index]; 
           a[index] = temp; 
        } 
        
        recurSelectionSort(a, n, index + 1); 
    } 
 
    public static void main(String args[])  
    { 
        int arr[] = {3,34,56,12,32,44,77,99,6,100,21}; 
       System.out.println("Given array:");
       for (int i = 0; i< arr.length; i++) 
           System.out.print(arr[i] + " "); 
       System.out.println(" ");
       recurSelectionSort(arr, arr.length, 0); 
       System.out.println("Sorted array:");
        for (int j = 0; j< arr.length; j++) 
            System.out.print(arr[j] + " "); 
    } 
}

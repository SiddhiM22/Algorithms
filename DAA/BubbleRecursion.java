package com.sid.DAA;

import java.util.Arrays;

public class BubbleRecursion {
	static void bubbleSort(int arr[], int n) 
    { 
        
        if (n == 1) 
            return; 
       
         
       
        for (int i=0; i<n-1; i++) 
            if (arr[i] > arr[i+1]) 
            { 
                // swap arr[i], arr[i+1] 
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
       
        
        bubbleSort(arr, n-1); 
    } 
      
    
    public static void main(String[] args) 
    { 
        int arr[] = {64,55,100,99,54,12,1,4,33,76,54}; 
       
        bubbleSort(arr, arr.length); 
          
        System.out.println("Sorted array : "); 
        System.out.println(Arrays.toString(arr)); 
    } 
}

package com.sid.DAA;

import java.io.*; 
  
public class AssemblyLine  
{ 
    static int NUM_LINE = 2; 
    static int NUM_STATION = 4; 
      
    // Utility function to find minimum of two numbers 
    static int min(int a, int b)  
    {  
        return a < b ? a : b;  
          
    } 
      
    static int carAssembly(int a[][], int t[][], int e[], int x[]) 
    { 
        int T1[]= new int [NUM_STATION]; 
        int T2[] =new int[NUM_STATION] ; 
        int i; 
      
        // time taken to leave first station in line 1 
        T1[0] = e[0] + a[0][0];  
          
        // time taken to leave first station in line 2 
        T2[0] = e[1] + a[1][0]; 
      
        // Fill tables T1[] and T2[] using  
        // the above given recursive relations 
        for (i = 1; i < NUM_STATION; ++i) 
        { 
            T1[i] = min(T1[i - 1] + a[0][i],  
                    T2[i - 1] + t[1][i] + a[0][i]); 
            T2[i] = min(T2[i - 1] + a[1][i],  
                    T1[i - 1] + t[0][i] + a[1][i]); 
        } 
      
        // Consider exit times and retutn minimum 
        return min(T1[NUM_STATION-1] + x[0],  
                    T2[NUM_STATION-1] + x[1]); 
    } 
      
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int a[][] = {{4, 5, 3, 2}, 
                    {2, 10, 1, 4}}; 
        System.out.println("Assembly time:");
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
        int t[][] = {{0, 7, 4, 5}, 
                    {0, 9, 2, 8}}; 
        System.out.println("Transfer time:");
        for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.println(t[i][j]);
			}
		}
        int e[] = {10, 12};
        System.out.println("Entry time:");
        for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
        int x[] = {18, 7}; 
        System.out.println("Exit time:");
        for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
        
      System.out.println("Minimum time:");
        System.out.println(carAssembly(a, t, e, x));     
      
    } 
}
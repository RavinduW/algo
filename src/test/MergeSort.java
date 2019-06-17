/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ravindu Weerasinghe
 */
public class MergeSort {
    
    void merge(int arr[], int l,int m,int r){
        
        //get the sizes of 2 sub arrays
        int n1 = m-l+1; //size of first sub array
        int n2 = r-m; //size of second sub array
        
        //create temp arrays
        int Left [] = new int[n1];
        int Right[] = new int[n2];
        
        //copy data to temp arrays
        
        for(int i=0;i<n1;i++){
            Left[i] = arr[l+i];
        }
        
        for(int i=0;i<n2;i++){
            Right[i] = arr[m+1+i];
        }
        
         // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (Left[i] <= Right[j]) 
            { 
                arr[k] = Left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = Right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = Left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = Right[j]; 
            j++; 
            k++; 
        } 
            
    }
    
    void sort(int arr[],int l, int r){
        if(l<r){
            int m = (l+r)/2;
            
            //recursive calls
            sort(arr,l,m);
            sort(arr,m+1,r);
            
            //should be call a merge method
            merge(arr, l, m, r);
        }
    }
    
    void printArray(int arr[]){
            int n = arr.length; 
            for (int i=0; i<n; ++i) 
                System.out.print(arr[i] + " "); 
            System.out.println(); 
    } 
    
    public static void main(String args[]){
        
         int num[] = {17,87,6,22,41,3,13,54}; 
         
         MergeSort ms = new MergeSort();
         
         ms.sort(num, 0, num.length-1);
         
         ms.printArray(num);
         
    }
}

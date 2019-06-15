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
public class InsertionSorting {
    
    void insertionSort(int x[]){
        for(int i=1;i<x.length;i++){
            int j = i-1;
            int key = x[i];
            
            while(j>=0 && key<x[j]){
              int temp = x[j];
              x[j] = x[j+1];
              x[j+1] = temp;
              
              j--;
              
            }
        }
    }//insertionSort
    
    void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }//printArray
    
    public static void main(String args[]){
        
        InsertionSorting is = new InsertionSorting();
        
        int numbers [] = {2,6,-1,9,10,90,100,43,2};
        
        is.insertionSort(numbers);
        
        is.printArray(numbers);
        
    }
}

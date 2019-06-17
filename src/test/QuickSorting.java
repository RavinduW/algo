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
public class QuickSorting {
    int partition(int arr[],int low,int high){
        
        int pivot = arr[high]; //take the last element of the array as the pivot
        int i = low-1; //set i= -1
        
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++; //increment i by one
                
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1; //return the index where low and high indexes met
    }
    
    void quickSort(int arr[],int low, int high){
        if(low<high){
            int partition_index = partition(arr,low,high);
            
            quickSort(arr,low,partition_index-1);
            quickSort(arr,partition_index+1,high);
            
        }
    }
    
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        
        QuickSorting qs = new QuickSorting();
        
        int numbers[] = {12,1,5,8,7,13,16,2};
        
        qs.quickSort(numbers, 0, numbers.length-1);
        qs.printArray(numbers);
    }
}

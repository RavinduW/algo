package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravindu Weerasinghe
 */
public class BubbleSorting {
    
    void bubbleSort(int x[]){
        for(int i=0; i<x.length-1;i++){
            for(int j=0; j<x.length-1-i;j++){
                if(x[j]>x[j+1]){ 
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1]= temp;
                }
            }
        }
    }
    
    void printArray(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String args[]){
        
        BubbleSorting bs = new BubbleSorting();
        
        int numbers[]={5,3,1,2,8,9,-9};
        
        bs.bubbleSort(numbers);
        bs.printArray(numbers);
    }
}//BubbleSorting

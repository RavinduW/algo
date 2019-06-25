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
public class SecondLarge {
    
    int findSecondLarge(int arr[]){
        
        int largest = arr[0];
        int secondlargest = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest; //if we found a num greater than the largest, that means we can assign that value to secondlargest
                largest = arr[i];
            }else if(arr[i]>secondlargest){
                secondlargest = arr[i]; //if this means this value is greater than secondlargest and less than largestvalue
            }
        }
        return secondlargest;
    }
    
    void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        
        SecondLarge sl = new SecondLarge();
        
        int x[] = {21,34,56,32,21,47,78,89};
        sl.printArr(x);
        System.out.println("");
        System.out.println("The second largest value is "+sl.findSecondLarge(x));
    }
}

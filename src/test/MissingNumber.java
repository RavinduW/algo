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
public class MissingNumber {
    
    int findMissed(int arr[]){
        
        int total = (arr.length+1)*((arr.length+2)/2);
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        
        return (total-sum);
    }
    
    public static void main(String args[]){
        MissingNumber mn = new MissingNumber();
        
        int numArray [] ={1,2,4,5,6,7};
        
        System.out.println(mn.findMissed(numArray));
    }
}

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
public class SelectionSorting {
    
    int[] selectionSort(int [] x){
        
        //outer loop
        for(int i=0;i<=x.length-1;i++){
            
            int minIndex = i;
            
            //loop for find the minimum index
            for(int j=i+1;j<=x.length-1;j++){
                if(x[minIndex]>x[j]){
                    minIndex = j;
                }
            }
            
            //swap the values
            int temp = x[minIndex];
            
            x[minIndex]= x[i];
            
            x[i] = temp;
            
            
        }
        return x;
    }
    
    public static void main(String args[]){
        SelectionSorting ss = new SelectionSorting();
        int arr [] = {4,3,1,9,4,-2,-3};
        int[] y;
        y = ss.selectionSort(arr);
        
        for(int k=0;k<y.length-1;k++){
            System.out.println(y[k]);
        }
    }
    
    
}

//time complexity of selection sort => O(n^2) bcz it uses 2 for loops
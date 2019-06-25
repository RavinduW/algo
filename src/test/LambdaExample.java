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

interface Addition{
    int add(int a, int b);
}

public class LambdaExample {
    
    public static void main(String args[]){
        
        Addition a1=(a,b)->{
            
           return (a+b);
        };
        
        System.out.println(a1.add(2, 4));
    }
    
    
}

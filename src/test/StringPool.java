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
public class StringPool {
    
   
    public static void main(String args[]){
        
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
 
        System.out.println(s1==s2); //true
        System.out.println(s1==s3.intern());//true
        System.out.println(s1==s3);//false
    } 
}


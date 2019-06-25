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

class FinalizeDemo{

    protected void finalize(){
        System.out.println("Finalized method is called!");
    }
}

public class NewClass {
    
    
    public static void main(String args[]){
        
        int i = 10;
        System.out.println(i);
        Integer boxed_i = new Integer(i); //boxing
        System.out.println(boxed_i.toString());
        System.out.println(boxed_i.intValue()); //unboxing
        Integer autoboxing_i = i; //autoboxing
        System.out.println(autoboxing_i);
        
        FinalizeDemo fd = new FinalizeDemo();
        
        fd = null;
        
        System.gc();
    }
}

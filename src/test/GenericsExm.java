/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;
/**
 *
 * @author Ravindu Weerasinghe
 */

class Container<T>{
    T obj;
    
    void add(T obj){
        this.obj = obj;
    }
    
    T getT(){
        return obj;
    }
    
}


public class GenericsExm {
    
    public static void main(String args[]){
        
        int value = 5;
        
        List values = new ArrayList();
        values.add(5);
        values.add("kl");
        
        int i = Integer.parseInt(values.get(0).toString());
        
        //System.out.println(i); //numberformat exception will be thrown for values(1)
        
        Container<Integer> cg = new Container<Integer>();
        
        cg.add(i);
        
        System.out.println(cg.getT());
    }
    
}

//a class that can refer to any Type can be say as generic class


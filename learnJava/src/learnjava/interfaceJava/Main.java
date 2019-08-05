/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.interfaceJava;

/**
 *
 * @author Pass
 */
public class Main {
    
    public static void displayMain(Interface info){
       info.display();  
    }
    
    public static void main(String[] args) {
        
        A a = new A();
        a.display();
        B b = new B();
        b.display();
        System.out.println("_______________________");
        displayMain(a);
    }

   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Overload;

/**
 *
 * @author Pass
 */
public class A {
    public A(){}
    
    public void display(){}
    
    public void display(String str){
        str = "class A";
        System.out.println(str);
    }
    
    public void display(int n){ // => chính là overlaod trong cùng class
        n = 111;  
        System.out.println(n);
    }
}

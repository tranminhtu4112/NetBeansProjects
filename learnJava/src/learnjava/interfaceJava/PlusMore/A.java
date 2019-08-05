/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.interfaceJava.PlusMore;

/**
 *
 * @author Pass
 */
public class A implements Interface1, Interface2{

    public A() {
    }

    @Override
    public void display() {
        System.out.println("I dont know");
    }

    @Override
    public void dis2() {
    }
    
    public static void main(String[] args) {
        
        A a = new A();
        a.display();
    }
}

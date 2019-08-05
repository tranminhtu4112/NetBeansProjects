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
public class main {
    public static void main(String[] args) {
        B b = new B();
        b.display();    // của class A: ko hiện gì hết
        b.display("s"); // của class A
        b.display(0);
        b.display(222d);
    }
}

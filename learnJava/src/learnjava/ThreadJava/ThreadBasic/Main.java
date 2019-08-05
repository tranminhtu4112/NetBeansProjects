/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ThreadJava.ThreadBasic;



public class Main {
    
    public static void main(String[] args) {
        
        A a = new A(); // vì A là class enxtends class Threed
        B b = new B();  // inplement Interface của cha
        Thread ofB = new Thread(b);
        a.start();
        ofB.start();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Instanceof;

/**
 *
 * @author Pass
 */
public class Dog extends Animal{
    
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void move(){
        System.out.println("Dog is moving");
    }
}

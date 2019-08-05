/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Override;

/**
 *
 * @author Pass
 */
public class C extends B{
    
    public C(){}
      
    @Override
    public void display(){
        super.display();
        System.out.println("Class C");
    }
}

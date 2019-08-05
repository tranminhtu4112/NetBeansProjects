/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ExceptionHandling.QuiTac2.ViDu3;

/**
 *
 * @author Pass
 */
public class B extends A{
    @Override
    public void msg() throws ArithmeticException{  // Không cần throws cũng được
        System.out.println("Child");  
    } 
}

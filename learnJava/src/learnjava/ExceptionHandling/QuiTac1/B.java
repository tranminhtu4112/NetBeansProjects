/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ExceptionHandling.QuiTac1;

import java.io.IOException;

/**
 *
 * @author Pass
 */
public class B extends A{
    @Override
    public void msg() throws IOException{  
        System.out.println("TestExceptionChild");  
    } 
}

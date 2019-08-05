/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ThreadJava.ThreadBasic;

/**
 *
 * @author Pass
 */
public class B implements Runnable{
    
    @Override
    public void run(){
        for(int i = 0; i< 5; i++)
            System.out.println("B " + i);
    }
}

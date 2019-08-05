/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_tendangnhap;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pass
 */
public class MyThread1 extends Thread{
    
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(Thread.currentThread().getName()+" = "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }  
        }
    }
    
    public static void main(String[] args) {
        
        MyThread1 thread1 = new MyThread1();
        thread1.setPriority(MAX_PRIORITY);
        MyThread1 thread2 = new MyThread1();
        thread2.setPriority(MIN_PRIORITY);
         thread1.start();
        thread2.start();
        
    }
}

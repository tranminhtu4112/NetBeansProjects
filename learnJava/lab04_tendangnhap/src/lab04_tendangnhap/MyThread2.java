/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_tendangnhap;

/**
 *
 * @author Pass
 */
public class MyThread2 {
    
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 1; i <= 10; i++) {
                   if(i %2 == 0)
                       System.out.println(Thread.currentThread().getName()+" = "+i);
                   try {
                       Thread.sleep(500);
                   } catch (Exception e) {
                       System.out.println(e);
                   }
               }
           }
        });
        
       Thread thread2 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 1; i <= 10; i++) {
                   if(i %2 != 0)
                       System.out.println(Thread.currentThread().getName()+" = "+i);
                   try {
                       Thread.sleep(500);
                   } catch (Exception e) {
                       System.out.println(e);
                   }
               }
           }
        });
       
       thread1.start();
        try {
            thread1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        thread2.start();
        try {
            thread2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
}

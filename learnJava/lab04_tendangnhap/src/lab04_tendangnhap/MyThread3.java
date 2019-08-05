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
public class MyThread3 {
      
    synchronized void xuat1den10(){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            try {               
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    synchronized void chanLe(int i){
        if(i % 2 == 0){
            System.out.print("Chan\n");
            notify();
        }
        else
            System.out.print("Le\n");
        notify();
    }
    
    public static void main(String[] args) {
        
        MyThread3 th = new MyThread3();
        th.xuat1den10();

    }
}

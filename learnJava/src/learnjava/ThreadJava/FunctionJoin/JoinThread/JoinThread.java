/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ThreadJava.FunctionJoin.JoinThread;

/**
 *
 * @author Pass
 */
public class JoinThread extends Thread{
    public void run(){
        
        super.run();
        System.err.println(Thread.currentThread().getName() + " Đang chạy");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " kết thúc!");
    }
}

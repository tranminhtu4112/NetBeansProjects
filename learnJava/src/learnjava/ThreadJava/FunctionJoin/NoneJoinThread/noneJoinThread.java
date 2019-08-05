/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ThreadJava.FunctionJoin.NoneJoinThread;

/**
 *
 * @author Pass
 */
public class noneJoinThread extends Thread{
    
    @Override
    public void run(){
        
        super.run();
        System.err.println(Thread.currentThread().getName() + " Đang chạy");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " kết thúc!");
    }
}

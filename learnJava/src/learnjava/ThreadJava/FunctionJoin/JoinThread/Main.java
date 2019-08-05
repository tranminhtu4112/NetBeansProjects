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
public class Main {
    
    public static void main(String[] args) {
        
        JoinThread JoinThread1 = new JoinThread();
        JoinThread1.setName("thread 1");
        JoinThread1.start();
        try {
            JoinThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

                
        JoinThread JoinThread2 = new JoinThread();
        JoinThread2.setName("thread 2");
        JoinThread2.start();
        try {
            JoinThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        JoinThread JoinThread3 = new JoinThread();
        JoinThread3.setName("thread 3");
        JoinThread3.start();
        try {
            JoinThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    // các thread chạy khi kết thúc mới đến các thread khác chạy
}

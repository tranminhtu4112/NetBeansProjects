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
public class Main {

    public static void main(String[] args) {
        
        noneJoinThread nJoinThread1 = new noneJoinThread();
        nJoinThread1.setName("thread 1");
        nJoinThread1.start();
        

                
        noneJoinThread nJoinThread2 = new noneJoinThread();
        nJoinThread2.setName("thread 2");
        nJoinThread2.start();
        
        
        noneJoinThread nJoinThread3 = new noneJoinThread();
        nJoinThread3.setName("thread 3");
        nJoinThread3.start();
        
        
        
     // các thread kết thúc không đồng bộ như khởi tạo ban đầu
     // function sleep hay join thì đều phải có try catch
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ThreadJava.FunctionSleep;

/**
 *
 * @author Pass
 */
public class DemoSleep extends Thread{
   
    @Override
    public void run(){
        super.run();
        for(int i = 1; i <= 5; i++){
            System.out.println("Đây là thread thứ " + i);
            System.out.println("Tạm dừng 5000 milliseconds trước khi chuyển sang Thread tiếp theo");
            if( i == 5)
                System.out.println("Kết thúc!");
            try {
                   Thread.sleep(1000);
            } catch (InterruptedException  e) {
                e.printStackTrace();
            }
        }
    }
}

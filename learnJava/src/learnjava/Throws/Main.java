/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Throws;
import java.io.*;
/**
 *
 * @author Pass
 */
public class Main {
    /*  
        Nếu bạn đang gọi một phương thức mà khai báo một exception, bạn phải hoặc bắt hoặc khai báo exception đó.
        Có hai trường hợp:
        Trường hợp 1: Bạn bắt exception (sử dụng try-catch để xử lý exception đó)
        Trường hợp 2: Bạn khai báo exception (xác định từ khóa throws với phương thức đó)   
    */
//==============================================================================
    // Trường hợp 1: Bạn xử lý exception
 
    void method() throws IOException{  
        throw new IOException("device error");  
    }  
//============================================================================== 
    // Trường hợp 2: Bạn khai báo exception
        /*  
            Nếu exception không xuất hiện, code sẽ được thực thi tốt.
            Nếu exception xuất hiện, một exception sẽ được ném tại runtime bởi vì throws không xử lý exception đó.
        */    
    void method2 () throws IOException {
        System.out.println("Hoạt động tốt");
    }
//==============================================================================
    public static void main(String[] args) {
        
        try{  
            Main m = new Main();  
            m.method();  
            
        }catch(Exception e){
            
            System.out.println("Exception duoc xu ly");
        }     
        System.out.println("Luong chuan...END");  
    
        Main n = new Main();
        n.method2();
    }                     
}

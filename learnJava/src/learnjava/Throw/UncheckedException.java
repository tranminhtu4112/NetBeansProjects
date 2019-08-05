/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Throw;

import java.io.IOException;

/**
 *
 * @author Pass
 */
public class UncheckedException {
    public void m(){  
        int data=50/0;  
  
    }  
    public void n(){  
        m();  
    }  
    public void p(){  
        try{  
            n();  
        }catch(Exception e){
            System.out.println("Exception duoc xu ly");
        }  
    }  
/*    public static void deivide(int a, int b) throws IOException{
        if(b == 0)
           throw new ArithmeticException("b phai khac 0");
        System.out.println("Ket qua : " + a/b);
    }
*/
    public static void main(String args[]){  
        
        UncheckedException obj = new UncheckedException();  
        obj.p();  
        System.out.println("Luong chuan...");  
     
    //    deivide(12,0);
  }  
}

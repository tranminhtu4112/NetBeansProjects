/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Throw;


/**
 *
 * @author Pass
 */
public class CheckedException { // Chạy chương trình Java trên sẽ cho một lỗi Compile Time Error.
    public void m(){  
       throw new java.io.IOException("device error");//checked exception  Compile Time Error.
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
    public static void main(String args[]){  
   
        CheckedException obj = new CheckedException();  
        obj.p();  
        System.out.println("Luong chuan...");  
    }
}

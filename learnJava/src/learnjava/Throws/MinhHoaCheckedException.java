/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Throws;

import java.io.IOException;

/**
 *
 * @author Pass
 */
public class MinhHoaCheckedException {
     public void m() throws IOException{  
       throw new java.io.IOException("device error");//checked exception  Compile Time Error.
    }  
    public void n() throws IOException{  
        m();  
    }  
    public void p(){    // Hàm này nếu như ko try catch thì phải throws  
       try{  
            n();    
        }catch(Exception e){
           System.out.println("Exception duoc xu ly");
        }  
    }  
    public static void main(String args[]){  
   
        MinhHoaCheckedException obj = new MinhHoaCheckedException();  
        obj.p();  
        System.out.println("Luong chuan...");  
    }
}

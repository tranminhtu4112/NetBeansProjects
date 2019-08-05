/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextMore;

/**
 *
 * @author Pass
 */
public class BienFinal {
    
    final int max = 100;
   
//    void BienFinal(){  
//        
//        max=400;  
//   } 
    class BienFinal1 extends BienFinal{
    
        max = 999;
    }
    
    public static void main(String[] args) {
       
        BienFinal a = new BienFinal();
        System.out.println(a.max + 100);
        //a.max = 1200;
        
    }
    
    // final để cấm lớp con ghi đè(@override) vd: final public void setName(){}
    //final để cấm class con kế thừa class cha vd: final class A{...}
}

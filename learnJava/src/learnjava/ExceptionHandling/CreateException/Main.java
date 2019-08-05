/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ExceptionHandling.CreateException;

import ThucHanhFPT.LocalDate.test1;

/**
 *
 * @author Pass
 */
public class Main {
    
    public static void cheakAge(int age) throws TestException{
       if(age > 18){
           System.out.println("Đủ tuổi vào tù !");
           return;
       }
       throw new TestException("Còn trẻ trâu !");
    }
   
    public static void main (String [] args){
        
        int age = 15;
        try {
            cheakAge(age);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("other ...");
        
        TestException t = new TestException("r");
        System.out.println(t);
    }
}

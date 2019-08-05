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
public class ClassFInal {
        
}
final class Bike{}  
  
 class Honda1 extends Bike{  
     
  void run(){
      System.out.println("Chay an toan voi 100kmph");
  }
 }  
    
  public static void main(String args[]){  

    Honda1 honda= new Honda();  
    honda.run();  
  }  

/*
=>  Ta không thể kế thừa class final: Không thể kế thừa lớp Final

*/
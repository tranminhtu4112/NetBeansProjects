/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;
/**
 *
 * @author Pass
 */
public class DATE {
    
  public static void outputNumber(int numStart, int numEnd){
      int enTer = 1000, i = 1;
      while(numStart <= numEnd){
        System.out.printf("%d ",numStart);
          if(numStart == enTer){
            System.out.println();
            enTer = enTer * i;
            i++;
          }
        numStart++;
      }

    public static void public static void main(String[] args) {
      
        outputNumber(1,2000);
    }
    
}

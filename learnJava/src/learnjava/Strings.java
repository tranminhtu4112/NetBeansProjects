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
public class Strings {
     public static void main (String[] args){
         String firstString="Tran Minh Tu";
         String secondString=firstString+" 4 "+11;
         
         System.out.println(firstString);
         System.out.println(secondString);
         System.out.println(firstString.length());   
         
         System.out.println(true);
         
         String s="Hi "+false;
         System.out.println(s);
         
         boolean fisrtboo=false;
         if (fisrtboo) {
             System.out.println("OK");
         }else{
             System.out.println("Not OK");                
         }  
         
         String t = new String("tuan,tu,tri,hung");
           String[] a = t.split(",");
         for (String string : a) {
             System.out.println(string);
         }
     }
}

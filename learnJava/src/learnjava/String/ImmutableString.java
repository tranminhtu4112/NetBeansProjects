/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.String;

/**
 *
 * @author Pass
 */
public class ImmutableString {
    
    public static void main(String[] args) {
        
        String a = "Tran Minh Tu";
        a.concat(" gg");   // vì String trong java ko thể thay đổi
        System.out.println(a);
        
        String s1 = "Tran Minh Tu";
         s1= s1.concat(" gg");   
        System.out.println(s1);
        
        String s2 = " good";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        
   
    }
}

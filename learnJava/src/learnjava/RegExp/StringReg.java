/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.RegExp;

import java.util.Arrays;

/**
 *
 * @author Pass
 */
public class StringReg {
    
    public static void main(String[] args) {
        
        String str = "Tran Minh Tu";
        String []arrStr = str.split(" "); // Tách 1 khoảng trắng
        System.out.println(Arrays.toString(arrStr));
        
        String str1 = "Tran   Minh    Tu";
        String []arrStr1 = str1.split("\\s+");
        System.out.println(Arrays.toString(arrStr1));
        
        String str2 = "Tran.......Minh......Tu";
        String []arrStr2 = str2.split("\\.+");
        System.out.println(Arrays.toString(arrStr2));
        
        String str3 = "000Tran111Minh222Tu333";
        String []arrStr3 = str3.split("\\d+");
        System.out.println(Arrays.toString(arrStr3)+arrStr3.length);
        
        String data = "123456";
        String reg = "[0-9]";
        System.out.println(data.matches(reg));
        reg = "[0-6]+";
        System.out.println(data.matches(reg));
        
        String data2 = "abcdef";
        String reg2 = "\\[a-zA-Z]";
        System.out.println("abc: "+data2.matches(reg2));   
        reg2 = "[a-zA-Z]+";
        System.out.println("abc: "+data2.matches(reg2));
             
      
    }
}

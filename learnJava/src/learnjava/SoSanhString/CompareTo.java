/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.SoSanhString;

/**
 *
 * @author Pass
 */
public class CompareTo {
    
    public static void main(String[] args) {
        String str1 = "Avb";
        String str2 = "AvB";
        System.out.println("Str1 compare to Str2: "+str1.compareTo(str2));
        System.out.println(65+118+98-(65+118+66));
        System.out.println("Str1 equals Str2: "+str1.equals(str2));
        str2 = "Avb";
        System.out.println("Str1 equals Str2: "+str1.equals(str2));
    //=====================================================================
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);//true (vì cả 2 cùng tham chiếu instance giống nhau)  
        System.out.println(s1 == s3);//false(vì s3 tham chiếu instance mà không ở trong Pool) 
    }
    
}

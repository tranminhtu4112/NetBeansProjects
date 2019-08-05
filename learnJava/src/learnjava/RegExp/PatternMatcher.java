/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.RegExp;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pass
 */

//      \.[{(*+?^$|

public class PatternMatcher {
 
    public static void main(String[] args) {
        
        String regex= ".xx.";
        // Tạo đối tượng Pattern thông qua method tĩnh.
        Pattern pattern = Pattern.compile(regex);
        // Lấy ra đối tượng Matcher
        Matcher matcher = pattern.matcher("MxxY");
        boolean match = matcher.matches();
        System.out.println("Match "+ match);
        
        System.out.println(Pattern.matches("[abc]","a"));
        System.out.println(Pattern.matches("[abc]{3}","abccaab"));
        System.out.println(Pattern.matches("[abc]{3}","abc"));
        
        while (match) {   
            System.out.println("Nhap email:");  // Ttram123123@hhhgmail.com
            String email = new Scanner(System.in).nextLine();
            String reg = "^T[a-z]+[a-z0-9]+@gmail\\.com$";
            System.out.println(email.matches(reg));
        }
        
    }

 
}

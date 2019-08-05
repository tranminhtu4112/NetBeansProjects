package Test;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pass
 */
public class Test2 {
    @Deprecated
    public static boolean cardNumber(String card){
        int a[] = new int[card.length()];
        for (int i = 0; i < card.length(); i++) {
            char c = card.charAt(i);
            a[i] = Integer.parseInt(String.valueOf(c)); 
        }
        int tong = 0;
        for (int i = 0; i < a.length; i++) 
            tong += a[i];
        System.out.println(tong);
        return (tong %2 == 0);
    }
    
    public static void main(String[] args) {
        
        String s = "009087673224";
        System.out.println(cardNumber(s));
        
    }
}

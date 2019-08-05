/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Scanner;


/**
 *
 * @author Pass
 */
public class NhapLieu {
    
    public static void main(String[] args) {
       
        Scanner  scanner=new Scanner(System.in);
        float n;
        System.out.println("Nhap 1 so:");
        n = scanner.nextFloat();
        System.out.println("gia tri vua nhap: "+n);
        
        System.out.println("");
        
        String s;
        System.out.println("Nhap bat ki:");
        s=scanner.next();
        System.out.println(s);       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP7.BAI4;

import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class tesst {
    public static void nhap (int n){
        int tmp;
        tmp = new Scanner(System.in).nextInt();
        n= tmp;
    }
    
    public static void NhapNhieu (int a[]){
        for(int i=0;i<a.length;i++)
            a[i] = new Scanner(System.in).nextInt();

    }
    
    public static void xuat (int n){
         System.out.println(n);
    }
    
    public static void xuatNhieu (int a[]){
        for(int i=0;i<a.length;i++)
            System.out.printf("%d",a[i]);
    }
    
    public static void main(String[] args) {
        
        int a[] = new int[2];
        NhapNhieu(a);
        xuatNhieu(a);
    }
}

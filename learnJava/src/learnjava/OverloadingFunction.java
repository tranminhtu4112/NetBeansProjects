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
public class OverloadingFunction {
//                         Trùng tên hàm kiểu int
//==============================================================================    
    public static int findBiggest2Number(int a, int b) {
        return (a>b)?a:b;
    }
    
    public static int findBiggest2Number(int a, int b, int c){
        return (findBiggest2Number(a,b)>c)?findBiggest2Number(a,b):c;
    }
//                         Trùng tên hàm kiểu float   
//==============================================================================    
    
    public static float findBiggest2Number(float a, float b) {
        return (a>b)?a:b;
    }
    
    public static float findBiggest2Number(float a, float b, float c){
        return (findBiggest2Number(a,b)>c)?findBiggest2Number(a,b):c;
    }
    
//==============================================================================    
    public static void main(String[] args) {
        
        System.out.println("Nhap 2 so : ");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        System.out.println("Gia tri lon : "+findBiggest2Number(n1,n2));
        
        System.out.println("Nhap 3 so : ");
        n1=scanner.nextInt();
        n2=scanner.nextInt();
        int n3=scanner.nextInt();
         System.out.println("Gia tri lon : "+findBiggest2Number(n1,n2,n3));
    }
}

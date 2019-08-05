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
public class Functions {
    
    //Đây là hàm void
    public static void FindBiggest2Number1(float a, float b) {
        if(a>b)
            System.out.println(a+" lon hon "+b);
        else
            System.out.println(b+" lon hon "+a);
    }
    
    //Đây là hàm trả về 1 giá trị: value>0 =>a>b; value<0 =>b>a
    public static int FindBiggest2Number2(float a, float b){
        if(a>b)
            return 1;
        else
            return -1;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        //Cách 1
        System.out.println("Nhap so thu nhat:");
        float FirstNumber = scanner.nextFloat();     
        System.out.println("Nhap so thu nhat:");
        float SecondNumber = scanner.nextFloat(); 
        
        FindBiggest2Number1(FirstNumber,SecondNumber);
        
        //Cách 2
        System.out.println("Nhap so thu nhat:");
        FirstNumber = scanner.nextFloat();    
        System.out.println("Nhap so thu nhat:");
        SecondNumber = scanner.nextFloat();  
        
        if(FindBiggest2Number2(FirstNumber,SecondNumber)>0)
            System.out.println(FirstNumber+" lon hon "+SecondNumber);
        else
            System.out.println(SecondNumber+" lon hon "+FirstNumber);
    }
   
}

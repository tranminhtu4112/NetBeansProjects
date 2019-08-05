/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class Test1 {
    
    public static void ThayThe(ArrayList<String> a,int n){
        a.set(n, "a");
    }
    
    public static void xuat(ArrayList<String> a){
        System.out.println("--------------------------");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    
    public static void Chinh(ArrayList<String> a){
        while (true) {      
            int n;
            System.out.println("nhap index:");
            
            while (true) {                
                  n = new Scanner(System.in).nextInt();
                 if(n >= a.size())
                     System.out.println("Nhap lai");
                 else
                     break;
            }
            
            ThayThe(a, n);
            xuat(a);
            
            int cheak = 0;
            
            for(int i =0; i<a.size();i++)                
                if(a.get(i).equals("a"))
                    cheak++;
            if(cheak == a.size())
                  break;
            
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList <String> a = new ArrayList<>();
        
        int j = 0;
        
        for(int i = 5; i<=9; i++) // gán giá trị các phần tử
            a.add(String.valueOf(i));       
        
        Chinh(a);
        
    }
}

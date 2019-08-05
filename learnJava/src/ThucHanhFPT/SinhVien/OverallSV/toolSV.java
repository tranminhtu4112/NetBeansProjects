/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.SinhVien.OverallSV;

import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class toolSV extends SinhVien{
    
    public static Scanner Scanner = new Scanner(System.in);
    
    public static void inPutListSV(SinhVien s,int n){
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten:");
                s.setName(Scanner.nextLine());
            
        }
    }
    
            // Nhap so luong
    public static void inPutSlSV(int n){
              
        System.out.println("Nhap so luong:");
        while (true) {
            try{
                String  str = Scanner.nextLine();
                n = Integer.parseInt(str);
                break;
            }catch(Exception e){
                System.out.println("Nhap lai:");
            }
            
        }
    }
    
    
    
}

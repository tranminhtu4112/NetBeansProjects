/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_tendangnhap;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Pass
 */
public class write_to_file {
    
    public static void nhap(nhanVien nv){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
            String manv = in.nextLine();
            int tuoi = in.nextInt();
            float luong = in.nextFloat();
            nv.setHoTen(name);
            nv.setManv(manv);
            nv.setTuoi(tuoi);
            nv.setLuong(luong);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        nhanVien []nv = new nhanVien[2];
        for (int i = 0; i < nv.length; i++) {
            nv[i] = new nhanVien();
            nhap(nv[i]);
        }
        
        try {
            FileWriter fileWriter = new FileWriter("nhanvien.txt");
            for (int i = 0; i < nv.length; i++){
               fileWriter.write(nv[i].toString());
            }
            fileWriter.close();
            System.out.println("Hoan tat");
        } catch (IOException ex) {
            System.out.println(ex);
        }
       
        
    }
}

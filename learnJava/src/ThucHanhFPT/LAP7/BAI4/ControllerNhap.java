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
public class ControllerNhap extends SinhVien{
    
    private static Scanner scan = new Scanner(System.in);
    
    public void nhap1Sv(SinhVien sv){
        System.out.println("Nhap ten:");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhap diem:");
        float diem = new Scanner(System.in).nextFloat();
        sv.setDiem(diem);
        sv.setHoTen(hoTen);
    }
    
    public void NhapDanhSachSv(SinhVien []sv){
       
        for (int i = 0; i < sv.length; i++) {
          sv[i] = new SinhVien();
          this.nhap1Sv(sv[i]);
        }
    }
    
    public int NhapSoLuongSv(int soLuongSinhVien){
        while(true){
            try {
                System.out.println("Nhap so luong sinh vien:");
                String checkNum = new Scanner(System.in).nextLine();
                soLuongSinhVien = Integer.parseInt(checkNum);
                return soLuongSinhVien;
            } catch (Exception e) {
                System.out.println("Nhap lai");
            }
        }
    }
}

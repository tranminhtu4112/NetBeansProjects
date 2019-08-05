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
public class SinhVien {
    
    private String hoTen;
    private float diem;

    public SinhVien(String hoTen, float diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiem() {
        return diem;
    }
   
    public String getHocLuc(){
        float score = this.getDiem();
        if(score < 5)
            return "Yếu";
        if(score >= 5 && score < 6.5f)
            return "Trung Bình";
        if(score >= 6.5f && score < 7.5f)
            return "Khá";
        if(score >= 7.5f && score < 9)
            return "Giỏi";
        return "Xuất sắc";
    }
    
    public void NhapDanhSachSv(SinhVien []sv){
       
        for (int i = 0; i < sv.length; i++) {
            System.out.printf("Nhap sv %d: \n",i);
            System.out.println("Nhap ten:");
            String hoTen = new Scanner(System.in).nextLine();
            System.out.println("Nhap diem:");
            float diem = new Scanner(System.in).nextFloat();
            sv[i].setHoTen(hoTen);
            sv[i].setDiem(diem);
        }
    }
    
    public  void XuatDanhDanhSv(SinhVien []sv){
      
        for (int i = 0; i < sv.length; i++) {
            System.out.println("------------------------");
            System.out.println("Ten: " + sv[i].getHoTen());
            System.out.println("Diem: " + sv[i].getDiem());
            System.out.println("hoc luc: " + sv[i].getHocLuc());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP6.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class NhapXuatSp extends SanPham{
    public void NhapSp(ArrayList<SanPham> sanPham, int soLuongSp){
        for(int i = 0; i < soLuongSp; i++){
            System.out.println("Nhap ten Sp: ");
            String ten = new Scanner(System.in).nextLine();
            System.out.println("Nhap gia: ");
            float gia = new Scanner(System.in).nextFloat();
            System.out.println("Nhap hang: ");
            String hang = new Scanner(System.in).nextLine();
            SanPham temp = new SanPham(ten, gia, hang);
            sanPham.add(temp);
        }
    }
    public void XuatSp(ArrayList<SanPham> sanPham){
        for (int i = 0; i < sanPham.size(); i++) {
            SanPham temp = sanPham.get(i);
            System.out.println(temp.getTen() +" "+ temp.getHang() +" "+ temp.getGia());
            System.out.println("");
        }
    } 
    public void XuatSp(SanPham sanPham){
            SanPham temp = sanPham;
            System.out.println(temp.getTen() +" "+ temp.getHang() +" "+ temp.getGia());
            System.out.println("");
    }
}

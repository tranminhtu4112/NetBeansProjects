/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_tendangnhap;

import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class nhanVien {
    
    private String manv;
    private String hoTen;
    private int tuoi;
    private float luong;

    public nhanVien(){};
    
    public nhanVien(String manv, String hoTen, int tuoi, float luong) {
        this.manv = manv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    @Override
    public String toString(){
        return getHoTen()+"-"+getManv()+"-"+getTuoi()+"-"+getLuong()+"\n";
    }
    public void display(){
        String Info = this.toString();
        String []s = Info.split("-");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public float getLuong() {
        return luong;
    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        nhanVien nv = new nhanVien();
        nv.setHoTen(in.nextLine());
        nv.setManv(in.nextLine());
        nv.setTuoi(in.nextInt());
        nv.setLuong(in.nextFloat());
        
        nv.display();
    }
}

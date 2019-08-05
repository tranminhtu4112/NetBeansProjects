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
public class MAin{
    
    public static void main(String[] args) {
        
        ControllerNhap controllerNhap = new ControllerNhap();
        ControllerXuat controllerXuat = new ControllerXuat();
        ControllerSapXep controllerSapXep = new ControllerSapXep();
        
        int soLuongSinhVien = 0;
        
        soLuongSinhVien = controllerNhap.NhapSoLuongSv(soLuongSinhVien);
        SinhVien sv[] = new SinhVien[soLuongSinhVien];
        
        controllerNhap.NhapDanhSachSv(sv);
        controllerXuat.XuatDanhDanhSv(sv);
        
        controllerSapXep.sapXepTheoDiem(sv, new soSanhTheoDiem());
        controllerXuat.XuatDanhDanhSv(sv);
        
        
        
       
    }
}

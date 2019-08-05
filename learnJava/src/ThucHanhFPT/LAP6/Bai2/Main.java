/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP6.Bai2;

import java.util.ArrayList;

/**
 *
 * @author Pass
 */
public class Main {
    public static void main(String[] args) {
                
        NhapXuatSp controllNhapXuat = new NhapXuatSp();
        ConTrollTimKiem conTrollTimKiem = new ConTrollTimKiem();
        
        ArrayList<SanPham> sp = new ArrayList<>();

        controllNhapXuat.NhapSp(sp, 2);
        controllNhapXuat.XuatSp(sp);
        conTrollTimKiem.timKiemTheoHang(sp, new TimKiemTheoHang());
   
    }
}

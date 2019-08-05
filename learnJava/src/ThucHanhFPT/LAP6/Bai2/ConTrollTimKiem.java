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
public class ConTrollTimKiem extends SanPham{
    public void timKiemTheoHang(ArrayList<SanPham> sanPham, TimKiem timKiem){
        SanPham tmp = new SanPham();
        for(int i = 0; i < sanPham.size(); i++){
            tmp = sanPham.get(i);
            if(timKiem.timKiem(tmp))
                new NhapXuatSp().XuatSp(tmp);
        }
    }
}

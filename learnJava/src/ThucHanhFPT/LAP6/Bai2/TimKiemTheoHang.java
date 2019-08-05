/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP6.Bai2;

/**
 *
 * @author Pass
 */
public class TimKiemTheoHang implements TimKiem{

    @Override
    public boolean timKiem(SanPham sanPham) {
        if(sanPham.getHang().equals("nokia"))
            return true;
        else
            return false;
    }
}

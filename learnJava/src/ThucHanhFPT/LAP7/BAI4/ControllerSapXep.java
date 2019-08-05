/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP7.BAI4;

/**
 *
 * @author Pass
 */
public class ControllerSapXep extends SinhVien {
    
    public static void swap(SinhVien a, SinhVien b){
        String hoTen = b.getHoTen();
        float diem = b.getDiem();
        b.setDiem(a.getDiem());    b.setHoTen(a.getHoTen());
        a.setDiem(diem);    a.setHoTen(hoTen);
    }
    
    public void sapXepTheoDiem(SinhVien sv[], Comperation comperation){
        for (int i = 0; i < sv.length -1; i++) 
            for (int j = i + 1; j < sv.length; j++) 
               if(comperation.soSanhDiem(sv[i], sv[j]) > 0)
                   swap(sv[i], sv[j]);
    }
}

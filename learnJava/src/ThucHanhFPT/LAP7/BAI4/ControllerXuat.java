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
public class ControllerXuat extends SinhVien{
    
    public void xuat1Sv(SinhVien sv){
        
        System.out.println("------------------------");
        System.out.println("Ten: " + sv.getHoTen());
        System.out.println("Diem: " + sv.getDiem());
        System.out.println("hoc luc: " + sv.getHocLuc());
    }
    
    public void XuatDanhDanhSv(SinhVien []sv){
      
        for (int i = 0; i < sv.length; i++) {
            this.xuat1Sv(sv[i]);
        }
    }
}

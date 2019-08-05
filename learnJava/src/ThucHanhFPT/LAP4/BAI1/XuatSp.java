/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP4.BAI1;

/**
 *
 * @author Pass
 */
public class XuatSp extends SanPham{
    
     public void display(SanPham TypeSp){
        System.out.println("ten SP: "+TypeSp.getTenSp()+"\nGia SP: "+TypeSp.getGiaSp()+
        "\nGia gia: "+TypeSp.getGiamGia()+"\nThue NK: "+TypeSp.getthueSp(new ThueSp10()));
     }
}

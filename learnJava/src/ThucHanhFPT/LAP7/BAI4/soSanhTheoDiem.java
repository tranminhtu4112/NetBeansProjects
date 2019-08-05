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
public  class soSanhTheoDiem implements Comperation{

    @Override
    public float soSanhDiem(SinhVien a, SinhVien b) {
        return a.getDiem() - b.getDiem();
    }
    
  
}

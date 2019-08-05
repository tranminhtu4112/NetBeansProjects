/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP7.BAI3;

import ThucHanhFPT.LAP7.BAI2.SinhVienHutech;

/**
 *
 * @author Pass
 */
public class SinhVienBiz extends SinhVienHutech{
    
    private float scoreMarketting;
    private float scoreSales;
    
    public SinhVienBiz(){};

    public SinhVienBiz(String hoTen, float scoreMarketting, float scoreSales) {
        super(hoTen, "Marketitng");
        this.scoreMarketting = scoreMarketting;
        this.scoreSales = scoreSales;
    }
    
    @Override
    public float getDiem(){
        return (this.scoreMarketting*2 + this.scoreSales) / 3;
    }
    
    
}

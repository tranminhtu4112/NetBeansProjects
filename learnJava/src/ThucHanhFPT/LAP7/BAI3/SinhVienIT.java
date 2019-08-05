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
public class SinhVienIT extends SinhVienHutech{
    private float scoreJava;
    private float scoreHtml;
    private float scoreCss;
    
    public SinhVienIT(){};
    
    public SinhVienIT(String hoTen, float scoreJava, float scoreHtml, float scoreCss){
        super(hoTen, "Information Technology");
        this.scoreJava = scoreJava;
        this.scoreHtml = scoreHtml;
        this.scoreCss = scoreCss;
    }
    
    @Override
    public float getDiem(){
        return (this.scoreJava*2 + this.scoreHtml + this.scoreCss) / 4; 
    }
}

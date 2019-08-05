/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP7.BAI1;

/**
 *
 * @author Pass
 */
public class ChuNhat {
    private float chieuDai;
    private float chieuRong;
    
    public ChuNhat(){
        this.chieuDai = 0f;
        this.chieuRong = 0f;
    }
    public ChuNhat(float chieuDai, float chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public void setChieuDai(float chieuDai){
        this.chieuDai = chieuDai;
    }
    public void setChieuRong(float chieuRong){
        this.chieuRong = chieuRong;
    }
    public float getChieuDai(){
        return this.chieuDai;
    }
    public float getChieuRong(){
        return this.chieuRong;
    }
    public float getChuVi(){
        return (this.chieuDai*this.chieuRong)*2;
    }
    public float getDienTich(){
        return this.chieuDai*this.chieuRong;
    }   
    public void display(){
        System.out.println("Chieu dai: " +this.chieuDai+"\nChieu rong: " 
          +this.chieuRong+ "\nChu vi: " +this.getChuVi()+"\nDien tich: " + this.getDienTich() + "\n");
    }
}

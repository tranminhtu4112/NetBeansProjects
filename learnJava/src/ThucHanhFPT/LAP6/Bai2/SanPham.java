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
public class SanPham {
    private String ten;
    private float gia;
    private String hang;
    
    public SanPham() {
        this.ten = "Unknow";
        this.gia = 0f;
        this.hang = "Unknow";
    }
    public SanPham(String ten, float gia, String hang){
        this.ten = ten;
        this.gia = gia;
        this.hang = hang;
    }

    public String getTen() {
        return ten;
    }

    public float getGia() {
        return gia;
    }

    public String getHang() {
        return hang;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    

}

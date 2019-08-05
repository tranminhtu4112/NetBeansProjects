/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP4.BAI1;

public class SanPham{
    
    private String tenSp;
    private double giaSp;
    private double giamGia;
    
    public SanPham(){
        this.tenSp = "Unknow";
        this.giaSp = 0;
        this.giamGia = 0;
    }
    public double getthueSp(ThueSp thueSp){
        return this.giaSp*thueSp.soThueSp();
    }
    
    public void setTenSp(String tenSp){
        this.tenSp = tenSp;
    }
    public void setGiaSp(double giaSp){
        this.giaSp = giaSp;
    }
    public void setGiamGia(double giamGia){
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public double getGiamGia() {
        return giamGia;
    }
}

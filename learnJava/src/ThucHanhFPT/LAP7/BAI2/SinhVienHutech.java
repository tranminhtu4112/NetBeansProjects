/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP7.BAI2;

/**
 *
 * @author Pass
 */
public abstract class SinhVienHutech {
    private String hoTen;
    private String Nganh;
    
    public SinhVienHutech(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.Nganh = nganh;
    }
    
    public SinhVienHutech(){};
    
    public abstract float getDiem();
    
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void setNganh(String nganh){
        this.Nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return Nganh;
    }
    
    public String getHocLuc(){
        float score = this.getDiem();
        if(score < 5)
            return "Yếu";
        if(score >= 5 && score < 6.5f)
            return "Trung Bình";
        if(score >= 6.5f && score < 7.5f)
            return "Khá";
        if(score >= 7.5f && score < 9)
            return "Giỏi";
        return "Xuất sắc";
    }
    
    public void display(){
        System.out.println("Tên: " +this.hoTen);
        System.out.println("Ngành: " +this.Nganh);
        System.out.println("Điểm: " + this.getDiem());
        System.out.println("Học lưc: " + this.getHocLuc());
    }
    
}

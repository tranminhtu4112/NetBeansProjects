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
public class Vuong extends ChuNhat{
    private float canh;
    
    public Vuong(){
        this.canh = 0f;
    }
    public Vuong(float canh){
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }
    @Override
     public float getChuVi(){
        return (this.canh*this.canh)*2;
    }
     @Override
    public float getDienTich(){
        return this.canh*this.canh;
    }   
    @Override
    public void display(){
        System.out.println("Do dai canh: " +this.canh + "\nChu vi: " 
                +this.getChuVi()+"\nDien tich: " + this.getDienTich()+ "\n");
    }
}

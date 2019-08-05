/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.SinhVien.OverallSV;

/**
 *
 * @author Pass
 */
public class SinhVien extends PersonAll{   
    private String MSSV;
    private float mediumScore;   

    public SinhVien(String name,String MSSV,float mediumScore,int date, int mounth, int year) {
        super(name, date, mounth, year);
        this.MSSV = MSSV;
        this.mediumScore = mediumScore;
    }

    public SinhVien(String name, int date, int mounth, int year) {
        super(name, date, mounth, year);
    }
    public SinhVien(){  // Bên cha phải có constructor mặc định thì con mới có
        super.setName("Unkonw");
        this.MSSV="Unkonw";
        this.mediumScore = 0f;
        super.setDate(0, 0, 0);
    }
   
    
    public void displayInfoSv(){     
        System.out.print("name:"+super.getName()+"/MSSV:"+this.MSSV+"/mediumScore:"+this.mediumScore+"/date:");
        super.displayDate();
    }
   
}

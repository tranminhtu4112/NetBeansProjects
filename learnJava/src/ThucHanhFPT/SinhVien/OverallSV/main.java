/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.SinhVien.OverallSV;

import static ThucHanhFPT.SinhVien.OverallSV.toolSV.inPutSlSV;

/**
 *
 * @author Pass
 */
public class main {
    
    
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Tu","9999",7, 4, 11, 2000);
        sv.displayInfoSv(); 
       
        SinhVien sv1 = new SinhVien();
        sv1.displayInfoSv();
        int n = 0;
        sv1.setAge(0);
        
        
        System.out.println(n);
    }
}

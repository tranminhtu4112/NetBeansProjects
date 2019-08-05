/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP7.BAI3;

/**
 *
 * @author Pass
 */
public class Main {
    
    public static void main(String[] args) {
        
        SinhVienIT svIt = new SinhVienIT("Trần Minh Tú", 7.5f, 8.5f, 9.5f);
        svIt.display();
        System.out.println("-----------------------");
        SinhVienBiz svBz = new SinhVienBiz("Trần Minh A", 5f, 6f);
        svBz.display();
    }
}

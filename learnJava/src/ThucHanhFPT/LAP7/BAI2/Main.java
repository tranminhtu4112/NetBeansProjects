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
public class Main {
    
    public static void main(String[] args) {
        
        SinhVienHutech svHu = new SinhVienHutech("Trần Minh Tú", "Information Technology") {
            @Override
            public float getDiem() {
                return 8.5f;
            }
        };
        svHu.display();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.BienStatic;


/**
 *
 * @author Pass
 */
public class main extends perSon{
    
  
    
    public static void main(String[] args) {
        
        perSon s = new perSon();
        perSon.getId();
        s.getId();
        s.getId();
 //       displayId();  không thể dùng trực tiếp mà phải thông qua đối tượng vì ko có static
        s.displayId();
    }
}

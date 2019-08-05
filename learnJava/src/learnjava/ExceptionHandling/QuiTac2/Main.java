/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ExceptionHandling.QuiTac2;

/**
 *
 * @author Pass
 */
/*
    Nếu phương thức của lớp cha không khai báo một exception: 
    phương thức ghi đè của lớp con không thể khai báo Checked Exception nhưng có thể 
    khai báo Unchecked Exception.
*/
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.msg();
    }
}

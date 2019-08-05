/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ExceptionHandling.QuiTac2.ViDu1;

/**
 *
 * @author Pass
 */
public class Main {
    /*
        Ví dụ trường hợp phương thức ghi đè của lớp con khai báo exception cha
        => Chạy chương trình sẽ cho Compile Time Error.
    */
    public static void main(String[] args) {
        B b = new B();
        b.msg();
    }
}

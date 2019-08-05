/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Override;

/**
 *
 * @author Pass
 */
public class main {
    public static void main(String[] args) {
        C b = new C();
        b.display();
        A s = new A();
        s.display();
    }
}

/* Gọi lại phương thức đã đó để thay đổi các thực thi bên trong nó 
 nhưng phải ccung kiểu trả về, cùng tên, cùng biến truy cập 
Override: Dùng trong khác class
Overload:Dùng trong cùng class hoặc khác class
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextMore;

/**
 *
 * @author Pass
 */
public class PhuongThucFinal {
    
    final void disName(){   // Hàm final ko được thay đổi bất kì ở đâu
        System.out.println("Trần Minh Tú");
    }
}

class conTren extends PhuongThucFinal { 

/*    void disName(){ // KHông thể ghi đè lên 
    
        System.out.println("sẽ không thay đổi đc hàm final đã có.");
    
        super.disName();
    }   */
    
    public static void main(String[] args) {
    
        conTren ks = new conTren();
        ks.disName(); //=>> Được kế thừa phương thức final
    }
}

/*

=> Nếu bạn tạo bất cứ phương thức nào là final, thì bạn không thể ghi đè nó.
=> Phương thức final được kế thừa nhưng bạn không thể ghi đè nó

*/
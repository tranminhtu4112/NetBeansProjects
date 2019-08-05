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
public class perSon {
    private static int id = 0;
    private String name;
    
    public static void getId(){
        id++;
        System.out.println("ID:"+id);
    //   this.name = "re";  Lỗi vì phương thức static phải chứa các loại 
    // Phương thức static không thể @override
    // Phương thức static khi gọi không cần có đối tượng
    }
    public void displayId(){
        id++;
        System.out.println("ID:"+id);
    }
    
 
}

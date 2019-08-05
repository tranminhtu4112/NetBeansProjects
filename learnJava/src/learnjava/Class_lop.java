/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Pass
 */
public class Class_lop {
    
    // Object:
    // State: đặc tính
    // Behavior: Trạng thái
    // Class: Cái bao quát nhất (Có đặc điểm chung)
    
    public static void main(String[] args) {
        
        //kèm theo file Dog.java và Cat.java
        
        Dog chos=new Dog();
        chos.Name="Tiki lazada";
//     Sẽ không có chos.Height; vì Height được khai báo là private
        System.out.println("Ten cho : "+chos.Name);  
        System.out.println("");
        chos.setbody();
//==============================================================================

        Cat cat1=new Cat();    // hàm Cat.java thường dùng hơn 
        cat1.setName("nunu");
        System.out.println(cat1.getName());
        cat1.Age = 188888;
        System.out.println(cat1.Age);
    }
}

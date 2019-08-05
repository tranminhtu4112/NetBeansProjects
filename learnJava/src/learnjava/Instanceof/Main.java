/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Instanceof;

/**
 *
 * @author Pass
 */
public class Main {
    
    public static void setBla(Animal a){
      
    }
    
    public static void method(Animal a) {
        if (a instanceof Dog) {
            Dog d = (Dog) a;// downcasting
            System.out.println("downcasting is ok");
        }else{
            System.out.println("downcasting is not ok");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        System.out.println("Dog instanceof Animal : "+(dog instanceof Animal));
        Animal ani = new Animal();
        System.out.println("ani instanceof Dog : "+(ani instanceof Dog));
        dog = null;
        System.out.println("Dog = nnull instanceof Animal : "+(dog instanceof Animal));
                            // => false
    //===================================================================================
    //  Dog d = new Animal(); Compilation error 
//      Dog d = (Dog)new Animal(); Compile ok, nhưng lỗi ngoại lệ ClassCastException lúc runtime
  
        setBla(dog);
        Dog ddd = new Dog();
        method(ddd);    
        
        Animal asd = new Dog(); // Được đây là dowcasting
        asd.move();
       // asd.eat();  không sử dụng được phương thức của class Dog
        System.out.println(asd instanceof Animal);  // true
        System.out.println(asd instanceof Dog);     // true
     
        Animal w = new Dog();
       // w thuộc kiểu Dog nhưng chỉ sd phương thức của Animal
    }
    // Khi kiểu của lớp con tham chiếu tới đối tượng của lớp cha được gọi là downcasting
}

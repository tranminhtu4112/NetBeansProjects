package learnjava.Enumeration;

import java.util.Arrays;

public class Main {
	public static void main (String []args) {
		
		Drinks drinkCafe = Drinks.CAFE; // tạo ra cafe 
		System.out.println(drinkCafe); // CAFE
		System.out.println(drinkCafe.getName()); // "cafe"
		drinkCafe.setName("cafe Viet");
		System.out.println(drinkCafe.getName());
		
		Drinks drinkTea = Drinks.TEA;
		System.out.println(drinkTea); // in ra Tên Biến luôn
                System.out.println("Tên phụ: " + drinkTea.getName());
                drinkTea.setName("Setted name is Tea");
                System.out.println("Tên phụ thay đổi: " + drinkTea.getName());
                
                Drinks drinkFin = Drinks.Cafefin;
                System.out.println(drinkFin);
                System.out.println(drinkFin.getMark());
                
	}
}

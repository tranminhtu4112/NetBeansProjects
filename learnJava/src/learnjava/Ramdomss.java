/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;
import java.util.Random;
/**
 *
 * @author Pass
 */
public class Ramdomss {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        int a=rd.nextInt();
             System.out.println(a);
             
        int c=rd.nextInt(10); // 0 => 9
            System.out.println(c);
            
            // CT tính từ random [a;b]
            /*
            x=a;
            Số gốc trong nextInt = b-a+1;         
            vd   int rd1=-2+rd.nextInt(5);
            */
        int a1=-2+rd.nextInt(5);// -2 =>2
            System.out.println(a1);
             int q=5+rd.nextInt(8);// 5=>12
            System.out.println(q);
            
            float floatNumber = rd.nextFloat(); 
            System.out.println("Số vừa được sinh ra là " + floatNumber);
            double doubleNumber = rd.nextDouble();  
            System.out.println("Số vừa được sinh ra là " + doubleNumber);
            long longNumber = rd.nextLong();
            System.out.println("Số vừa được sinh ra là " + longNumber);
            boolean bool = rd.nextBoolean();
            System.out.println("Giá trị của biến bool là " + bool);
    }
}

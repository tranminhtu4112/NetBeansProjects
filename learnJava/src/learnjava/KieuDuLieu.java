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
public class KieuDuLieu {

    public static void main(String[] args) {

        byte a1, a2, a3;
        a1 = 10;
        a2 = 2;
        a3 = (byte) (a1 / a2); // kiểu dữ liệu byte với short khi chi như thế này thì phải ép kiểu theo nó (số bit nhỏ hơn int)
        System.out.println("gia tri : "+(a3));
        //=================================================    
        short b1, b2, b3;
        b1 = 300;
        b2 = 2;
        b3 = (short) (b1 / b2);
        System.out.println(b3);
        //=================================================
        float firstfloat = 1 / 3f;
        double firstdouble = 1 / 3d;
        System.out.println(firstfloat);
        System.out.println(firstdouble);
        System.out.format("lam tron kieu format: %.2f\n",firstfloat);
        //=================================================
        // tính diện tích hình tròn có bân kính 5
        System.out.println("DIen tich hinh tron: " + 3.14 * 5 * 5);
        //=================================================
        int x1=2,x2=1,x3;
        float z=3.2f;
      
        x3= (x1/x2);
        //x3=(int)z; // lao tron thanh so nguyen
        System.out.println("gia tri : "+(z));
        String tr= Float.toString(z);// Chuyển số thành chuỗi
        System.out.println( tr instanceof String);
        //=================================================
        
        //
        int ms = 100;
        String msstr = String.valueOf(ms);
        System.out.println("Su dung String.valueOf : "+msstr+100);
        
          float ms1 = 100;
        String msstr1 = String.valueOf(ms1);
        System.out.println("Su dung String.valueOf : "+msstr1+100);
     
        
         Float zz=Float.valueOf(z);
         //zz=null;
            System.out.println(zz instanceof Float);
            
            
         
         
        
        // (biến để kiểm tra) instanceof (dũ liệu cần xét)
        // => đúng thì trả về true, sai thì false
        // nếu biến có giá trị là null thì kt luôn là false
        
    }
}

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
public class HamToanHoc {
    
    public static int max (){  // không có static cũng được
        return 100;
    }
    public  static final int kkk =999999999;
// Tìm min trong 2 số
    public static float Min2Number(float a, float b){     
        return Math.min(a, b);        
    }
    public static int Min2Number(int a, int b){
        return Math.min(a, b);
    }
    public static double Min2Number(double a, double b){
        return Math.min(a, b);
    }
    
    // Tìm max trong 2 số
    public  static float Max2Number (float a, float b){
        return Math.max(a,b);
    }
    
    // Tính lũy thừa (a mũ n)
    public static double PowNumber (double number, double pus){
        return Math.pow (number,pus);
    }
    
    // Tính căn bậc 2
    public static double SqrtNumber (double a){
        return Math.sqrt(a);
    }
    
    public static void main(String[] args) {
        int a=10;
        int a1=-2;
        float b=5.5f;
        System.out.println("Min : "+Min2Number(a, b));
        System.out.println("Max : "+Max2Number(a, b));
        System.out.println("Pow : "+PowNumber(a, 2));
        System.out.printf("Pow : %.2f\n",SqrtNumber(a));
        
        // Lấy trị
        System.out.println("Abs : "+Math.abs(a1));
        // Sinh 1 số ngẫu nhiên từ 0 => 1
         System.out.println("Random : "+Math.random());
         
        /*
        Math.ceil(a) lấy số nguyên trên a a=3.5 => a=4
        Math.floor(a) lấy số nguyên dưới a a=3.5 => a=3
        Math.round(a) làm tròn a a=3.5 => a=4
        */
    }

    void cConstructors_1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

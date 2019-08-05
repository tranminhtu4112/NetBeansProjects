/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_tendangnhap;

/**
 *
 * @author Pass
 */
import java.math.*;
import java.util.Scanner;

public class Exercise2 {

    private float a;
    private float b;
    private float c;
    
    public static void giaiPhuongTrinhBac2(float a, float b, float c){
        float delta = (float)(b*b - 4*a*c);
        if(a != 0){
            if(delta > 0){
                float x1 = (float) ((-b + Math.sqrt(delta))/(a*2));
                float x2 = (float) ((-b - Math.sqrt(delta))/(a*2));
                System.out.println("Nghiem pt: x1 = "+x1+", x2 = " +x2); 
                return;
            }
            if(delta == 0){
                float x = -b/(2*a);
                System.out.println("nghiem kep pt: x = "+x);
                return;
            }
            System.out.println("Phuong trinh vo nghiem");
            return;
        }
        if(b != 0){
            System.out.println("Nghiem pt x = " + (float)(-c/b));
            return;
        }
        System.out.println("Phuong trinh vo so nghiem");
        
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }
    
    public static void main(String[] args) {
        
        Exercise2 pt = new Exercise2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a:");
        pt.setA(scan.nextFloat());
         System.out.println("Nhap a:");
        pt.setB(scan.nextFloat());
         System.out.println("Nhap a:");
        pt.setC(scan.nextFloat());
        giaiPhuongTrinhBac2(pt.getA(), pt.getB(), pt.getC());
    }
}

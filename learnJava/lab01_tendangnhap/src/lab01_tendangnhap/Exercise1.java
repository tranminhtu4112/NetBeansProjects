/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_tendangnhap;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Nhap ban kinh duong tron:");
        float banKinhDuongTron = new Scanner(System.in).nextFloat();
        float dienTichDuongTron = (float) (banKinhDuongTron*banKinhDuongTron*PI);
        System.out.println("Dien tich duong tron la: " + dienTichDuongTron);
    }
    
}

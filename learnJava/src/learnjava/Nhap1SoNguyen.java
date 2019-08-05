/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class Nhap1SoNguyen {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        int n = 0;
        System.out.print("Nhap so nguyen: ");
        while (true) {
            try {
                str = scanner.nextLine();
                n = Integer.parseInt(str);
                System.out.println("So ban nhap la: " + n);
                break;
            } catch (Exception e) {                
                System.out.print("Nhap lai : ");
            }
        }
    }
}

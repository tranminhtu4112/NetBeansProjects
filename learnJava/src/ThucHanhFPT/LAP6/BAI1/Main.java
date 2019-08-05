/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LAP6.BAI1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap ho va ten: ");
        String fullName = new Scanner(System.in).nextLine();
        System.out.println("Ho ten vua nhap : " + fullName);
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.lastIndexOf(" "), fullName.length());
        System.out.println("Ho ten in hoa : " + lastName.toUpperCase(Locale.ENGLISH) + firstName.toUpperCase());
    }
}

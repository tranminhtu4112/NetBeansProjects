/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idea.CreateUser;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Pass
 */
public class CreateCheak {

    public static int id = -1;

    public static String checkAccout(String accout) {

        String regex = "^[a-zA-Z][a-zA-Z]+_?[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accout);
        if (matcher.matches()) {
            return accout;
        }
        return "No";
    }

    public static String createAccout(String[] dataAccout) {
             
        while (true) {
            System.out.print("Nhap tai khoan: ");
            String accout = new Scanner(System.in).nextLine();
            while (true) {

                if (checkAccout(accout) == accout) {
                    if (id == 0) {
                        return accout;
                    } else {
                        for (int i = 0; i <=id; i++) {
                            if (accout.equals(dataAccout[i])) {
                                System.out.println("Bi trung nhap lai");
                                break;
                            } if(i == id) {
                                return accout;
                            }
                        }
                        break;
                    }
                } 
                    break;
            }

        }
    }

    public static String checkPass(String pass) {

        String regex = "^\\w\\w+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);
        if (matcher.matches()) {
            return pass;
        }
        return "No";
    }

    public static String createPass() {
        while (true) {
            System.out.print("Nhap mat khau: ");
            String pass = new Scanner(System.in).nextLine();
            if (checkPass(pass) == pass) {
                System.out.println("Dang ki thanh cong!");
                return pass;
            } else {
                System.out.println("Nhap lai");
            }
        }
    }

    public static void pregisterAnAccount(String[] dataAccout, String[] dataPass) {
        id++;
        System.out.println("Tai khoan da co:");
        for (int i = 0; i<id; i++) {
            System.out.println(dataAccout[i]);
        }
        System.out.println("======================");
        dataAccout[id] = createAccout(dataAccout);
        dataPass[id] = createPass();
    }

    public static void Menu() {

        System.out.println("==================================");
        System.out.printf("||%13sMENU%13s||\n", " ", " ");
        System.out.printf("||%2s1.Dang ki%19s||\n", " ", " ");
        System.out.printf("||%2s2.Dang nhap%17s||\n", " ", " ");
        System.out.printf("||%2s0.Thoat%21s||\n", " ", " ");
        System.out.println("==================================");
    }

    public static void DangKi(String[] dataAccout, String[] dataPass) {

        System.out.println("==================================");
        System.out.printf("%14sDang ki%13s\n", " ", " ");
        pregisterAnAccount(dataAccout, dataPass);
        System.out.println("==================================");
    }

    public static void DangNhap(String[] dataAccout, String[] dataPass) {

        System.out.println("==================================");
        System.out.printf("%12sDang Nhap%13s\n", " ", " ");
        //  pregisterAnAccount(dataAccout,dataPass);
        System.out.print("Nhap tai khoan: ");
        String accout = new Scanner(System.in).nextLine();
        System.out.print("Nhap mat khau: ");
        String pass = new Scanner(System.in).nextLine();
        int check = 0;
        for (int i = 0; i <= id; i++) {
            if (accout.equals(dataAccout[i]) && pass.equals(dataPass[i])) {
                System.out.println("Dang nhap thanh cong!");
                check = 1;
                break;
            }
        }

        if (check == 0) {
            System.out.println("Khong ton tai!");
        }

        System.out.println("==================================");
    }

    public static int checkNumerInt() {

        int n = -1;
        while (true) {
            try {
                String str = new Scanner(System.in).nextLine();
                n = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("Nhap lai: ");
            }
        }
        return n;
    }

    public static void MainID(String[] dataAccout, String[] dataPass) {

        Menu();
        int select = -1;
        while (select != 0) {

            System.out.print("Nhap chuc nang:  ");
            select = checkNumerInt();

            switch (select) {

                case 1:
                    DangKi(dataAccout, dataPass);
                    break;
                case 2:
                    DangNhap(dataAccout, dataPass);
                    break;
                case 0:
                    System.out.printf("%13sDa thoat!\n", " ");
                    select = 0;
                    break;
                default:
                    System.out.println("Khong co chuc nang nay!");
            }
        }
    }

    public static void main(String[] args) {

        String[] dataAccout = new String[50];
        String[] dataPass = new String[50];
        MainID(dataAccout, dataPass);
    }

}

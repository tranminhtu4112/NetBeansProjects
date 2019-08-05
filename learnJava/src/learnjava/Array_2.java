/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class Array_2 {

    public static void setArrStr(String []Arr,int n){
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<n;i++) {
            
            System.out.print("Nhap sv "+i+" :");
            Arr[i] = scan.nextLine();
            
        }
    }
    
    public static void main(String[] args) {
        
        String [] sv = new String[]{"Tu","Tuan","Manh","Hai"};
        
        System.out.println(Arrays.toString(sv));
        
        Arrays.sort(sv);
        
        System.out.println(Arrays.toString(sv));
        
        String [] sv2 = new String[4];
      // setArrStr(sv2,4);
        System.out.println(Arrays.toString(sv2));
    //====================================================================================    
        int [][]inter =new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.println("Do dai: "+inter.length);
        System.out.println("Dòng 1 cột 1: "+inter[1][1]);
        for (int i = 0; i < inter.length; i++) {
            for (int j = 0; j < inter[i].length; j++) { // Dòng i có bao nhiêu phần tử
                System.out.print(inter[i][j]+" ");
            }
            System.out.println("");
        }
    //====================================================================================
        System.out.println("Dùng fore: ");
            for (int[] is : inter) {
                for (int j : is) {
                     System.out.print(j+" ");
                }
                System.out.println("");
            }
            
    }
}

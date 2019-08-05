/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Arrays;

/**
 *
 * @author Pass
 */
public class Array {
    
    public static void main(String[] args) {
      
        int a[];   // Mảng số nguyên chưa biết phần tử
        //System.out.println("\nDo dai:"+a.length);  => Không được vì chưa khai báo số lượng mảng
        int []b;    // Mảng số nguyên chưa biết phần tử
        String str[];   // Mảng String chưa biết phần tử
        String []str1 = new String[5];  // Mngr chứa 5 chuỗi
//======================================================================        
        int c[] = new int[5];
        c[0] = 1;
        System.out.println(c[0]);
//======================================================================        
        int d[] = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            System.out.print(d[i]+"  ");
        }
        for (int x: d){
            System.out.println(x);
        }
//======================================================================        
        int e[] = new int[]{100,25,70,10,-58};
        for (int i = 0; i < 5; i++) {
            System.out.print(e[i]+"  ");
        }
        System.out.println("\nDo dai:"+e.length);
        System.out.println("\n");
//======================================================================    
        System.out.println("So luong phan tu mang a : "+c.length);
//======================================================================
        System.out.print("Dung for each: ");
        for(int z : d){
            System.out.print(z+" ");
            System.out.println("\n");
        }
        System.out.println(Arrays.toString(e));
        Arrays.sort(e);
        System.out.println(Arrays.toString(e));
        System.out.println("Vi tri phan tu 70 la: "+Arrays.binarySearch(e,70));
        Arrays.fill(e,50);
        System.out.println("Tat ca thanh 50: "+Arrays.toString(e));         
    }
}

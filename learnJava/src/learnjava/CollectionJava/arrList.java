/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.CollectionJava;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pass
 */
public class arrList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(4);
        arrList.add(6);
        arrList.add(8);
        
        arrList.remove(0); // sau khi xóa index thứ 0 thì các index còn lại gán dồn về trước
        System.out.println(arrList.size());
        System.out.println("Sau khi xoa index 0: "+arrList.get(0));
        
        for (Integer integer : arrList) {
            System.out.println("Xuat: "+integer);
        }
        
        System.out.println(arrList.indexOf(1000)); // tim giá gị rồi trả về index
    //=============================================================================================
    
        // CHuyển Array thành ArrayList dùng : asList();
        // Chuyển ArrayList thành Array dùng ; toArray();
        
        String []str = {"Tran","Mỉnh","Tu"};
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
        for (String string : strList) {
            System.out.println(string);
        }
        
        String [] str2 = new String[strList.size()];
        strList.toArray(str2);
        System.out.println(Arrays.toString(str2));    
        
        ArrayList <Integer> intr = new ArrayList<>();
    }
}

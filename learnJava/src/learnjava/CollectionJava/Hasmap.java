/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.CollectionJava;

import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author Pass
 */
public class Hasmap {
    
    public static void main(String[] args) {
        
        Map<String, String> sinhvien = new HashMap<String, String>();
        sinhvien.put("123", "Tran Minh Tu");
        sinhvien.put("456", "Tran Minh A");
        sinhvien.put("789", "Tran Minh B");
        System.out.println(sinhvien);
        
        Set<String> keySet = sinhvien.keySet();
        System.out.println(keySet + "\tSố lượng: " + keySet.size());
        
        for(String str : keySet)
            System.out.println(str + " " + sinhvien.get(str));
        
        System.out.println("------------------------------------");
        
        sinhvien.remove("123");
        System.out.println("Xuất sinh viên key 123: " + sinhvien.get("123"));
        System.out.println(sinhvien.get("456"));
        
        System.out.println("------------------------------------");
        
        for(Entry<String, String> s : sinhvien.entrySet()) // entryset trả về key và value
            System.out.println(s.getKey()+ " : " + s.getValue()); 
        
    

    }
}

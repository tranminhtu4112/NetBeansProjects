/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.CollectionJava.CollectionInterface;

import java.util.*;


/**
 *
 * @author Pass
 */
public class Main {

    public static void main(String[] args) {
        List al = new ArrayList();
        al.add("Tran");
        al.add("Minh");
        al.add("Tu");
        System.out.println("Các phần tử ArrayList: " + al);
        
        List l1 = new LinkedList();
        l1.add("Tran");
        l1.add("Minh");     
        l1.add("Tu");
        System.out.println("Các phần tử LinkedList: " + l1);
        
        Set s1 = new HashSet(); 
        s1.add("Tran");
        s1.add("Minh");         
        s1.add("Tu");
        System.out.println("Các phần tử SetNap: " + s1);

        Map m1 = new HashMap(); 
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println("Các phần tử của HasMap: " + m1);
        System.out.println(m1.get("Zara"));

        System.out.println(al.get(1));
        System.out.println(al.indexOf("Minh"));
    }
}

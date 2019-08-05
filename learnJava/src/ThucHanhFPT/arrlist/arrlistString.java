/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.arrlist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Pass
 */
public class arrlistString {
    
    public static void main(String[] args) {
        
        ArrayList <String> ques = new ArrayList<>();
        ques.add("What's your name?");
        ques.add("How's going?");
        ques.add("What's up guys?");
        ques.add("How was it?");
        
        for (String que : ques) {
            System.out.println(que);
        }
        
        System.out.println("\nSau khi dùng shuffle:\n");
        Collections.shuffle(ques); // Hoán vị ngẫu nhiên các phần tử trong ArrayList 
        
        for (String que : ques) {
            System.out.println(que);
        }
         
        System.out.println("\nSau khi dùng Swap:\n");
        Collections.swap(ques, 0, 1);   // Hoán vị vị trí 0 với 1
        for (String que : ques) {
            System.out.println(que);
        }
        
        System.out.println("\nSau khi Sort shuffle:\n");
        Collections.sort(ques); // Sắp xếp tăng
        for (String que : ques) {
            System.out.println(que);
        }
        
        System.out.println("\nSau khi dùng reversee:\n");
        Collections.reverse(ques); // Sắp xếp giảm
        for (String que : ques) {
            System.out.println(que);
        }
    }
}

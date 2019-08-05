/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.ExceptionHandling;

/**
 *
 * @author Pass
 */
public class TryCatch {
    public static void main(String[] args) {
        
    /*  // Lỗi 
        int n = 2;
        int c = n/0;
        System.out.println(c);
    */
        try {
            int n = 2/0;         
            System.out.println("Không xuất hiện line này");
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
        }finally{
            System.out.println("Lỗi hay không vẫn thực hiện trong finally");
        }
        System.out.println("...");
    }
}

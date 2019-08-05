/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

 
/**
 *
 * @author Pass
 */
public class hello{ 
    public static void main (String[] args){
        System.out.println("Hello java");    
        for(int i=65;i<100;i++){
            System.out.print((char)i+" ");
        }
        System.out.println("\nMa cua 'A' trong ASCII: "+(int)'A');
        
        SinhVien a = new SinhVien();
        a.name = "TR";
    }
}
class SinhVien{
     public String name;
     public int age;
};
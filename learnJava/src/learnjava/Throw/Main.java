/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Throw;

/**
 *
 * @author Pass
 */
public class Main{
        
    public static void validate(float tuoi){  
        try{
        if(tuoi < 18)
            throw new ArithmeticException("Khong hop le");     
        else  
            System.out.println("Chao mung ban den bo phieu");  
        }
        catch(Exception e){       
            System.out.println("Lỗi đã được xử lí nên ko chết process : " + e.getMessage());
        }
    }  
//=============================================================================
    public static void validate(int tuoi){  
        if(tuoi < 18) 
            throw new ArithmeticException("Khong hop le");  // Vì lỗi chưa được xử lí nên sẽ chết process
        else  
            System.out.println("Chao mung ban den bo phieu");       
        }  
//=============================================================================    
    public static void main (String args[] ){  
      validate(12.2f);
      System.out.println("...");
      validate(13);  
      System.out.println("Phan code con lai...");  
    }  
}

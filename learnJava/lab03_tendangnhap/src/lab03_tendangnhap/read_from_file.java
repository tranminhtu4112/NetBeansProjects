/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_tendangnhap;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Pass
 */
public class read_from_file {
    
    public static void main(String[] args) throws IOException {
        
        try {
            FileReader fileReader = new FileReader("nhanvien.txt");
            
            int c = fileReader.read();
            while (c != -1) {                
                System.out.print((char)c);
                c = fileReader.read();
            }
            
            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
       
    }
}

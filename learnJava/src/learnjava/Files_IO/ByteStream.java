/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Files_IO;
import java.io.*;
/**
 *
 * @author Pass
 */
public class ByteStream {
    
    public static void main(String[] args) throws IOException{
        
        File f = new File("C:\\Users\\Pass\\Documents\\NetBeansProjects\\learnJava\\src\\learnjava\\Files_IO\\test1.txt");
        if(!f.exists()) // exists nghĩa là file tồn tại phải chưa
            f.createNewFile();
        
        FileInputStream fileInputStream = new FileInputStream(f);
        
        int c = fileInputStream.read(); // đọc từng kí tự theo mã ASCii
        
        while (c != -1) {            
            System.out.print( (char) c );
            c = fileInputStream.read();
        }
        fileInputStream.close();
// ================================================================

        FileOutputStream fileOutputStream = new FileOutputStream(f);
        String s = "Ghi ra file";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
            
    
    }
     
}

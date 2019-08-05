/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.FileJava;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Pass
 */
public class createFile {
    
    public static void main(String[] args) throws IOException {
        String pathname = "C:\\Users\\Pass\\Desktop\\tmtdos.txt";
        File f = new File(pathname);
        f.createNewFile();     
        System.out.println("File đã được tạo nên: "+f.createNewFile());
        System.out.println("Đường dẫn file: "+f.getAbsolutePath());
        System.out.println(f.getAbsoluteFile());
        System.out.println("Kích thước file: "+f.length()+" bytes");
     //   f.delete();
        File f1 = new File("C:\\Users\\Pass\\Desktop\\tmtdos2222.txt");
        f.renameTo(f1); // Đổi tên file
 
 
    //==========================================================================
    
        try {  
            File file = new File("C:\\Users\\Pass\\Desktop\\javaFile123.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}

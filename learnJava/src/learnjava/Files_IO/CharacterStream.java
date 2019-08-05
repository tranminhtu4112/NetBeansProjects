/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Files_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Pass
 */
public class CharacterStream {
    public static void main(String args[]) throws IOException
    {
        File f = new File("C:\\Users\\Pass\\Documents\\NetBeansProjects\\learnJava\\src\\learnjava\\Files_IO\\test1.txt");
        if(!f.exists())
             f.createNewFile();
        
        FileReader fileReader = new FileReader(f);
        
        
        try {         
        int c = fileReader.read();
        while (c != -1) {
             System.out.print((char)c);
             c = fileReader.read();
        }
        } finally {
            fileReader.close();
        }
        
        FileWriter fileWriter = new FileWriter(f); // khi nào cần thì mới khai báo hàm này 
        // khai báo sớm sẽ ko đọc dc file

//        String s = "ffffff";
//        fileWriter.write(s);
//        fileWriter.close();
   }
}

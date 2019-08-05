/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Files_IO;

import java.io.IOException;

/**
 *
 * @author Pass
 */
public class Stream {
    public static void main(String[] args) throws IOException {
        System.out.println("simple message");
        System.err.println("error message");
        int i = System.in.read();
        System.out.println(i); // in ra ma ACKII
        System.out.println((char)i);
    }
}

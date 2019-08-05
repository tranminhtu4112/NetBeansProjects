/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import static learnjava.HamToanHoc.kkk;
import static learnjava.HamToanHoc.Min2Number;

/**
 *
 * @author Pass
 */
public class Constructors_1 {

    public static void main(String[] args) {
        // class Person.java
        Person pson1 = new Person("Tran Minh Tu", 18);
        // Person pson1= new Person();
        //  pson1.Person("Tran Minh Tusss", 18);
        System.out.println(pson1.GetName());
        System.out.println(pson1.getAge());
//========================================================
        HamToanHoc a = new HamToanHoc();
        System.out.println(a.max());
        System.out.println(kkk);
        System.out.println(Min2Number(2, 1));
   //========================================================     
        pson1.setName("TMT");
        System.out.println(pson1.GetName());

    }

}

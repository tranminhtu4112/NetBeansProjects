/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.interfaceJava;

/**
 *
 * @author Pass
 */
public class A implements Interface,InfoIInterface{
    private static int id = 0;
    @Override
    public void display(){
        System.out.println("Here is A");
    }
    @Override
    public void getId(){
        id++;
        System.out.println("Id of A is :"+ id);
    }
}

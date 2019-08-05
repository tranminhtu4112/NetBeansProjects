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
public class Dog {
    public String Name;  //Dùng public là có thể sử dụng cho các class khác
    public int Age;
    private float Height;  //Dùng private thì chỉ trong khu vực của class đó
    private float Weight;
    public void setbody(){
        System.out.println(Name+"-"+Age);
    }
}

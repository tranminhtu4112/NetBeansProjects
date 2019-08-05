/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.SinhVien.OverallSV;



/**
 *
 * @author Pass
 */
public class PersonAll extends date{
    private String name;
    private int age;
    private date date;

    public PersonAll() {
    }

    
    public PersonAll(String name,int date,int mounth,int year) {
        super.setDate(date, mounth, year);
        this.name = name;
    }     
    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public String getName (){
        return this.name;
    }
    public int getAge (){
        return this.age;
    }
      
}


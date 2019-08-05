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
public class Person {
    private String Name;
    private int Age;
    
    public Person(){ // Hàm reset   // constructor
        this.Age=0;
        this.Name="Unknow";
    }
    
    public Person(String name,int age){   // constructor
        this.Name=name;
        this.Age=age;
    }
    public String GetName(){
        return Name;
    }     
    public int getAge(){
        return Age;
    }  

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
}

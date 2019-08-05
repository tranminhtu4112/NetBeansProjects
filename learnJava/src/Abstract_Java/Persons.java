/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Java;

/**
 *
 * @author Pass
 */
public abstract class Persons { 
    
    private String aname;

    public void setName (String name){  
        this.aname = name;
    }
    
    public String getName (){
        return this.aname;
    }
    
    public abstract void getAge();
    
    public abstract void getCity();
    
//    public abstract String getTen();
   
    public abstract class B{};
}

// 1 lớp trừu tường được kế thừa
// Trong class class có phương thức abstract thì class đó phải là abstract class
//  Các phunogw thức của lớp cha thì được @override bởi lơp con
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
public class Studentss extends Persons{   // Phải kế thừa hết các phương thức abstract của cha 
                                         // thì class Studentss mới ko có abstract
                                         
    private String f;
    
    public void setF(String f){
        super. setName("ryyy");       // super
        this.f = f;
    }
 
    @Override
    public void getAge(){
        System.out.println("18");
    }

    @Override
    public void getCity(){  
        System.out.println("TPHCM");
    }
    
}

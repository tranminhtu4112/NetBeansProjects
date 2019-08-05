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
public class Cat extends Dog{
    private String name;
    private String color;
    private int height;
    private float weight;
    
    public void setName(String NAME){
        
        System.out.println("Day la ten vua set:");
        this.name=NAME.toLowerCase();// đổi thành chữ thường hết        
    }
    
    public String getName(){
        
        return name;
    }
    
}

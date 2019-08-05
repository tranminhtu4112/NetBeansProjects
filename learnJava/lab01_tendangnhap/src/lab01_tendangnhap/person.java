/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_tendangnhap;

/**
 *
 * @author Pass
 */
public class person {
    protected String id;
    protected String name;
    protected int age;

    public person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public person(){};

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}

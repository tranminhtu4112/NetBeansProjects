/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_tendangnhap;

import java.util.Scanner;

/**
 *
 * @author Pass
 */
public class student extends person implements personExample{
    
    private int mark;
    private String grade;

    public student(){};
    
    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public void calGrade(){
        
        if(this.mark >= 0)
            this.grade = "fail";     
        if(this.mark >= 5)
            this.grade = "pass";
        if(this.mark >= 7)
            this.grade = "credit";
        if(this.mark >= 8)
            this.grade = "distinction";
        
        
    }
    @Override
    public void input(){
        Scanner in = new Scanner(System.in);
        this.name = in.nextLine();
        this.id = in.nextLine();
        this.age = in.nextInt();
        this.mark = in.nextInt();
        this.calGrade();
    }
    @Override
    public void display(){
        System.out.println("==============================");
        System.out.println(this.getName());
        System.out.println(this.getId());
        System.out.println(this.getAge());
        System.out.println(this.getMark());
        System.out.println(this.getGrade());
    }
    
    public static void main(String[] args) {
        
        student st = new student();
        st.input();
        st.display();
    }
}

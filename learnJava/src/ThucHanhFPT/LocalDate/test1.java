/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LocalDate;

import java.time.LocalDate;

/**
 *
 * @author Pass
 */
public class test1 {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();
        date = date.minusDays(today-1);
        int FirstDayOfWeek = date.getDayOfWeek().getValue();
        System.out.println(date.getDayOfMonth()+"  "+date.getDayOfWeek());
       
        System.out.println("Sun Mon Tue Wed Thus Fri Sat ");
        for (int i = 0; i < FirstDayOfWeek; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {            
            System.out.printf("%3d",date.getDayOfMonth());
            if(today == date.getDayOfMonth()){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 7){
                System.out.print("\n");
            }
        }       
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Pass
 */
public class localDate {
    
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
        System.out.println( date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+
                            date.getYear());
        if (date.getDayOfMonth()==14) {
            System.out.println("OK");
        }
        LocalDateTime d = LocalDateTime.now();  // LocalTime (Chỉ có giờ phút giây)
            System.out.println(d);
        System.out.println("===========================================");    
        
            int month = date.getMonthValue(); // tháng hiện tại
            
            int today = date.getDayOfMonth();   // ngày hiện tại trong tháng này
            
            date = date.minusDays(today-1); // kể từ lúc này date.getDateOfMonth() = 1; Đây là ngầy đầu tiên của tháng
            //          Ngày hiện tại - (ngày hiện tại - 1)
            
        System.out.println(date.getDayOfWeek()); // xuất ra ngày hiện tại trong tuần (1 => 7)
                                                 // lấy ra ngày đầu tiên trong tuần đầu của tháng => máy tự hiểu

            int value = date.getDayOfWeek().getValue(); 
            System.out.println(value);
            
            System.out.println("Sun Mon Tue Wed Thus Fri Sat ");
            for (int i = 1; i < value; i++) {
                System.out.print("    ");
            }
                
                while (date.getMonthValue() == month) {                    
                    System.out.printf("%3d",date.getDayOfMonth());
                    
                    if (date.getDayOfMonth() == today) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    date = date.plusDays(1);
                    
                    if(date.getDayOfWeek().getValue() == 1)
                        System.out.print("\n");      
                }
                     
            
        
    }


}

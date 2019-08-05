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
public class date {
    private int date,mounth,year;      
        public void setDate(int date,int mounth,int year){
            this.date = date;
            this.mounth = mounth;
            this.year = year;
        }
        public void displayDate (){          
            System.out.println(this.date+"-"+this.mounth+"-"+this.year);
        }
        public date(){
            this.date = 0;
            this.mounth = 0;
            this.year = 0;
        }
}

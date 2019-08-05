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
public class Main  {
   
    public static void main(String[] args) {
        
        Persons st = new Persons() {
            @Override
            public void getAge() {
                System.out.println("XXX");
            }

            @Override
            public void getCity() {
                System.out.println("AAA");
            }
        };
        
        st.getAge();
        st.getCity();
        
        Persons st1 = new Studentss();
        st1.getAge();
        st1.getCity();
        
        Studentss st2 = new Studentss();    
        st2.setF("fffffffffffff");
        st2.getName();  // Vì kế thừa nên có thể lấy phương thức của lớp cha
        
    }
}

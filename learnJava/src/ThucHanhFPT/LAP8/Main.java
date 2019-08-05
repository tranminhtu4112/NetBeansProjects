package ThucHanhFPT.LAP8;

import java.util.Arrays;

public class Main {
    public static String toUpperFirstChar(String s){
            
            String []str = s.split(" ");
            for (int i = 0; i < str.length; i++) {
                char firstChar = str[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase(); // Chuyển về dạng chuỗi
                str[i] = upperFirstChar + str[i].substring(1);
            }
            String ss = new String();
            for (int i = 0; i < str.length; i++) {
                ss = ss + str[i] +  " "; 
            }
            return  ss;
            
        }
    
	public static void main (String [] args) {
		xPoly x = new xPoly();
		float f = 0.5f, f1 = 8.5f;
		System.out.println(x.sum(f1, f));
	
                String name = "tran minh tu";
                String a[] = name.split(" ");
                System.out.println(Arrays.toString(a));
                
                System.out.println(toUpperFirstChar(name));
        }
}

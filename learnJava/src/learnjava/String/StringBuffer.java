/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.String;

/**
 *
 * @author Pass
 */
public class StringBuffer {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Minh");

        // Phương thức append 
        sb.append(" Tu");
        System.out.println("1 " + sb);

        // Phương thức insert
        sb.insert(0, "Tran ");
        System.out.println("2 " + sb);

        // Phương thức replace
        sb.replace(1, 4, "xxx");
        System.out.println("3 " + sb);

        // Phương thức delete
        sb.delete(0, 5);
        System.out.println("4 " + sb);

        // Phương thức reverse
        sb.reverse();
        System.out.println("5 " + sb);
        sb.reverse();

        // Phương thức capacity
        /* 
            Phương thức capacity() trả về dung lượng capacity hiện tại của bộ đệm. 
            Dung lượng capacity mặc định của bộ đệm là 16. Nếu số ký tự tăng lên từ dung lượng hiện tại, 
            nó tăng dung lượng theo công thức (oldcapacity*2)+2. Ví dụ, nếu dung lượng hiện tại là 16, nó sẽ là (16*2)+2=34. 
         */
        StringBuilder sb2 = new StringBuilder();
        System.out.println("Mặc định : " + sb2.capacity()); // = 16
        sb2.append("Java");
        System.out.println("Java : " + sb2.capacity());
        sb2.append(" là ngôn ngứ lập trình");
        System.out.println(sb2 + " : " + sb2.capacity()); // 34
        sb2.append(" mạnh mẽ");
        System.out.println(sb2 + " : " + sb2.capacity());  //34 vì chưa vượt quá dung lượng

        // Phuong thức ensureCapacity
        /*
            Phương thức ensureCapcity() bảo đảm rằng capacity ít nhất bằng với minimum đã cho.
            Nếu nó lớn hơn capacity hiện tại, nó tăng capacity theo công thức (oldcapacity*2)+2.
            Ví dụ, nếu dung lượng hiện tại là 16, nó sẽ là (16*2)+2=34.
         */
        sb = new StringBuilder();  
        System.out.println(sb.capacity());//mac dinh la 16  
        sb.append("Hello");  
        System.out.println(sb.capacity());//bay gio la 16  
        sb.append("Java la mot ngon ngu lap trinh manh me");  
        System.out.println(sb.capacity());//bay gio la (16*2)+2=34 vi du cua cong thuc (oldcapacity*2)+2  
        sb.ensureCapacity(10);//bay gio khong phai thay doi 
        System.out.println(sb.capacity());//bay gio la 34  
        sb.ensureCapacity(50);//now (34*2)+2  
        System.out.println(sb.capacity());//bay gio la 70   
    }
}

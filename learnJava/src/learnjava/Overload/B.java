/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava.Overload;

/**
 *
 * @author Pass
 */
public class B extends A{
    public B (){}
   
/*    public void display(){
        System.out.println("class B");
    }
    
    Nếu để như trên thì phải @override
*/
    public void display(double n){ // khác tham số vào, nếu để int n thì phải @override
        System.out.println(n);
    }
}

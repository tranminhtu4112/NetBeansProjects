/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhFPT.QuanLyNganHang;

/**
 *
 * @author Pass
 */
public class Main {
    
    public static void main(String[] args) {
        
        BankAccout ct1= new BankAccout("Tran Minh Tu",2000);
        ct1.getFull();
        ct1.AddMoney(500);
        ct1.setGetMoney(200);
       ct1.GetMoney(ct1.getGetMoney());
    }
}

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
public class BankAccout {
    
    private String nameAccout;
    private float money;
    private float addMoney;
    private float getMoney;

//=============================================================================
    
    public BankAccout(){
        
        this.nameAccout="Unkonw";
        this.money=0;
    }
    
    public BankAccout(String nameAccout, int money){
        
        this.nameAccout=nameAccout;
        this.money=money;
    }
    
    public void AddMoney(float addMoney){ 
        this.money+=addMoney;
        System.out.println("Ban da nap "+addMoney+" vao tai khoan!");
        System.out.println("Tai khoan hien co: "+this.money+" VND");
    }
    
    public void GetMoney(float getMoney){
        if (getMoney>this.money){
            System.out.println("Khong the rut vi vuot qua so tien hien co!");
        }
        else{
            this.money-=getMoney;
            
            System.out.println("Ban da rut: "+getMoney+" VND");
            System.out.println("So tien con lai: "+this.money+" VND");
        }
    } 
    
    
//=============================================================================
    public void setNameAccout(String nameAccout) {
        this.nameAccout = nameAccout;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void setAddMoney(float addMoney) {
        this.addMoney = addMoney;
    }

    public void setGetMoney(float getMoney) {
        this.getMoney = getMoney;
    }

    public String getNameAccout() {
        return nameAccout;
    }

    public float getMoney() {
        return money;
    }

    public float getAddMoney() {
        return addMoney;
    }

    public float getGetMoney() {
        return getMoney;
    }
    public void getFull(){
        System.out.println("Ten: "+this.nameAccout+" - TK: "+this.money+" VND");
    }
}

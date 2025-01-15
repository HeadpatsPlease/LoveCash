/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lckiosk;

import java.util.ArrayList;

/**
 *
 * @author nexot
 */
public class Accounts {
    private ArrayList <String> account = new ArrayList<>();
    
    public Accounts(){
        account.add(0, "9123456789");
        account.add(1, "1234");
        account.add(2, "0.0");
    }
    
    public String getAccount(int i){
        return account.get(i);
    }
    
    public void setAccount(int i, String e){
        account.set(i, e);
    }
    
    public void updateBalance(double e){
        account.set(2, String.valueOf(e));
    }
    
    public ArrayList <String> getAccountList(){
        return account;
    }
}

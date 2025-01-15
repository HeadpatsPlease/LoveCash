/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lckiosk;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author nexot
 */
public class LcKiosk {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Accounts acc = new Accounts();
        Home home = new Home(acc);
        home.setTitle("LOVE CASH");
        home.setVisible(true);
        

        // TODO code application logic here
    }
    
}

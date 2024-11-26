/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lovecashkiosk;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CashIn extends JFrame implements ActionListener{
    CashIn(){
        JLabel title = new JLabel();
        JLabel type = new JLabel();
        JLabel mobNum = new JLabel();
        JTextField numMob = new JTextField();
        
        title.setText("LOVE CASH");

        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(0,0,900,100);
        
        type.setText("Cash In");
        type.setHorizontalAlignment(JLabel.CENTER);
        type.setVerticalAlignment(JLabel.TOP);
        type.setBounds(0,100,900,100);
        
        
        mobNum.setText("Enter your Mobile Number: ");
        mobNum.setHorizontalAlignment(JLabel.CENTER);
        mobNum.setVerticalAlignment(JLabel.TOP);
        mobNum.setBounds(0,180, 900, 100);
        
        
        numMob.setBounds(380,200,150,30);
        numMob.setText("+63");
        
        this.setSize(990,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

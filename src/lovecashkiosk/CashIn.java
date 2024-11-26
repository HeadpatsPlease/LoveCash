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
        JLabel label1 = new JLabel("LOVE CASH");
        JLabel label2 = new JLabel("CASH IN");
        JLabel label3 = new JLabel("Enter your Mobile Phone: ");
        JLabel label4 = new JLabel("+ 63 ");
        JPanel center = new JPanel();
        
        
        center.setSize(990,990);
        center.setBackground(Color.PINK);
        center.add(label1);
        center.add(label2);
        center.add(label3);
        center.add(label4);
        center.setLayout(null);
        
        label1.setBounds(295,0,200,200);
        label1.setFont(new Font("Arial",Font.PLAIN,25));
        
        label2.setBounds(295,150,200,200);
        label2.setFont(new Font("Arial",Font.PLAIN,25));
        
        label3.setBounds(295,170,300,200);
        label3.setFont(new Font("Arial",Font.PLAIN,25));
        
        label4.setBounds(295,190,200,200);
        label4.setFont(new Font("Arial",Font.PLAIN,25));
        
        this.add(center);
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

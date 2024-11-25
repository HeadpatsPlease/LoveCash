/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lovecashkiosk;

/**
 *
 * @author nexot
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Option extends JFrame implements ActionListener{
     JButton cashIn;
     JButton cashOut;
     JButton balance;
    Option (){
        JLabel label = new JLabel();
        cashIn = new JButton();
        cashOut = new JButton();
        balance = new JButton();
        ImageIcon icon = new ImageIcon("C:\\Users\\nexot\\OneDrive\\Documents\\NetBeansProjects\\LoveCashKiosk\\src\\lovecashkiosk\\LovecashIcon.png");
        
        label.setText("LOVE CASH");
        label.setIcon(icon);
        label.setBounds(235,10,450,460);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("Arial",Font.PLAIN,33));
        
        cashIn.setText("Cash In");
        cashIn.setBounds(235,450,170,100);
        cashIn.setFont(new Font("Arial",Font.PLAIN,25));
        cashIn.setBackground(Color.LIGHT_GRAY);
        cashIn.addActionListener(this);
        
        cashOut.setText("Cash Out");
        cashOut.setBounds(430,450,170,100);
        cashOut.setFont(new Font("Arial",Font.PLAIN,25));
        cashOut.setBackground(Color.LIGHT_GRAY);
        cashOut.addActionListener(this);
        
        balance.setText("Balance");
        balance.setBounds(330,560,170,100);
        balance.setFont(new Font("Arial",Font.PLAIN,25));
        balance.setBackground(Color.LIGHT_GRAY);
        balance.addActionListener(this);
        
        this.add(cashIn);
        this.add(cashOut);
        this.add(balance);
        this.add(label);
        this.setSize(990,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==balance){
            this.dispose();
            new Balance();
        }
    } 
}

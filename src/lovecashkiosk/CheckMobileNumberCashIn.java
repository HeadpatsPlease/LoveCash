/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lovecashkiosk;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CheckMobileNumberCashIn extends JFrame implements ActionListener{
    JLabel loveCash;
    JLabel cashIn;
    JLabel number;
    JLabel digit;
    JTextField tf;
    JPanel center;
    JButton ok;
    
    CheckMobileNumberCashIn(){
        loveCash = new JLabel("LOVE CASH");
        cashIn = new JLabel("CASH IN");
        number = new JLabel("Enter your Mobile Phone: ");
        digit = new JLabel("+ 63 ");
        tf = new JTextField();
        center = new JPanel();
        ok = new JButton("Okay");
        
        
        center.setSize(990,990);
        center.setBackground(Color.PINK);
        center.add(loveCash);
        center.add(cashIn);
        center.add(number);
        center.add(digit);
        center.setLayout(null);
        center.add(tf);
        center.add(ok);
        
        
        tf.setBounds(355,310,250,40);
        tf.setFont(new Font("Arial",Font.PLAIN,25));
        
        loveCash.setBounds(300,0,200,200);
        loveCash.setFont(new Font("Arial",Font.PLAIN,25));
        
        cashIn.setBounds(300,150,200,200);
        cashIn.setFont(new Font("Arial",Font.PLAIN,25));
        
        number.setBounds(300,195,300,200);
        number.setFont(new Font("Arial",Font.PLAIN,25));
        
        digit.setBounds(300,230,250,200);
        digit.setFont(new Font("Arial",Font.PLAIN,25));
        
        ok.setBounds(400,400,100,45);
        ok.setFont(new Font("Arial",Font.PLAIN,23));
        ok.addActionListener(this);
        
        this.add(center);
        this.setSize(990,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok){
         new EnterAmount();
         this.dispose();
    }

    }
}

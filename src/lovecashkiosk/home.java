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
public class home extends JFrame implements ActionListener{
    home(){
        JLabel label = new JLabel();
        JButton start = new JButton();
        ImageIcon icon = new ImageIcon("C:\\Users\\nexot\\OneDrive\\Documents\\NetBeansProjects\\LoveCashKiosk\\src\\lovecashkiosk\\LovecashIcon.png");
        
        label.setText("LOVE CASH");
        label.setIcon(icon);
        label.setBounds(235,10,350,460);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("Arial",Font.PLAIN,33));
        
        start.setText("TAP HERE TO START");
        start.setBounds(235,480,350,100);
        start.setFont(new Font("Arial",Font.PLAIN,25));
        start.setBackground(Color.LIGHT_GRAY);
        start.addActionListener(this);
        
        this.setResizable(false);
        this.add(start);
        this.add(label);
        this.setSize(990,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new Option();
        this.dispose();
    }
    
}

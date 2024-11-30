/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lovecashkiosk;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author REBECCA LACSON HENDE
 */
    public class CashOut extends JFrame implements ActionListener {
        private JButton submitButton;
        private JTextField amountField;
        private JLabel titleLabel, amountLabel;
        private JPanel center;

        public CashOut() {

            titleLabel = new JLabel("LOVE CASH");
            amountLabel = new JLabel("Enter Amount to Cash Out:");
            amountField = new JTextField();
            submitButton = new JButton("Submit");
            center = new JPanel();

            // Designs
            titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
            titleLabel.setBounds(295, 30, 400, 50);
            titleLabel.setHorizontalAlignment(JLabel.CENTER);

            amountLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            amountLabel.setBounds(295, 250, 400, 30);

            amountField.setBounds(295, 290, 400, 40);
            amountField.setFont(new Font("Arial", Font.PLAIN, 18));

            submitButton.setBounds(365, 380, 250, 50);
            submitButton.setFont(new Font("Arial", Font.PLAIN, 22));
            submitButton.setBackground(Color.LIGHT_GRAY);
            submitButton.addActionListener(this);

            // Panels
            center.setSize(990, 900);
            center.setBackground(Color.PINK);
            center.setLayout(null);
            center.add(titleLabel);
            center.add(amountLabel);
            center.add(amountField);
            center.add(submitButton);

            // Frams
            this.add(center);
            this.setSize(990, 900);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setVisible(true);
            this.setResizable(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                String amount = amountField.getText();

                try {
                    double cashOutAmount = Double.parseDouble(amount);
                    if (cashOutAmount <= 0) {
                        JOptionPane.showMessageDialog(this, "Enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Succes
                    JOptionPane.showMessageDialog(this, "\nAmount: ₱" + cashOutAmount, "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                     // Balik sa Option.java

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Please enter a numeric value for amount!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

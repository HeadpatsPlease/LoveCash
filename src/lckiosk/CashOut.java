/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lckiosk;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author nexot
 */
public class CashOut extends javax.swing.JFrame {
    Accounts acc;
    /**
     * Creates new form CashOut
     */
    public CashOut() {
        initComponents();
    }
    public CashOut(Accounts acc){
        initComponents();
        this.acc = acc;
        ImageIcon icon = new ImageIcon("src\\lckiosk\\icon.png");
        this.setIconImage(icon.getImage());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        proceedButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 392));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setText("LOVE CASH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(94, 63, 136, 34);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("CASH OUT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(122, 103, 85, 33);

        jLabel3.setText("Enter Mobile Phone: +63");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 230, 170, 26);

        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        getContentPane().add(phoneNumber);
        phoneNumber.setBounds(160, 230, 130, 20);

        jLabel5.setText("Enter PIN:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 260, 70, 20);
        getContentPane().add(pin);
        pin.setBounds(160, 260, 64, 22);

        proceedButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        proceedButton.setText("OKAY");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });
        getContentPane().add(proceedButton);
        proceedButton.setBounds(125, 319, 72, 36);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lckiosk/bg.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -10, 460, 410);

        setSize(new java.awt.Dimension(344, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        String phone = phoneNumber.getText();
        String pinInput = pin.getText();
        
        if (acc.getAccount(0).equals(phone) && acc.getAccount(1).equals(pinInput)) {
            JOptionPane.showMessageDialog(null, "Login Successfully");
            AmountOut ao = new AmountOut(acc);
            ao.setVisible(true);
            this.dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Invalid Mobile Phone or Password");    
        }  
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CashOut().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JPasswordField pin;
    private javax.swing.JButton proceedButton;
    // End of variables declaration//GEN-END:variables
}

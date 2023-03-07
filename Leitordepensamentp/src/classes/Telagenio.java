/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author lucas
 */
public class Telagenio extends javax.swing.JFrame {

    /**
     * Creates new form Telagenio
     */
    public Telagenio() {
        initComponents();
        txtBalao.setText("<html> Vou pensar em um numero de 1 a 5, tente adivinhar qual é </html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBalao = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnPalpite = new javax.swing.JButton();
        lblBalao = new javax.swing.JLabel();
        genio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBalao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtBalao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtBalao.setText("Balão");
        txtBalao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 160, 110));

        txtNum.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 20));

        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 109, -1));

        lblBalao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBalao.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\5eb5cc4766f610778da6448b2d2c2f40--monitor-safety_resized.jpg")); // NOI18N
        getContentPane().add(lblBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 270, 160));

        genio.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\AKINATOR.jpg")); // NOI18N
        getContentPane().add(genio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 220, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        // TODO add your handling code here:
        int numeroeu= Integer.parseInt(txtNum.getText());
       
        int numerogenio = (int) (1 + Math.random()*(5-1));
        
    String f1 = "Acertou";
    String f2 = "<html> Errou eu pensei em " + numerogenio + "</html>";
    String res;
    res = (numeroeu==numerogenio)? f1:f2;
    txtBalao.setText(res);
        
     
                
        
        
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(Telagenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telagenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telagenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telagenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telagenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel genio;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel txtBalao;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}

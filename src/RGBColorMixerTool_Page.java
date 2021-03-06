import java.awt.Color;
import java.awt.Toolkit;
/**
 *
 * @author Umut Hope YILDIRIM
 */
public class RGBColorMixerTool_Page extends javax.swing.JFrame {

    /**
     * Creates new form RGBColorMixerTool_Page
     */
    public RGBColorMixerTool_Page() {
        initComponents();
        setIcon();
        cambiarColor();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_redcolor = new javax.swing.JLabel();
        label_greencolor = new javax.swing.JLabel();
        label_bluecolor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSlider_redcolor = new javax.swing.JSlider();
        jSlider_greencolor = new javax.swing.JSlider();
        jSlider_bluecolor = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        super.setTitle("RGB Color Mixer Tool");
        setResizable(false);

        label_redcolor.setText("RED COLOR : ");

        label_greencolor.setText("GREEN COLOR : ");

        label_bluecolor.setText("BLUE COLOR : ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jSlider_redcolor.setMaximum(255);
        jSlider_redcolor.setMinorTickSpacing(1);
        jSlider_redcolor.setPaintTicks(true);
        jSlider_redcolor.setValue(127);
        jSlider_redcolor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_redcolorStateChanged(evt);
            }
        });

        jSlider_greencolor.setMaximum(255);
        jSlider_greencolor.setMinorTickSpacing(1);
        jSlider_greencolor.setPaintTicks(true);
        jSlider_greencolor.setValue(127);
        jSlider_greencolor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_greencolorStateChanged(evt);
            }
        });

        jSlider_bluecolor.setMaximum(255);
        jSlider_bluecolor.setMinorTickSpacing(1);
        jSlider_bluecolor.setPaintTicks(true);
        jSlider_bluecolor.setToolTipText("");
        jSlider_bluecolor.setValue(127);
        jSlider_bluecolor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_bluecolorStateChanged(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rgb_img.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(label_redcolor))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(label_bluecolor)))
                            .addComponent(label_greencolor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider_greencolor, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                            .addComponent(jSlider_redcolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider_bluecolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_redcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider_redcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider_greencolor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_greencolor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_bluecolor)
                            .addComponent(jSlider_bluecolor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider_redcolorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_redcolorStateChanged
        // TODO add your handling code here:
        cambiarColor();
    }//GEN-LAST:event_jSlider_redcolorStateChanged

    private void jSlider_greencolorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_greencolorStateChanged
        // TODO add your handling code here:
        cambiarColor();
    }//GEN-LAST:event_jSlider_greencolorStateChanged

    private void jSlider_bluecolorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_bluecolorStateChanged
        // TODO add your handling code here:
        cambiarColor();
    }//GEN-LAST:event_jSlider_bluecolorStateChanged

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
            java.util.logging.Logger.getLogger(RGBColorMixerTool_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RGBColorMixerTool_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RGBColorMixerTool_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RGBColorMixerTool_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RGBColorMixerTool_Page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider_bluecolor;
    private javax.swing.JSlider jSlider_greencolor;
    private javax.swing.JSlider jSlider_redcolor;
    private javax.swing.JLabel label_bluecolor;
    private javax.swing.JLabel label_greencolor;
    private javax.swing.JLabel label_redcolor;
    // End of variables declaration//GEN-END:variables

    private void cambiarColor() {
        int R, G, B;
        R = jSlider_redcolor.getValue();
        G = jSlider_greencolor.getValue();
        B = jSlider_bluecolor.getValue();
        
       jPanel1.setBackground(new Color (R, G, B) );
    }

    private void setIcon() {
        var productName="RGBColorMixerTool";
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rgb_ico.png")));
    }
}

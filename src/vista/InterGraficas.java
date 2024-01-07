package vista;

import java.awt.Dimension;
import javax.swing.JTextField;
import static vista.FrmMenu.jDesktopPane_menu;


/**
 *
 * @Chami System
 */
public class InterGraficas extends javax.swing.JInternalFrame {
    
    public static String fecha_inicio = "", fecha_fin = "";

    public InterGraficas() {
        initComponents();
        this.setSize(new Dimension(450, 300));
        this.setTitle("Historial de Ventas");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_Guardar = new javax.swing.JButton();
        jDateChooser_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jDateChooser_fecha_fin = new com.toedter.calendar.JDateChooser();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione fechas para graficar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha inicio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Fin:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jButton_Guardar.setText("Graficar Ventas");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 230, 50));

        jDateChooser_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_inicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDateChooser_fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, -1));

        jDateChooser_fecha_fin.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_fin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDateChooser_fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        
        fecha_inicio = ((JTextField) jDateChooser_fecha_inicio.getDateEditor().getUiComponent()).getText();
        fecha_fin = ((JTextField) jDateChooser_fecha_fin.getDateEditor().getUiComponent()).getText();
        
        InterGraficaVentas interGraficaVentas = new InterGraficaVentas();
        jDesktopPane_menu.add(interGraficaVentas);
        interGraficaVentas.setVisible(true);
        
    }//GEN-LAST:event_jButton_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_fin;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_wallpaper;
    // End of variables declaration//GEN-END:variables


}

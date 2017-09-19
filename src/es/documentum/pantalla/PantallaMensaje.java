package es.documentum.pantalla;

import es.documentum.utilidades.Utilidades;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class PantallaMensaje extends javax.swing.JDialog {

    static String tipo = "FRAME";
    java.awt.Frame ventanapadre = null;
    javax.swing.JDialog dialogopadre = null;

    String mensaje = "";

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        etiqueta.setText(mensaje);
    }

    /**
     * Creates new form PantallaMensaje
     */
    public PantallaMensaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ventanapadre = parent;
        initComponents();
        asignariconos();
        setLocationRelativeTo(ventanapadre);
        //  setVisible(true);
        repaint();
    }

    public PantallaMensaje(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        tipo = "DIALOGO";
        dialogopadre = parent;
        initComponents();
        asignariconos();
        setLocationRelativeTo(dialogopadre);
        //  setVisible(true);
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqueta = new javax.swing.JTextArea();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        etiqueta.setEditable(false);
        etiqueta.setBackground(new java.awt.Color(212, 208, 200));
        etiqueta.setColumns(20);
        etiqueta.setLineWrap(true);
        etiqueta.setRows(5);
        etiqueta.setWrapStyleWord(true);
        etiqueta.setAutoscrolls(false);
        etiqueta.setBorder(null);
        etiqueta.setFocusable(false);
        etiqueta.setMinimumSize(new java.awt.Dimension(160, 90));
        etiqueta.setOpaque(false);
        etiqueta.setRequestFocusEnabled(false);
        etiqueta.setVerifyInputWhenFocusTarget(false);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/documentum/imagenes/si.png"))); // NOI18N
        botonAceptar.setMnemonic('A');
        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(botonAceptar)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Utilidades.escribeLog("Error en el main de PantallaMensaje " + " - " + ex.getMessage());
        } catch (InstantiationException ex) {
            Utilidades.escribeLog("Error en el main de PantallaMensaje " + " - " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            Utilidades.escribeLog("Error en el main de PantallaMensaje " + " - " + ex.getMessage());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Utilidades.escribeLog("Error en el main de PantallaMensaje " + " - " + ex.getMessage());
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaMensaje dialog = null;
                if (tipo.equals("FRAME")) {
                    dialog = new PantallaMensaje(new javax.swing.JFrame(), false);
                } else {
                    dialog = new PantallaMensaje(new javax.swing.JDialog(), false);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                //    dialog.setVisible(true);
                //    dialog.barra.setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonAceptar;
    public javax.swing.JTextArea etiqueta;
    // End of variables declaration//GEN-END:variables

    public static void asignariconos() {

    }
}

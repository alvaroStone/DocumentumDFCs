package es.documentum.pantalla;

import com.documentum.fc.client.IDfCollection;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfTypedObject;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfValue;
import es.documentum.utilidades.ClassPathUpdater;
import es.documentum.utilidades.Utilidades;
import es.documentum.utilidades.UtilidadesDocumentum;
import static es.documentum.utilidades.UtilidadesDocumentum.getDfObjectValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class PantallaCambiarTipo extends javax.swing.JDialog {

    private String r_object_id;
    private String tipoDocumentalActual;
    private String accion;
    public static PantallaDocumentum ventanapadre = null;
    private final Utilidades util = new Utilidades();
    private UtilidadesDocumentum utilDocum;

    public String getR_object_id() {
        return r_object_id;
    }

    public void setR_object_id(String r_object_id) {
        this.r_object_id = r_object_id;
        etiqueta_r_object_id.setText(r_object_id);
    }

    public String getTipoDocumentalActual() {
        return tipoDocumentalActual;
    }

    public void setTipoDocumentalActual(String tipoDocumentalActual) {
        this.tipoDocumentalActual = tipoDocumentalActual;
        etiquetaTipoDocumentalActual.setText(tipoDocumentalActual);
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    
    
    public PantallaCambiarTipo(PantallaDocumentum parent, boolean modal) {
        super(parent, modal);
        ventanapadre = parent;
        initComponents();
        setLocationRelativeTo(ventanapadre);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupmenu = new javax.swing.JPopupMenu();
        opcionPegar = new javax.swing.JMenuItem();
        botonAceptar = new javax.swing.JButton();
        etiquetaIdDocumentum = new javax.swing.JLabel();
        etiquetaRuta = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        EtiquetaPanel = new javax.swing.JLabel();
        etiqueta_r_object_id = new javax.swing.JLabel();
        etiquetaCarpeta1 = new javax.swing.JLabel();
        etiquetaTipoDocumentalActual = new javax.swing.JLabel();
        comboTipoDocumental = new javax.swing.JComboBox();

        opcionPegar.setText("Pegar");
        opcionPegar.setToolTipText("Pegar");
        opcionPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPegarActionPerformed(evt);
            }
        });
        popupmenu.add(opcionPegar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/documentum/imagenes/si.png"))); // NOI18N
        botonAceptar.setMnemonic('A');
        botonAceptar.setText("Aceptar");
        botonAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAceptar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        etiquetaIdDocumentum.setText("Id de  Documentum");
        etiquetaIdDocumentum.setMaximumSize(new java.awt.Dimension(41, 22));
        etiquetaIdDocumentum.setMinimumSize(new java.awt.Dimension(41, 22));
        etiquetaIdDocumentum.setPreferredSize(new java.awt.Dimension(41, 22));

        etiquetaRuta.setText("Nuevo tipo Documental");

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/documentum/imagenes/salir_peq.png"))); // NOI18N
        botonCancelar.setText("Salir");
        botonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        EtiquetaPanel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EtiquetaPanel.setForeground(new java.awt.Color(0, 0, 153));
        EtiquetaPanel.setAutoscrolls(true);
        EtiquetaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EtiquetaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EtiquetaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EtiquetaPanelMouseEntered(evt);
            }
        });

        etiqueta_r_object_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiqueta_r_object_id.setMaximumSize(new java.awt.Dimension(41, 22));
        etiqueta_r_object_id.setMinimumSize(new java.awt.Dimension(41, 22));
        etiqueta_r_object_id.setPreferredSize(new java.awt.Dimension(41, 22));

        etiquetaCarpeta1.setText("Tipo Documental Actual");
        etiquetaCarpeta1.setMaximumSize(new java.awt.Dimension(41, 22));
        etiquetaCarpeta1.setMinimumSize(new java.awt.Dimension(41, 22));
        etiquetaCarpeta1.setPreferredSize(new java.awt.Dimension(41, 22));

        etiquetaTipoDocumentalActual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaTipoDocumentalActual.setMaximumSize(new java.awt.Dimension(41, 22));
        etiquetaTipoDocumentalActual.setMinimumSize(new java.awt.Dimension(41, 22));
        etiquetaTipoDocumentalActual.setPreferredSize(new java.awt.Dimension(41, 22));

        comboTipoDocumental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboTipoDocumentalMousePressed(evt);
            }
        });
        comboTipoDocumental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDocumentalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etiquetaRuta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaCarpeta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etiquetaIdDocumentum, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaTipoDocumentalActual, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(etiqueta_r_object_id, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipoDocumental, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(EtiquetaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta_r_object_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaIdDocumentum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTipoDocumentalActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCarpeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoDocumental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addGap(18, 18, 18)
                .addComponent(EtiquetaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonAceptar, botonCancelar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if (ComprobarValores()) {
            String tipodocumental = (String) comboTipoDocumental.getSelectedItem();
            utilDocum.CambiarTipoDocumental(r_object_id, tipodocumental);
            String resultado = utilDocum.dameError();
            if (resultado.isEmpty()) {
                EtiquetaPanel.setText("Cambiado el tipo documental a " + tipodocumental);
                setAccion("OK");
                etiquetaTipoDocumentalActual.setText(tipodocumental);
                setTipoDocumentalActual(tipodocumental);
            } else {
                EtiquetaPanel.setText(resultado);
            }
            //this.dispose();
        }

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void EtiquetaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaPanelMouseEntered
        EtiquetaPanel.setToolTipText(EtiquetaPanel.getText());
    }//GEN-LAST:event_EtiquetaPanelMouseEntered

    private void opcionPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPegarActionPerformed
    }//GEN-LAST:event_opcionPegarActionPerformed

    private void EtiquetaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaPanelMouseClicked
        if (evt.getClickCount() == 2 && evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            Utilidades.copiarTextoPortapapeles(EtiquetaPanel.getText());
        }
    }//GEN-LAST:event_EtiquetaPanelMouseClicked

    private void comboTipoDocumentalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboTipoDocumentalMousePressed

    }//GEN-LAST:event_comboTipoDocumentalMousePressed

    private void comboTipoDocumentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDocumentalActionPerformed
        String tipodocumental = (String) comboTipoDocumental.getSelectedItem();
    }//GEN-LAST:event_comboTipoDocumentalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaCambiarTipo dialog = new PantallaCambiarTipo(ventanapadre, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setLocationRelativeTo(ventanapadre);
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaPanel;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JComboBox comboTipoDocumental;
    private javax.swing.JLabel etiquetaCarpeta1;
    private javax.swing.JLabel etiquetaIdDocumentum;
    private javax.swing.JLabel etiquetaRuta;
    private javax.swing.JLabel etiquetaTipoDocumentalActual;
    private javax.swing.JLabel etiqueta_r_object_id;
    private javax.swing.JMenuItem opcionPegar;
    private javax.swing.JPopupMenu popupmenu;
    // End of variables declaration//GEN-END:variables

    public void asignariconos() {
    }

    private Boolean ComprobarValores() {
        Boolean resultado = true;

        if (comboTipoDocumental == null || comboTipoDocumental.getSelectedItem().toString().isEmpty()) {
            EtiquetaPanel.setText("Debe indicar el tipo documental");
            comboTipoDocumental.requestFocus();
            return false;
        }

        return resultado;
    }

    public void cargarComboTipos() {
        ArrayList comboBoxItems = new ArrayList();
        int posicion = 0;
        String dirdfc = util.usuarioHome() + util.separador() + "documentumdfcs" + util.separador() + "documentum" + util.separador() + "shared" + util.separador();
        try {
            ClassPathUpdater.add(dirdfc);
            ClassPathUpdater.add(dirdfc + "lib" + util.separador() + "jsafeFIPS.jar");
        } catch (IOException | IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
            Utilidades.escribeLog("Error al actualizar el Classpath  - Error: " + ex.getMessage());
        }
        utilDocum = new UtilidadesDocumentum(dirdfc + "dfc.properties");
        try {
            //            IDfCollection col = utildocum.ejecutarDql("select name from dm_type where  super_name in ('dm_document') or name in ('dm_document') order by name");
            IDfCollection col = utilDocum.ejecutarDql("select name from dm_type order by name");
            if (!utilDocum.dameError().equals("")) {
                return;
            }

            while (col.next()) {
                IDfTypedObject row = (IDfTypedObject) col.getTypedObject();
                IDfValue attrValue = row.getValue("name");
                comboBoxItems.add(getDfObjectValue(attrValue));
                if (getDfObjectValue(attrValue).equals("dm_document")) {
                    posicion = comboBoxItems.size() - 1;
                }
            }

            col.close();

        } catch (DfException e) {

        }

        DefaultComboBoxModel modelo = new DefaultComboBoxModel(comboBoxItems.toArray());
        comboTipoDocumental.setModel(modelo);
        if (modelo.getSize() > 0) {
            comboTipoDocumental.setSelectedIndex(posicion);
        }
    }

}

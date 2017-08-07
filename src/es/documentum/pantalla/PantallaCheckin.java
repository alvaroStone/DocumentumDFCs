package es.documentum.pantalla;

import com.documentum.fc.client.IDfSysObject;
import com.documentum.fc.client.IDfVersionPolicy;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.DfId;
import es.documentum.utilidades.Utilidades;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class PantallaCheckin extends javax.swing.JDialog {

    private String fichero = "";
    private String r_object_id = "";
    private String boton = "N";
    private String version = "";
    private String etiqueta="";
    private String descripcion="";
    private Boolean indexar=true;

    public Boolean getIndexar() {
        return indexar;
    }

    public void setIndexar(Boolean indexar) {
        this.indexar = indexar;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public String getR_object_id() {
        return r_object_id;
    }

    public void setR_object_id(String r_object_id) {
        this.r_object_id = r_object_id;
    }

    public void setLabelFichero(String fichero) {
        this.LabelFichero.setText(fichero);
    }

    public static PantallaDocumentum ventanapadre = null;

    public PantallaCheckin(PantallaDocumentum parent, boolean modal) {
        super(parent, modal);
        ventanapadre = parent;
        initComponents();
        setLocationRelativeTo(ventanapadre);
    }

    public boolean respuesta() {
        return (boton.equals("S"));
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
        LabelFichero = new javax.swing.JLabel();
        textoVersion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoFichero = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        EtiquetaPanel = new javax.swing.JLabel();
        botonNavegar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CheckMisma = new javax.swing.JRadioButton();
        CheckMenor = new javax.swing.JRadioButton();
        CheckMayor = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoDescripcion = new javax.swing.JTextField();
        LabelVersion = new javax.swing.JLabel();
        LabelTipo = new javax.swing.JLabel();
        LabelFormato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CheckIndexar = new javax.swing.JCheckBox();

        opcionPegar.setText("Pegar");
        opcionPegar.setToolTipText("Pegar");
        opcionPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPegarActionPerformed(evt);
            }
        });
        popupmenu.add(opcionPegar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/documentum/imagenes/si.png"))); // NOI18N
        botonAceptar.setMnemonic('A');
        botonAceptar.setText("OK");
        botonAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAceptar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        LabelFichero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LabelFichero.setMaximumSize(new java.awt.Dimension(41, 22));
        LabelFichero.setMinimumSize(new java.awt.Dimension(41, 22));
        LabelFichero.setPreferredSize(new java.awt.Dimension(41, 22));

        textoVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoVersionActionPerformed(evt);
            }
        });

        jLabel2.setText("Check In desde fichero");

        textoFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFicheroActionPerformed(evt);
            }
        });

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/documentum/imagenes/no.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        EtiquetaPanel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EtiquetaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EtiquetaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EtiquetaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EtiquetaPanelMouseEntered(evt);
            }
        });

        botonNavegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/documentum/imagenes/carpeta.png"))); // NOI18N
        botonNavegar.setToolTipText("Seleccionar directorio de destino");
        botonNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNavegar.setMaximumSize(new java.awt.Dimension(25, 25));
        botonNavegar.setMinimumSize(new java.awt.Dimension(25, 25));
        botonNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNavegarActionPerformed(evt);
            }
        });

        jLabel3.setText("Guardar como:");

        CheckMisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMismaActionPerformed(evt);
            }
        });

        CheckMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMenorActionPerformed(evt);
            }
        });

        CheckMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMayorActionPerformed(evt);
            }
        });

        jLabel4.setText("Etiqueta de versión: ");

        jLabel5.setText("Descripción:");

        textoDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDescripcionActionPerformed(evt);
            }
        });

        LabelVersion.setMaximumSize(new java.awt.Dimension(18, 198));
        LabelVersion.setMinimumSize(new java.awt.Dimension(18, 198));
        LabelVersion.setPreferredSize(new java.awt.Dimension(18, 198));

        LabelTipo.setMaximumSize(new java.awt.Dimension(18, 198));
        LabelTipo.setMinimumSize(new java.awt.Dimension(18, 198));
        LabelTipo.setPreferredSize(new java.awt.Dimension(18, 198));

        LabelFormato.setMaximumSize(new java.awt.Dimension(18, 198));
        LabelFormato.setMinimumSize(new java.awt.Dimension(18, 198));
        LabelFormato.setPreferredSize(new java.awt.Dimension(18, 198));

        jLabel1.setText("(misma versión)");
        jLabel1.setMaximumSize(new java.awt.Dimension(75, 21));
        jLabel1.setMinimumSize(new java.awt.Dimension(75, 21));
        jLabel1.setPreferredSize(new java.awt.Dimension(75, 21));

        jLabel6.setText("(versión menor)");
        jLabel6.setMaximumSize(new java.awt.Dimension(76, 21));
        jLabel6.setMinimumSize(new java.awt.Dimension(76, 21));
        jLabel6.setPreferredSize(new java.awt.Dimension(76, 21));

        jLabel7.setText("(versión mayor)");
        jLabel7.setMaximumSize(new java.awt.Dimension(76, 21));
        jLabel7.setMinimumSize(new java.awt.Dimension(76, 21));
        jLabel7.setPreferredSize(new java.awt.Dimension(76, 21));

        CheckIndexar.setText("Indexar documento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EtiquetaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CheckMisma)
                                            .addComponent(CheckMenor)
                                            .addComponent(CheckMayor))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(LabelFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textoFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botonNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LabelFormato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addComponent(LabelTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelVersion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CheckIndexar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LabelFichero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckMisma, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(CheckMenor))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckMayor)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(CheckIndexar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoFichero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNavegar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addGap(18, 18, 18)
                .addComponent(EtiquetaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textoFichero, textoVersion});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonAceptar, botonCancelar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if (ComprobarValores()) {
            boton = "S";
            this.dispose();
        }

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void textoVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoVersionActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        boton = "N";
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void EtiquetaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaPanelMouseEntered
        EtiquetaPanel.setToolTipText(EtiquetaPanel.getText());
    }//GEN-LAST:event_EtiquetaPanelMouseEntered

    private void opcionPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPegarActionPerformed
        if (evt.getSource().toString().equals("textoRutaSO")) {
            textoFichero.setText(Utilidades.pegarTextoPortapapeles());
        }
        if (evt.getSource().toString().equals("textoCarpeta")) {
            textoVersion.setText(Utilidades.pegarTextoPortapapeles());
        }
    }//GEN-LAST:event_opcionPegarActionPerformed

    private void EtiquetaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaPanelMouseClicked
        if (evt.getClickCount() == 2 && evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            Utilidades.copiarTextoPortapapeles(EtiquetaPanel.getText());
        }
    }//GEN-LAST:event_EtiquetaPanelMouseClicked

    private void textoFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFicheroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFicheroActionPerformed

    private void botonNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNavegarActionPerformed
        JFileChooser fc = new JFileChooser("");
        fc.setCurrentDirectory(new java.io.File("."));
        fc.setDialogTitle("Fichero");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);

        int x = fc.showOpenDialog(this);
        if (x == JFileChooser.CANCEL_OPTION || x == JFileChooser.ERROR_OPTION) {
            return;
        }
        String rutalocal = fc.getSelectedFile().getPath();
        if (!rutalocal.isEmpty()) {
            textoFichero.setText(rutalocal);
        }
    }//GEN-LAST:event_botonNavegarActionPerformed

    private void textoDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDescripcionActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        inicializar();
    }//GEN-LAST:event_formComponentShown

    private void CheckMismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMismaActionPerformed
        CheckMisma.setSelected(true);
        CheckMenor.setSelected(false);
        CheckMayor.setSelected(false);
    }//GEN-LAST:event_CheckMismaActionPerformed

    private void CheckMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMenorActionPerformed
        CheckMisma.setSelected(false);
        CheckMenor.setSelected(true);
        CheckMayor.setSelected(false);
    }//GEN-LAST:event_CheckMenorActionPerformed

    private void CheckMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMayorActionPerformed
        CheckMisma.setSelected(false);
        CheckMenor.setSelected(false);
        CheckMayor.setSelected(true);
    }//GEN-LAST:event_CheckMayorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaCheckin dialog = new PantallaCheckin(ventanapadre, true);
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
    private javax.swing.JCheckBox CheckIndexar;
    private javax.swing.JRadioButton CheckMayor;
    private javax.swing.JRadioButton CheckMenor;
    private javax.swing.JRadioButton CheckMisma;
    private javax.swing.JLabel EtiquetaPanel;
    private javax.swing.JLabel LabelFichero;
    private javax.swing.JLabel LabelFormato;
    private javax.swing.JLabel LabelTipo;
    private javax.swing.JLabel LabelVersion;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonNavegar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem opcionPegar;
    private javax.swing.JPopupMenu popupmenu;
    private javax.swing.JTextField textoDescripcion;
    private javax.swing.JTextField textoFichero;
    private javax.swing.JTextField textoVersion;
    // End of variables declaration//GEN-END:variables

    public void asignariconos() {
    }

    private Boolean ComprobarValores() {
        Boolean resultado = true;

        if (CheckMisma.isSelected()) {
            setVersion("igual");
        } else if (CheckMenor.isSelected()) {
            setVersion("menor");
        } else if (CheckMayor.isSelected()) {
            setVersion("mayor");
        }
        
        if (!textoVersion.getText().isEmpty()) {
            setEtiqueta(textoVersion.getText());
        }
        if (!textoDescripcion.getText().isEmpty()) {
            setDescripcion(textoDescripcion.getText());
        }

        setIndexar(CheckIndexar.isSelected());
        
        return resultado;
    }

    private void inicializar() {
        if (!r_object_id.isEmpty()) {
            ArrayList formato = ventanapadre.utilDocum.DameAtributo(r_object_id, "r_object_type");
            ArrayList tipo = ventanapadre.utilDocum.DameAtributo(r_object_id, "a_content_type");
            ArrayList version = ventanapadre.utilDocum.DameAtributo(r_object_id, "r_version_label");
            String versionactual = version.get(0).toString();
            String valversion[] = versionactual.split("\\.");
            String mayor = valversion[0];
            String menor = valversion[1];
            String versionmayor = String.valueOf(Integer.parseInt(mayor) + 1) + ".0";
            String versionmenor = mayor + "." + String.valueOf(Integer.parseInt(menor) + 1);
            
            try {
                IDfSysObject sysObject = (IDfSysObject) ventanapadre.utilDocum.conectarDocumentum().getObject(new DfId(r_object_id));
                IDfVersionPolicy vp = sysObject.getVersionPolicy();
                versionactual=vp.getSameLabel();
                versionmayor=vp.getNextMajorLabel();
                versionmenor=vp.getNextMinorLabel();
            } catch (DfException ex) {
                Utilidades.escribeLog("Error al obtener versión en el Chek In. Error: "+ ex.getMessage());
            }

            CheckMisma.setText(versionactual);
            CheckMenor.setText(versionmenor);
            CheckMayor.setText(versionmayor);
            CheckMisma.setSelected(true);
            CheckMenor.setSelected(false);
            CheckMayor.setSelected(false);
            LabelVersion.setText("Versión: " + versionactual + ", Current");
            LabelTipo.setText("Tipo: " + tipo.get(0));
            LabelFormato.setText("Formato: " + formato.get(0));
            CheckIndexar.setSelected(getIndexar());
        }
    }

}

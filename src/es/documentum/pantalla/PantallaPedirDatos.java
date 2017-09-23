package es.documentum.pantalla;

import es.documentum.utilidades.Utilidades;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class PantallaPedirDatos extends javax.swing.JDialog {

    public String carpeta;
    public String ruta;
    public String textoEtiquetaCarpeta;
    public String textoEtiquetaRuta;
    private String accion;
    public static PantallaDocumentum ventanapadre = null;

    public String getCarpeta() {
        return carpeta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setCarpeta(String valor) {
        carpeta = valor;
    }

    public void setRuta(String valor) {
        ruta = valor;
    }

    public void setEtiquetaCarpeta(String etiquetaCarpeta) {
        this.etiquetaCarpeta.setText(etiquetaCarpeta);
    }

    public void setEtiquetaRuta(String etiquetaRuta) {
        this.etiquetaRuta.setText(etiquetaRuta);
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public PantallaPedirDatos(PantallaDocumentum parent, boolean modal) {
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
        etiquetaCarpeta = new javax.swing.JLabel();
        textoCarpeta = new javax.swing.JTextField();
        etiquetaRuta = new javax.swing.JLabel();
        textoRutaSO = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        EtiquetaPanel = new javax.swing.JLabel();
        botonNavegar = new javax.swing.JButton();

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

        etiquetaCarpeta.setText("Carpeta de Documentum");
        etiquetaCarpeta.setMaximumSize(new java.awt.Dimension(41, 22));
        etiquetaCarpeta.setMinimumSize(new java.awt.Dimension(41, 22));
        etiquetaCarpeta.setPreferredSize(new java.awt.Dimension(41, 22));

        textoCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCarpetaActionPerformed(evt);
            }
        });

        etiquetaRuta.setText("Ruta de destino del sistema de ficheros");

        textoRutaSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRutaSOActionPerformed(evt);
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
        EtiquetaPanel.setForeground(new java.awt.Color(0, 0, 153));
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
                        .addComponent(etiquetaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 344, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoRutaSO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNavegar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textoCarpeta, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etiquetaCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(etiquetaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoRutaSO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNavegar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addGap(28, 28, 28)
                .addComponent(EtiquetaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textoCarpeta, textoRutaSO});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonAceptar, botonCancelar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if (ComprobarValores()) {
            setCarpeta(textoCarpeta.getText());
            setRuta(textoRutaSO.getText());
            this.dispose();
        }

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void textoCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCarpetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCarpetaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void EtiquetaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaPanelMouseEntered
        EtiquetaPanel.setToolTipText(EtiquetaPanel.getText());
    }//GEN-LAST:event_EtiquetaPanelMouseEntered

    private void opcionPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPegarActionPerformed
        if (evt.getSource().toString().equals("textoRutaSO")) {
            textoRutaSO.setText(Utilidades.pegarTextoPortapapeles());
        }
        if (evt.getSource().toString().equals("textoCarpeta")) {
            textoCarpeta.setText(Utilidades.pegarTextoPortapapeles());
        }
    }//GEN-LAST:event_opcionPegarActionPerformed

    private void EtiquetaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaPanelMouseClicked
        if (evt.getClickCount() == 2 && evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            Utilidades.copiarTextoPortapapeles(EtiquetaPanel.getText());
        }
    }//GEN-LAST:event_EtiquetaPanelMouseClicked

    private void textoRutaSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRutaSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRutaSOActionPerformed

    private void botonNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNavegarActionPerformed
        JFileChooser fc = new JFileChooser("");
        fc.setCurrentDirectory(new java.io.File("."));
        fc.setDialogTitle("Directorio de destino");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);

        int x = fc.showOpenDialog(this);
        if (x == JFileChooser.CANCEL_OPTION || x == JFileChooser.ERROR_OPTION) {
            return;
        }
        String rutalocal = fc.getSelectedFile().getPath();
        if (!rutalocal.isEmpty()) {
            textoRutaSO.setText(rutalocal);
        }
    }//GEN-LAST:event_botonNavegarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaPedirDatos dialog = new PantallaPedirDatos(ventanapadre, true);
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
    public javax.swing.JButton botonNavegar;
    private javax.swing.JLabel etiquetaCarpeta;
    private javax.swing.JLabel etiquetaRuta;
    private javax.swing.JMenuItem opcionPegar;
    private javax.swing.JPopupMenu popupmenu;
    public javax.swing.JTextField textoCarpeta;
    public javax.swing.JTextField textoRutaSO;
    // End of variables declaration//GEN-END:variables

    public void asignariconos() {
    }

    private Boolean ComprobarValores() {
        Boolean resultado = true;
        if (textoCarpeta.getText().isEmpty()) {
            EtiquetaPanel.setText("Debe indicar la Carpeta de Documentum");
            textoCarpeta.requestFocus();
            return false;
        }
        if (textoRutaSO.getText().isEmpty()) {
            EtiquetaPanel.setText("Debe indicar la ruta de destino");
            textoRutaSO.requestFocus();
            return false;
        }

        if (accion.equals("ExportarCarpeta")) {
            if (ventanapadre.utilDocum.existeCarpeta(textoCarpeta.getText()) == false) {
                EtiquetaPanel.setText("La carpeta indicada parece que no existe en Documentum");
                textoCarpeta.requestFocus();
                return false;
            }

            if (!ventanapadre.util.existeDirectorio(textoRutaSO.getText())) {
                if (!ventanapadre.util.crearDirectorio(textoRutaSO.getText())) {
                    EtiquetaPanel.setText("Debe indicar una ruta de destino válida");
                    textoRutaSO.requestFocus();
                    return false;
                }
            }

            if (ventanapadre.util.discoLibre(textoRutaSO.getText()) == 0) {
                EtiquetaPanel.setText("Debe indicar una ruta con suficiente espacio disponible");
                textoRutaSO.requestFocus();
                return false;
            }
        }
        return resultado;
    }
}

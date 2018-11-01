package es.documentum.pantalla;

import com.documentum.fc.client.IDfCollection;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfTypedObject;
import com.documentum.fc.common.DfException;
import es.documentum.utilidades.ClassPathUpdater;
import es.documentum.utilidades.TablaSinEditarCol;
import es.documentum.utilidades.Utilidades;
import es.documentum.utilidades.UtilidadesDocumentum;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class PantallaTipoAtributos extends javax.swing.JFrame {

    public static PantallaArbolTipos ventanapadre = null;
    Utilidades util = new Utilidades();
    UtilidadesDocumentum utildocum = new UtilidadesDocumentum();
    IDfSession gsesion = sesionDocumentum();
    String r_object_id;

    public String getR_object_id() {
        return r_object_id;
    }

    public void setR_object_id(String r_object_id) {
        this.r_object_id = r_object_id;
    }

    public PantallaTipoAtributos(PantallaArbolTipos parent, boolean modal) {
        initComponents();
        try {
            setIconImage(new ImageIcon(getLogo()).getImage());
        } catch (NullPointerException e) {
            Utilidades.escribeLog("\nError cargando el Logo " + e.getMessage() + "\n");
        }

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BotonCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPropios = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaHeredados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        opcionOpciones = new javax.swing.JMenu();
        opcionCerrar = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipos Documentales");
        setMinimumSize(new java.awt.Dimension(909, 651));

        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        TablaPropios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaPropios);

        TablaHeredados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaHeredados);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("   Atributos propios");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setMaximumSize(new java.awt.Dimension(250, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(250, 24));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("  Atributos heredados");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setMaximumSize(new java.awt.Dimension(250, 24));
        jLabel2.setMinimumSize(new java.awt.Dimension(250, 24));
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 24));

        opcionOpciones.setMnemonic('O');
        opcionOpciones.setText("Opciones");
        opcionOpciones.setName("opcionOpciones"); // NOI18N

        opcionCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        opcionCerrar.setText("Cerrar");
        opcionCerrar.setToolTipText("Cerrar la Aplicación");
        opcionCerrar.setActionCommand("");
        opcionCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCerrarActionPerformed(evt);
            }
        });
        opcionOpciones.add(opcionCerrar);

        MenuPrincipal.add(opcionOpciones);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(782, Short.MAX_VALUE)
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonCerrar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addGap(246, 246, 246)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void opcionCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_opcionCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaTipoAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaTipoAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaTipoAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaTipoAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaTipoAtributos(ventanapadre, true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JTable TablaHeredados;
    private javax.swing.JTable TablaPropios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem opcionCerrar;
    private javax.swing.JMenu opcionOpciones;
    // End of variables declaration//GEN-END:variables

    public void CargarTablas(String tipo) {
        String dql = "select attr_name, attr_type, attr_repeating,attr_length from dm_type_r where r_object_id='" + tipo + "' and attr_identifier <1025 order by i_position desc";

        TablaSinEditarCol modeloLotes = new TablaSinEditarCol();

        //Heredados 
        ArrayList<DatosTipo> resultado = new ArrayList<>();
        try {
            IDfCollection col = utildocum.ejecutarDql(dql, gsesion);
            if (col != null) {
                while (col.next()) {
                    IDfTypedObject r = col.getTypedObject();
                    DatosTipo datostipo = new DatosTipo();
                    datostipo.setAttr_name(r.getString("attr_name"));
                    datostipo.setAttr_type(r.getInt("attr_type"));
                    datostipo.setAttr_length(r.getInt("attr_length"));
                    datostipo.setAttr_repeating(r.getBoolean("attr_repeating"));
                    resultado.add(datostipo);
                }
            }
            col.close();
        } catch (DfException ex) {
        }

        int tam = resultado.size();
        String[] cabecera = {"Mombre", "Tipo", "Tamaño", "Multievaluado"};
        String[][] datos = new String[tam][4];
        for (int n = 0; n < tam; n++) {
            datos[n][0] = resultado.get(n).getAttr_name();
            datos[n][1] = DameDescType(resultado.get(n).getAttr_type());
            datos[n][2] = "" + resultado.get(n).getAttr_length();
            datos[n][3] = resultado.get(n).getAttr_repeating() ? "S" : "N";
        }
        modeloLotes = new TablaSinEditarCol(datos, cabecera);
        TablaHeredados.setModel(modeloLotes);
//        TableColumn columna = TablaHeredados.getColumnModel().getColumn(0);
//        columna.setPreferredWidth(250);
//        columna.setMaxWidth(250);
//        columna.sizeWidthToFit();

        // Propios
        dql = "select attr_name, attr_type, attr_repeating,attr_length from dm_type_r where r_object_id='" + tipo + "' and attr_identifier >1025 order by i_position desc";
        ArrayList<DatosTipo> resultadoPropios = new ArrayList<>();
        try {
            IDfCollection colPropios = utildocum.ejecutarDql(dql, gsesion);
            if (colPropios != null) {
                while (colPropios.next()) {
                    IDfTypedObject r = colPropios.getTypedObject();
                    DatosTipo datostipo = new DatosTipo();
                    datostipo.setAttr_name(r.getString("attr_name"));
                    datostipo.setAttr_type(r.getInt("attr_type"));
                    datostipo.setAttr_length(r.getInt("attr_length"));
                    datostipo.setAttr_repeating(r.getBoolean("attr_repeating"));
                    resultadoPropios.add(datostipo);
                }
            }
        } catch (DfException ex) {
        }

        tam = resultadoPropios.size();
        String[][] datosPropios = new String[tam][4];
        for (int n = 0; n < tam; n++) {
            datosPropios[n][0] = resultadoPropios.get(n).getAttr_name();
            datosPropios[n][1] = DameDescType(resultadoPropios.get(n).getAttr_type());
            datosPropios[n][2] = "" + resultadoPropios.get(n).getAttr_length();
            datosPropios[n][3] = resultadoPropios.get(n).getAttr_repeating() ? "S" : "N";
        }
        modeloLotes = new TablaSinEditarCol(datosPropios, cabecera);
        TablaPropios.setModel(modeloLotes);
//        TableColumn columnaPropios = TablaPropios.getColumnModel().getColumn(0);
//        columnaPropios.setPreferredWidth(250);
//        columnaPropios.setMaxWidth(250);
//        columnaPropios.sizeWidthToFit();
        pintarTablas();
    }

    private String DameDescType(int tipo) {
        String valor = "";
        switch (tipo) {
            case 0:
                valor = "Boolean";
                break;
            case 1:
                valor = "Integer";
                break;
            case 2:
                valor = "String";
                break;
            case 3:
                valor = "ID";
                break;
            case 4:
                valor = "Date and Time";
                break;
            case 5:
                valor = "Double";
        }
        return valor;
    }

    private void pintarTablas() {
        TablaHeredados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int col) {

                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
//                boolean oddRow = (row % 2 == 0);
//                if (oddRow) {
//                    setBackground(new Color(245, 245, 245)); // gris claro
//                } else {
//                    setBackground(Color.WHITE);
//                }
                table.getTableHeader().setFont(table.getTableHeader().getFont().deriveFont(Font.BOLD));
                if (col == 1) {
                    table.getColumnModel().getColumn(0).setPreferredWidth(300);
                }

                if (col == 2) {
                    table.getColumnModel().getColumn(2).setPreferredWidth(100);
                    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                    centerRenderer.setHorizontalAlignment(JLabel.RIGHT);
                    centerRenderer.setBackground(BotonCerrar.getBackground());
                    table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                }
                if (col == 3) {
                    table.getColumnModel().getColumn(3).setPreferredWidth(75);
                    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                    centerRenderer.setBackground(BotonCerrar.getBackground());
                    table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
                }

                setOpaque(true);
                setForeground(Color.BLACK);
                setBackground(new Color(245, 245, 245)); // gris claro
                setBackground(BotonCerrar.getBackground());
                String nombre = (String) table.getValueAt(row, 0);
                if (nombre.equals("Super Tipo")) {
                    //   setOpaque(true);
                    setForeground(Color.BLUE);
                }
                if (nombre.equals("Nombre")) {
                    setFont(getFont().deriveFont(Font.BOLD));
                }

                return this;
            }
        });

        TablaPropios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int col) {

                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

                table.getTableHeader().setFont(table.getTableHeader().getFont().deriveFont(Font.BOLD));
                if (col == 1) {
                    table.getColumnModel().getColumn(0).setPreferredWidth(300);
                }
                if (col == 2) {
                    table.getColumnModel().getColumn(2).setPreferredWidth(100);
                    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                    centerRenderer.setHorizontalAlignment(JLabel.RIGHT);
                    centerRenderer.setBackground(BotonCerrar.getBackground());
                    centerRenderer.setForeground(Color.BLUE);
                    table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                }
                if (col == 3) {
                    table.getColumnModel().getColumn(3).setPreferredWidth(75);
                    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                    centerRenderer.setBackground(BotonCerrar.getBackground());
                    centerRenderer.setForeground(Color.BLUE);
                    table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
                }
                setOpaque(true);
                setForeground(Color.BLUE);
                setBackground(new Color(245, 245, 245)); // gris claro
                setBackground(BotonCerrar.getBackground());
                String nombre = (String) table.getValueAt(row, 0);
                if (nombre.equals("Super Tipo")) {
                    //   setOpaque(true);
                    setForeground(Color.BLUE);
                }
                if (nombre.equals("Nombre")) {
                    setFont(getFont().deriveFont(Font.BOLD));
                }

                return this;
            }
        });
    }

    private IDfSession sesionDocumentum() {
        String dirdfc = util.usuarioHome() + util.separador() + "documentumdfcs" + util.separador() + "documentum" + util.separador() + "shared" + util.separador();
        try {
            ClassPathUpdater.add(dirdfc);
            ClassPathUpdater.add(dirdfc + "lib" + util.separador() + "jsafeFIPS.jar");
        } catch (Exception ex) {
            Utilidades.escribeLog("Error al actualizar el Classpath  - Error: " + ex.getMessage());
        }
        UtilidadesDocumentum utildocum = new UtilidadesDocumentum(dirdfc + "dfc.properties");
        IDfSession nuevasesion = utildocum.conectarDocumentum();
        return nuevasesion;
    }

    protected static Image getLogo() {
        java.net.URL imgURL = PantallaTipoAtributos.class.getClassLoader().getResource("es/documentum/imagenes/DCTM_32.png");

        if (imgURL != null) {
            return new ImageIcon(imgURL).getImage();
        } else {
            return null;
        }
    }

    private class DatosTipo implements Serializable {

        String r_object_id;
        int i_position;
        String attr_name;
        Boolean attr_repeating;
        int attr_length;
        int attr_type;
        int attr_identifier;

        public String getR_object_id() {
            return r_object_id;
        }

        public void setR_object_id(String r_object_id) {
            this.r_object_id = r_object_id;
        }

        public String getAttr_name() {
            return attr_name;
        }

        public void setAttr_name(String attr_name) {
            this.attr_name = attr_name;
        }

        public Boolean getAttr_repeating() {
            return attr_repeating;
        }

        public void setAttr_repeating(Boolean attr_repeating) {
            this.attr_repeating = attr_repeating;
        }

        public int getAttr_length() {
            return attr_length;
        }

        public void setAttr_length(int attr_length) {
            this.attr_length = attr_length;
        }

        public int getAttr_type() {
            return attr_type;
        }

        public void setAttr_type(int attr_type) {
            this.attr_type = attr_type;
        }

        public int getAttr_identifier() {
            return attr_identifier;
        }

        public void setAttr_identifier(int attr_identifier) {
            this.attr_identifier = attr_identifier;
        }

    }
}

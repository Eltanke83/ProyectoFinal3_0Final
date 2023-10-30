/*
 int idReserva;
    int idMesa;
    String nombre;
    int dni;
    LocalDate fecha;
    Time hora;
    boolean estado;
 */
package Vistas;

/**
 *
 * @author User
 */
public class Reservas extends javax.swing.JPanel {

    /**
     * Creates new form Reservas
     */
    public Reservas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextDni = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jLELIMINAR = new javax.swing.JLabel();
        jLBUSCAR1 = new javax.swing.JLabel();
        jLAGREGAR = new javax.swing.JLabel();
        jLMODIFICAR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCBoxMESASdisponibles = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jRadioBuVIGENTE = new javax.swing.JRadioButton();
        jRadioBuNoVigente = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jDateChooserFECHA = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPBACKfondo = new javax.swing.JPanel();
        jLabelfondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextDni.setBackground(new java.awt.Color(243, 241, 244));
        jTextDni.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextDni.setForeground(new java.awt.Color(0, 0, 0));
        jTextDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dni", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        add(jTextDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 240, -1));

        jTextNombre.setBackground(new java.awt.Color(243, 241, 244));
        jTextNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 240, -1));

        jLELIMINAR.setBackground(new java.awt.Color(204, 204, 204));
        jLELIMINAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLELIMINAR.setForeground(new java.awt.Color(51, 51, 51));
        jLELIMINAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/trash_can_rubish_paper_bin_icon_231400.png"))); // NOI18N
        jLELIMINAR.setText("Eliminar");
        jLELIMINAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLELIMINAR.setOpaque(true);
        jLELIMINAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLELIMINARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLELIMINARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLELIMINARMouseExited(evt);
            }
        });
        add(jLELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 130, 70));

        jLBUSCAR1.setBackground(new java.awt.Color(204, 204, 204));
        jLBUSCAR1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBUSCAR1.setForeground(new java.awt.Color(51, 51, 51));
        jLBUSCAR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBUSCAR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/search_magnifying_glass_icon_192631 (1).png"))); // NOI18N
        jLBUSCAR1.setText("Buscar");
        jLBUSCAR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBUSCAR1.setOpaque(true);
        jLBUSCAR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBUSCAR1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBUSCAR1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBUSCAR1MouseExited(evt);
            }
        });
        add(jLBUSCAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 130, 70));

        jLAGREGAR.setBackground(new java.awt.Color(204, 204, 204));
        jLAGREGAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLAGREGAR.setForeground(new java.awt.Color(51, 51, 51));
        jLAGREGAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/plus_add_new_icon_231379 (1).png"))); // NOI18N
        jLAGREGAR.setText("Agregar");
        jLAGREGAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLAGREGAR.setOpaque(true);
        jLAGREGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAGREGARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLAGREGARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLAGREGARMouseExited(evt);
            }
        });
        add(jLAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 130, 70));

        jLMODIFICAR.setBackground(new java.awt.Color(204, 204, 204));
        jLMODIFICAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLMODIFICAR.setForeground(new java.awt.Color(51, 51, 51));
        jLMODIFICAR.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLMODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/pen_pencil_write_edit_icon_231369.png"))); // NOI18N
        jLMODIFICAR.setText("Modificar");
        jLMODIFICAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLMODIFICAR.setOpaque(true);
        jLMODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMODIFICARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLMODIFICARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLMODIFICARMouseExited(evt);
            }
        });
        add(jLMODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 130, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hora de Reserva");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 120, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reservas");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 120, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 240, 10));

        jCBoxMESASdisponibles.setBackground(new java.awt.Color(243, 241, 244));
        jCBoxMESASdisponibles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCBoxMESASdisponibles.setForeground(new java.awt.Color(0, 0, 0));
        jCBoxMESASdisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesas Disponibles", "" }));
        jCBoxMESASdisponibles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jCBoxMESASdisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 230, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha de Reserva");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, 30));

        jRadioBuVIGENTE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuVIGENTE.setForeground(new java.awt.Color(0, 0, 0));
        jRadioBuVIGENTE.setSelected(true);
        jRadioBuVIGENTE.setText("Vigente");
        jRadioBuVIGENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jRadioBuVIGENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 70, -1));

        jRadioBuNoVigente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuNoVigente.setForeground(new java.awt.Color(0, 0, 0));
        jRadioBuNoVigente.setText("No vigente");
        jRadioBuNoVigente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioBuNoVigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBuNoVigenteActionPerformed(evt);
            }
        });
        add(jRadioBuNoVigente, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reservaciones");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 120, 20));
        add(jDateChooserFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        jTableReservas.setBackground(new java.awt.Color(243, 241, 244));
        jTableReservas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTableReservas.setForeground(new java.awt.Color(102, 102, 102));
        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdReservas", "Nombre", "Mesa", "Hora", "Fecha"
            }
        ));
        jTableReservas.setGridColor(new java.awt.Color(255, 204, 204));
        jTableReservas.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTableReservas.setSelectionForeground(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(jTableReservas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 270, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cuaderno-abierto-vacio_400.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.white));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPBACKfondo.setBackground(new java.awt.Color(204, 204, 204));
        jPBACKfondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBACKfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        jPBACKfondo.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1000, 430));

        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jLELIMINARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLELIMINARMouseEntered

    private void jLELIMINARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLELIMINARMouseExited

    private void jLELIMINARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLELIMINARMouseClicked

    private void jLBUSCAR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR1MouseClicked

    private void jLBUSCAR1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR1MouseEntered

    private void jLBUSCAR1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR1MouseExited

    private void jLAGREGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLAGREGARMouseClicked

    private void jLAGREGARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLAGREGARMouseEntered

    private void jLAGREGARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLAGREGARMouseExited

    private void jLMODIFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLMODIFICARMouseClicked

    private void jLMODIFICARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLMODIFICARMouseEntered

    private void jLMODIFICARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLMODIFICARMouseExited

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jRadioBuNoVigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBuNoVigenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBuNoVigenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBoxMESASdisponibles;
    private com.toedter.calendar.JDateChooser jDateChooserFECHA;
    private javax.swing.JLabel jLAGREGAR;
    private javax.swing.JLabel jLBUSCAR1;
    private javax.swing.JLabel jLELIMINAR;
    private javax.swing.JLabel jLMODIFICAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPBACKfondo;
    private javax.swing.JRadioButton jRadioBuNoVigente;
    private javax.swing.JRadioButton jRadioBuVIGENTE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
package Interfaces;

import Misclases.Docente;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class InterfazDocente extends javax.swing.JInternalFrame {

    public InterfazDocente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfapellido = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        jtfdomicilio = new javax.swing.JTextField();
        jtftelefono = new javax.swing.JTextField();
        jtfcelular = new javax.swing.JTextField();
        jcbsexo = new javax.swing.JCheckBox();
        jtfemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfdni = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jcbactivo = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBregistrar = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jBlistar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jtbuscar = new javax.swing.JTextField();

        setClosable(true);
        setTitle("DOCENTES");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(933, 807));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "DATOS DEL DOCENTE"));
        jPanel1.setName(""); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("DNI Nº:");

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("APELLIDO:");

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("NOMBRE:");

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("FECHA DE NACIMIENTO:");

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("MASCULINO:");

        jLabel6.setText("DOMICILIO:");

        jLabel7.setText("TELEFONO:");

        jLabel8.setText("CELULAR");

        jtfapellido.setEnabled(false);
        jtfapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfapellidoKeyTyped(evt);
            }
        });

        jtfnombre.setEnabled(false);
        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfnombreKeyTyped(evt);
            }
        });

        jtfdomicilio.setEnabled(false);

        jtftelefono.setEnabled(false);
        jtftelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtftelefonoKeyTyped(evt);
            }
        });

        jtfcelular.setEnabled(false);
        jtfcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfcelularKeyTyped(evt);
            }
        });

        jcbsexo.setEnabled(false);

        jtfemail.setEnabled(false);

        jLabel9.setText("EMAIL:");

        jtfdni.setToolTipText("");
        jtfdni.setEnabled(false);
        jtfdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfdniKeyTyped(evt);
            }
        });

        jDateChooser1.setEnabled(false);

        jLabel10.setBackground(new java.awt.Color(204, 0, 0));
        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("ACTIVO");

        jcbactivo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)))
                        .addGap(79, 79, 79)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfdni, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfnombre)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbsexo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jtfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbactivo)))
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfdni)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfapellido)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbactivo)
                            .addComponent(jLabel10))
                        .addGap(12, 12, 12)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jcbsexo))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 63, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfdomicilio)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtftelefono)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfemail)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBnuevo.setText("NUEVO");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });
        jPanel3.add(jBnuevo);

        jBregistrar.setText("REGISTRAR");
        jBregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarActionPerformed(evt);
            }
        });
        jPanel3.add(jBregistrar);

        jBeditar.setText("EDITAR");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });
        jPanel3.add(jBeditar);

        jBborrar.setText("BORRAR");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });
        jPanel3.add(jBborrar);

        jBlistar.setText("LISTAR");
        jBlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlistarActionPerformed(evt);
            }
        });
        jPanel3.add(jBlistar);

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel3.add(jBsalir);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR DOCENTE"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setText("APELLIDO");

        jtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel11)
                .addGap(35, 35, 35)
                .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 900, 754);
    }// </editor-fold>//GEN-END:initComponents

    private void jBregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarActionPerformed
        //boton que graba el alta o la actualizacion del docente.
        //aqui va alta docente
        try {
            Principal.escuela.gd.altaDocente(capturar_datos());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            actualizartabla("");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBregistrarActionPerformed

    private void jBlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlistarActionPerformed
        try {
            actualizartabla("");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBlistarActionPerformed

    private void actualizartabla(String a) throws SQLException {
        ArrayList<Docente> ld = Principal.escuela.gd.listarDocente(a);
        Iterator<Docente> itrusu = ld.iterator();
        Integer contador;
        contador = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("F.N.");
        modelo.addColumn("SEXO");
        modelo.addColumn("DOMICILIO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CELULAR");
        modelo.addColumn("EMAIL");
        modelo.addColumn("ACTIVO");
        while (itrusu.hasNext()) {
            itrusu.next();
            String fila[] = new String[11];
            fila[0] = Integer.toString(ld.get(contador).id);
            fila[1] = Integer.toString(ld.get(contador).dni);
            fila[2] = ld.get(contador).apellido;
            fila[3] = ld.get(contador).nombre;
            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            fila[4] = formatter.format(ld.get(contador).fecha_nacimiento);
            fila[5] = String.valueOf(ld.get(contador).sexo);
            fila[6] = ld.get(contador).direccion;
            fila[7] = Integer.toString(ld.get(contador).telefono);
            fila[8] = Long.toString(ld.get(contador).celular);
            fila[9] = ld.get(contador).email;
            fila[10] = String.valueOf(ld.get(contador).activo);
            modelo.addRow(fila);
            contador++;
        }
        this.jTable1.setModel(modelo);
    }


    private void jtfdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfdniKeyTyped

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jtfapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfapellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfapellidoKeyTyped

    private void jtfnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfnombreKeyTyped

    private void jtftelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtftelefonoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtftelefonoKeyTyped

    private void jtfcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcelularKeyTyped
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfcelularKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        actualizadatosdocente();
    }//GEN-LAST:event_jTable1MouseClicked

    private void actualizadatosdocente() {
        habilitarCampos();
        int filaselec = this.jTable1.getSelectedRow();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = this.jTable1.getValueAt(filaselec, 4).toString().trim();
        Date dato = null;
        try {
            dato = formatoDelTexto.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jtfdni.setText(this.jTable1.getValueAt(filaselec, 1).toString());
        this.jtfdni.setEnabled(false);
        this.jtfapellido.setText(this.jTable1.getValueAt(filaselec, 2).toString());
        this.jtfnombre.setText(this.jTable1.getValueAt(filaselec, 3).toString());
        this.jDateChooser1.setDate(dato);
        this.jcbsexo.setSelected(Boolean.valueOf(this.jTable1.getValueAt(filaselec, 5).toString()));
        this.jtfdomicilio.setText(this.jTable1.getValueAt(filaselec, 6).toString());
        this.jtftelefono.setText(this.jTable1.getValueAt(filaselec, 7).toString());
        this.jtfcelular.setText(this.jTable1.getValueAt(filaselec, 8).toString());
        this.jtfemail.setText(this.jTable1.getValueAt(filaselec, 9).toString());
        this.jcbactivo.setSelected(Boolean.valueOf(this.jTable1.getValueAt(filaselec, 10).toString()));
    }

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        limpiarCampos();
        habilitarCampos();
        this.jtfdni.requestFocus();
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        try {
            Principal.escuela.gd.actualizaDocente(capturar_datos());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            actualizartabla("");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        try {
            Principal.escuela.gd.borrarDocente(capturar_datos());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            actualizartabla("");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbuscarKeyReleased
        try {
            actualizartabla(this.jtbuscar.getText().trim());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbuscarKeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            actualizadatosdocente();
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void limpiarCampos() {
        this.jtfapellido.setText("");
        this.jtfnombre.setText("");
        this.jtfdni.setText("");
        this.jtfdomicilio.setText("");
        this.jtftelefono.setText("");
        this.jtfcelular.setText("");
        this.jtfemail.setText("");
        this.jcbsexo.setSelected(false);
        this.jcbactivo.setSelected(true);
        this.jDateChooser1.setCalendar(null);
    }

    private void habilitarCampos() {
        this.jtfapellido.setEnabled(true);
        this.jtfnombre.setEnabled(true);
        this.jtfdni.setEnabled(true);
        this.jtfdomicilio.setEnabled(true);
        this.jtftelefono.setEnabled(true);
        this.jtfcelular.setEnabled(true);
        this.jtfemail.setEnabled(true);
        this.jcbsexo.setEnabled(true);
        this.jcbactivo.setEnabled(true);
        this.jDateChooser1.setEnabled(true);
    }

    private Docente capturar_datos() {
        Docente d = new Docente();
        int dn, t;
        long c;
        if (!"".equals(this.jtfdni.getText().trim())) {
            dn = Integer.parseInt(this.jtfdni.getText());
        } else {
            dn = 0;
        }
        String a = this.jtfapellido.getText().trim();
        String n = this.jtfnombre.getText().trim();
        Date f = this.jDateChooser1.getDate();
        Boolean s = this.jcbsexo.isSelected();
        Boolean act = this.jcbactivo.isSelected();
        String di = this.jtfdomicilio.getText().trim();
        if (!"".equals(this.jtftelefono.getText().trim())) {
            t = Integer.parseInt(this.jtftelefono.getText());
        } else {
            t = 0;
        }
        if (!"".equals(this.jtfcelular.getText().trim())) {
            c = Long.parseLong(this.jtfcelular.getText());
        } else {
            c = 0;
        }
        String e = this.jtfemail.getText().trim();
        d.CargarDatos(0, dn, a, n, f, s, di, t, c, e, act);
        return d;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBlistar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBregistrar;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox jcbactivo;
    private javax.swing.JCheckBox jcbsexo;
    private javax.swing.JTextField jtbuscar;
    private javax.swing.JTextField jtfapellido;
    private javax.swing.JTextField jtfcelular;
    private javax.swing.JTextField jtfdni;
    private javax.swing.JTextField jtfdomicilio;
    private javax.swing.JTextField jtfemail;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    // End of variables declaration//GEN-END:variables
}

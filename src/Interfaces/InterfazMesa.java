package Interfaces;

import Misclases.Docente;
import Misclases.Materia;
import Misclases.Mesa;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

public class InterfazMesa extends javax.swing.JInternalFrame {

    public InterfazMesa() throws SQLException {
        initComponents();
        materia_selecionada = new Materia();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jBregistrar = new javax.swing.JButton();
        jBlistar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jtbuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCcurso = new javax.swing.JComboBox<>();
        jCmateria = new javax.swing.JComboBox<>();
        jCpresidente = new javax.swing.JComboBox<>();
        jCvocal1 = new javax.swing.JComboBox<>();
        jCvocal2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Date fecha= new Date();
        SpinnerDateModel sm = new SpinnerDateModel(fecha,null,null,Calendar.HOUR);
        jSpinner1 = new javax.swing.JSpinner(sm);
        jTidmesa = new javax.swing.JTextField();
        jCcondicion = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        setClosable(true);
        setTitle("MESAS");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jBregistrar.setText("REGISTRAR");
        jBregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarActionPerformed(evt);
            }
        });

        jBlistar.setText("LISTAR");
        jBlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlistarActionPerformed(evt);
            }
        });

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBeditar.setText("EDITAR");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBnuevo.setText("NUEVO");
        jBnuevo.setPreferredSize(new java.awt.Dimension(933, 807));
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBborrar.setText("BORRAR");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jBregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBeditar)
                    .addComponent(jBborrar)
                    .addComponent(jBlistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBsalir))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR MESA DE EXAMEN"));

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

        jLabel11.setText("MATERIA");

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
                .addGap(198, 198, 198)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "DATOS DE LA MESA DE EXAMEN"));

        jLabel1.setText("ID");

        jLabel2.setText("CURSO");

        jLabel3.setText("FECHA");

        jLabel4.setText("CONDICION");

        jLabel5.setText("MATERIA");

        jLabel6.setText("HORA");

        jLabel7.setText("PRESIDENTE");

        jLabel8.setText("VOCAL 1");

        jLabel9.setText("VOCAL 2");

        jCcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[seleccione curso]", "1", "2", "3", "4", "5", "6" }));
        jCcurso.setEnabled(false);
        jCcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcursoActionPerformed(evt);
            }
        });

        jCmateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[seleccione materia]" }));
        jCmateria.setEnabled(false);
        jCmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmateriaActionPerformed(evt);
            }
        });

        jCpresidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[seleccione docente]" }));
        jCpresidente.setEnabled(false);

        jCvocal1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[seleccione docente]" }));
        jCvocal1.setEnabled(false);

        jCvocal2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[seleccione docente]" }));
        jCvocal2.setEnabled(false);

        jDateChooser1.setEnabled(false);

        JSpinner.DateEditor de= new JSpinner.DateEditor(jSpinner1,"HH:mm");
        jSpinner1.setEditor(de);
        jSpinner1.setEnabled(false);

        jTidmesa.setEditable(false);
        jTidmesa.setText("0");
        jTidmesa.setEnabled(false);

        jCcondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[seleccione condicion]" }));
        jCcondicion.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTidmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCpresidente, 0, 220, Short.MAX_VALUE)
                                    .addComponent(jCvocal1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCvocal2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jCcondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTidmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jCcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCcondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(jCpresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCvocal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCvocal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcursoActionPerformed
        try {
            rellenarcombomaterias();
        } catch (SQLException ex) {
            Logger.getLogger(InterfazMesa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jCcursoActionPerformed

    private void jCmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmateriaActionPerformed
        try {
            actualizarcombodocente();
        } catch (SQLException ex) {
            Logger.getLogger(InterfazMesa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jCmateriaActionPerformed

    private void jBregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarActionPerformed
        try {
            if ("0".equals(this.jTidmesa.getText())) {
                // graba la mesa
                Principal.escuela.gme.altaMesa(capturardatos());
                this.actualizartabla("");
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una nueva mesa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazMesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBregistrarActionPerformed

    private void jBlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlistarActionPerformed
        try {
            actualizartabla("");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBlistarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        try {
            if (!"0".equals(this.jTidmesa.getText())) {
                Principal.escuela.gme.actualizaMesa(capturardatos());
                actualizartabla("");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una mesa para actualizar");

            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazMesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        this.jTidmesa.setText("");
        this.materia_selecionada.id = 0;
        this.inicializar_combo();
        this.habilitar_objetos();
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        try {
            Principal.escuela.gme.borrarMesa(this.capturardatos());
            this.actualizartabla(this.jtbuscar.getText().trim());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazMesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        actualizadatosmesa();
    }//GEN-LAST:event_jTable1MouseClicked

    private void actualizadatosmesa() {
        try {
            int filaselec = this.jTable1.getSelectedRow();
            this.habilitar_objetos();
            this.jTidmesa.setText(this.jTable1.getValueAt(filaselec, 0).toString());
            int id_mesa = Integer.parseInt((String) this.jTable1.getValueAt(filaselec, 0));
            Mesa mesa_selecionada = new Mesa();
            mesa_selecionada = Principal.escuela.gme.buscarMesa(id_mesa);
            this.jDateChooser1.setDate(mesa_selecionada.fecha);
            String curso_selecionado = Integer.toString(mesa_selecionada.materia.curso);
            this.jCcurso.setSelectedItem(curso_selecionado);
            String cadena = mesa_selecionada.materia.nombre;
            this.jCmateria.setSelectedItem(cadena.trim());
            this.cargarcombocondicion();
            cadena = mesa_selecionada.condicion;
            this.jCcondicion.setSelectedItem(cadena.trim());
            this.actualizarcombodocente();
            cadena = mesa_selecionada.tribunal.presidente.apellido.trim() + " " + mesa_selecionada.tribunal.presidente.nombre.trim();
            this.jCpresidente.setSelectedItem(cadena);
            cadena = mesa_selecionada.tribunal.vocal1.apellido.trim() + " " + mesa_selecionada.tribunal.vocal1.nombre.trim();
            this.jCvocal1.setSelectedItem(cadena);
            cadena = mesa_selecionada.tribunal.vocal2.apellido.trim() + " " + mesa_selecionada.tribunal.vocal2.nombre.trim();
            this.jCvocal2.setSelectedItem(cadena);
            DateFormat fhora = new SimpleDateFormat("HH:mm");
            Date mifecha = fhora.parse(mesa_selecionada.horario);
            this.jSpinner1.setValue(mifecha);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(InterfazMesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbuscarKeyReleased
        try {
            actualizartabla(this.jtbuscar.getText().trim());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbuscarKeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            actualizadatosmesa();
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void rellenarcombomaterias() throws SQLException {
        if (this.jCcurso.getSelectedItem() != "[seleccione curso]") {
            ArrayList<Materia> lmateria = Principal.escuela.gm.listarMateria("");
            Iterator<Materia> itmateria = lmateria.iterator();
            int cur;
            cur = Integer.parseInt((String) this.jCcurso.getSelectedItem());
            Materia mataux = null;
            while (itmateria.hasNext()) {
                mataux = itmateria.next();
                if ((cur == mataux.curso) && (true == mataux.activo)) {
                    this.jCmateria.addItem(mataux.nombre.trim());
                }
            }
            this.cargarcombocondicion();
        }
    }

    private void actualizarcombodocente() throws SQLException {
        if (this.jCcurso.getSelectedItem() != "[seleccione curso]") {
            int curso;
            String nombre;
            curso = Integer.parseInt((String) this.jCcurso.getSelectedItem());
            nombre = (String) this.jCmateria.getSelectedItem();
            if (nombre != null) {
                materia_selecionada = Principal.escuela.gm.buscarMateria(curso, nombre);
                ArrayList<Docente> ld = materia_selecionada.lista_materia_docentes();
                Iterator<Docente> itrusu = ld.iterator();
                Integer contador;
                contador = 0;
                this.jCpresidente.removeAllItems();
                this.jCvocal1.removeAllItems();
                this.jCvocal2.removeAllItems();
                this.jCpresidente.addItem("[seleccione docente]");
                this.jCvocal1.addItem("[seleccione docente]");
                this.jCvocal2.addItem("[seleccione docente]");
                while (itrusu.hasNext()) {
                    itrusu.next();
                    if (ld.get(contador).activo) {
                        this.jCpresidente.addItem(ld.get(contador).apellido.trim() + " " + ld.get(contador).nombre.trim());
                        this.jCvocal1.addItem(ld.get(contador).apellido.trim() + " " + ld.get(contador).nombre.trim());
                        this.jCvocal2.addItem(ld.get(contador).apellido.trim() + " " + ld.get(contador).nombre.trim());
                    }
                    contador++;
                }
            }
        }

    }

    private void habilitar_objetos() {
        this.jCcurso.setEnabled(true);
        this.jCmateria.setEnabled(true);
        this.jCcondicion.setEnabled(true);
        this.jCpresidente.setEnabled(true);
        this.jCvocal1.setEnabled(true);
        this.jCvocal2.setEnabled(true);
        this.jSpinner1.setEnabled(true);
        this.jDateChooser1.setEnabled(true);
        this.jTidmesa.setText("0");

    }

    private void inicializar_combo() {
        this.jCcurso.setSelectedItem("[seleccione curso]");
        this.jCmateria.removeAllItems();
        this.jCmateria.addItem("[seleccione materia]");
        this.jCcondicion.removeAllItems();
        this.jCcondicion.addItem("[seleccione condicion]");
        this.jCpresidente.removeAllItems();
        this.jCpresidente.addItem("[seleccione docente]");
        this.jCvocal1.removeAllItems();
        this.jCvocal1.addItem("[seleccione docente]");
        this.jCvocal2.removeAllItems();
        this.jCvocal2.addItem("[seleccione docente]");
    }

    private void cargarcombocondicion() {
        this.jCcondicion.removeAllItems();
        this.jCcondicion.addItem("[seleccione condicion]");
        this.jCcondicion.addItem("REGULARES");
        this.jCcondicion.addItem("PENDIENTES");
        this.jCcondicion.addItem("EQUIVALENTES");
        this.jCcondicion.addItem("COMPLETAR CARRERA");
    }

    private void actualizartabla(String a) throws SQLException {
        ArrayList<Mesa> lm = Principal.escuela.gme.listarMesa(a);
        Iterator<Mesa> itrusu = lm.iterator();
        Integer contador;
        contador = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("CURSO");
        modelo.addColumn("MATERIA");
        modelo.addColumn("FECHA");
        modelo.addColumn("CONDICION");
        modelo.addColumn("CERRADA");
        while (itrusu.hasNext()) {
            itrusu.next();
            String fila[] = new String[6];
            fila[0] = Integer.toString(lm.get(contador).id);
            fila[1] = Integer.toString(lm.get(contador).materia.curso);
            fila[2] = lm.get(contador).materia.nombre;
            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            fila[3] = formatter.format(lm.get(contador).fecha);
            fila[4] = lm.get(contador).condicion;
            fila[5] = String.valueOf(lm.get(contador).cerrada);
            modelo.addRow(fila);
            contador++;
        }
        this.jTable1.setModel(modelo);
    }

    private Mesa capturardatos() {
        Mesa mesa_capturada = new Mesa();
        int id = Integer.parseInt(this.jTidmesa.getText());
        Docente docente_presidente = null, docente_vocal1 = null, docente_vocal2 = null;
        String apellidoynombre, comboapellidoynombre, condi;
        ArrayList<Docente> ld = materia_selecionada.lista_materia_docentes();
        Iterator<Docente> itrusu = ld.iterator();
        Integer contador;
        contador = 0;
        // busca docentes de la mesa
        while (itrusu.hasNext()) {
            itrusu.next();
            apellidoynombre = ld.get(contador).apellido.trim() + " " + ld.get(contador).nombre.trim();
            comboapellidoynombre = (String) this.jCpresidente.getSelectedItem();
            if (apellidoynombre.equals(comboapellidoynombre)) {
                docente_presidente = ld.get(contador);
            }
            comboapellidoynombre = (String) this.jCvocal1.getSelectedItem();
            if (apellidoynombre.equals(comboapellidoynombre)) {
                docente_vocal1 = ld.get(contador);
            }
            comboapellidoynombre = (String) this.jCvocal2.getSelectedItem();
            if (apellidoynombre.equals(comboapellidoynombre)) {
                docente_vocal2 = ld.get(contador);
            }
            contador++;
        }
        Date fech = this.jDateChooser1.getDate();
        DateFormat fhora = new SimpleDateFormat("HH:mm");
        String hora = fhora.format(this.jSpinner1.getValue());
        condi = this.jCcondicion.getSelectedItem().toString().trim();
        mesa_capturada.cargar(id, materia_selecionada, fech, hora, condi, docente_presidente, docente_vocal1, docente_vocal2);
        return mesa_capturada;
    }

    private Materia materia_selecionada;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBlistar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBregistrar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCcondicion;
    private javax.swing.JComboBox<String> jCcurso;
    private javax.swing.JComboBox<String> jCmateria;
    private javax.swing.JComboBox<String> jCpresidente;
    private javax.swing.JComboBox<String> jCvocal1;
    private javax.swing.JComboBox<String> jCvocal2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTidmesa;
    private javax.swing.JTextField jtbuscar;
    // End of variables declaration//GEN-END:variables
}

package Interfaces;

import Conexiondb.Conexion;
import static Interfaces.Principal.ventanaContenedor;
import Misclases.Alumno;
import Misclases.Mesa;
import Misclases.Permiso;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class InterfazInscripcion extends javax.swing.JInternalFrame {

    private Mesa mesa_selecionada;

    public InterfazInscripcion() throws SQLException {
        initComponents();
        mesa_selecionada = new Mesa();
        actualizartabla("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jBimprimir = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtbuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jInscribir = new javax.swing.JButton();
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
        jTidmesa = new javax.swing.JTextField();
        jBuscarMesa = new javax.swing.JButton();
        jTmateria = new javax.swing.JTextField();
        jTcurso = new javax.swing.JTextField();
        jTcondicion = new javax.swing.JTextField();
        jTpresidente = new javax.swing.JTextField();
        jTvocal1 = new javax.swing.JTextField();
        jTvocal2 = new javax.swing.JTextField();
        jTfecha = new javax.swing.JTextField();
        jThora = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBborrar = new javax.swing.JButton();
        jbpermiso = new javax.swing.JButton();

        setClosable(true);
        setTitle("INSCRIPCION DE ALUMNOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(97, 40));
        setName(""); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 97, 0));
        setPreferredSize(new java.awt.Dimension(933, 807));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBimprimir.setText("IMPRIMIR ACTA VOLANTE");
        jBimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirActionPerformed(evt);
            }
        });
        jPanel3.add(jBimprimir);

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel3.add(jBsalir);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR ALUMNO"));
        jPanel2.setPreferredSize(new java.awt.Dimension(893, 392));

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
        jScrollPane1.setViewportView(jTable1);

        jtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbuscarKeyReleased(evt);
            }
        });

        jLabel11.setText("APELLIDO");

        jInscribir.setText("INSCRIBIR ALUMNO");
        jInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel11)
                .addGap(31, 31, 31)
                .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInscribir)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jInscribir)))
                .addContainerGap())
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

        jTidmesa.setEditable(false);

        jBuscarMesa.setText("BUSCAR MESA");
        jBuscarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarMesaActionPerformed(evt);
            }
        });

        jTmateria.setEditable(false);

        jTcurso.setEditable(false);

        jTcondicion.setEditable(false);

        jTpresidente.setEditable(false);

        jTvocal1.setEditable(false);

        jTvocal2.setEditable(false);

        jTfecha.setEditable(false);

        jThora.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTidmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTvocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTvocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTpresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTcondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jThora, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBuscarMesa)
                        .addGap(58, 58, 58))))
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
                    .addComponent(jTmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(jTpresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jThora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTvocal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jBuscarMesa)
                    .addComponent(jTvocal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ALUMNOS INSCRIPTOS EN LA MESA"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jBborrar.setText(" BORRAR ALUMNO");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jbpermiso.setText("PERMISO DE EXAMEN");
        jbpermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpermisoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBborrar)
                    .addComponent(jbpermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbpermiso)
                .addGap(18, 18, 18)
                .addComponent(jBborrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(568, 568, 568))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 907, 790);
    }// </editor-fold>//GEN-END:initComponents


    private void jInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInscribirActionPerformed
        if (!"".equals(InterfazInscripcion.jTidmesa.getText().trim())) {
            try {
                int id_mesa = Integer.parseInt(InterfazInscripcion.jTidmesa.getText());
                mesa_selecionada = Principal.escuela.gme.buscarMesa(id_mesa);
                if (mesa_selecionada != null) {
                    int fila = this.jTable1.getSelectedRow();
                    if (fila != -1) {
                        int id_alumno = Integer.parseInt((String) this.jTable1.getValueAt(fila, 0));
                        Alumno alumno_buscado = mesa_selecionada.buscarAlumno(id_alumno);
                        //busca en la mesa si el alumno fue inscripto o no 
                        if (alumno_buscado.id == 0) {
                            mesa_selecionada.agregarAlumno(id_alumno);
                            this.actualizartabla2(mesa_selecionada);
                            JOptionPane.showMessageDialog(null, "El Alumno fue inscripto a la mesa con exito");
                        } else {
                            JOptionPane.showMessageDialog(null, "El Alumno ya fue inscripto a la mesa");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione un Alumno para inscribir");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(InterfazInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Buscar la mesa para inscribir al Alumno");
        }
    }//GEN-LAST:event_jInscribirActionPerformed

    private void jBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirActionPerformed
        if (mesa_selecionada != null) {
            try {
                Principal.escuela.gp.Genera_permisos(mesa_selecionada);
                try {
                    Conexion cx = new Conexion();
                    String rutainforme = "C:\\ProyectoPS\\SistemaEscuela\\src\\Reportes\\report1.jasper";
                    Map parametros = new HashMap();
                    parametros.put("idmesa", InterfazInscripcion.jTidmesa.getText());
                    JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutainforme);
                    JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cx.getconecion());
                    JasperViewer preimpresion = new JasperViewer(jp, false);
                    preimpresion.setTitle("PREIMPRESION ACTA VOLANTE");
                    preimpresion.setVisible(true);
                } catch (SQLException | JRException ex) {
                    Logger.getLogger(InterfazInscripcion.class.getName()).log(Level.SEVERE, null, ex);

                }
            } catch (SQLException ex) {
                Logger.getLogger(InterfazInscripcion.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }//GEN-LAST:event_jBimprimirActionPerformed


    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        if (!"".equals(InterfazInscripcion.jTidmesa.getText().trim())) {
            try {
                int id_mesa = Integer.parseInt(InterfazInscripcion.jTidmesa.getText().trim());
                Mesa mesa_selecionada = Principal.escuela.gme.buscarMesa(id_mesa);
                Permiso permiso_alumno;
                if (this.jTable2.getRowCount() > 0) {
                    int fila = this.jTable2.getSelectedRow();
                    if (fila != -1) {
                        int id_alumno = Integer.parseInt((String) this.jTable2.getValueAt(fila, 0));
                        mesa_selecionada.borrarAlumno(id_alumno);
                        this.actualizartabla2(mesa_selecionada);
                        permiso_alumno = Principal.escuela.gp.Buscar_Permiso(id_alumno);
                        Principal.escuela.gp.Actualizar_Permiso(permiso_alumno);
                        JOptionPane.showMessageDialog(null, "El alumno fue Borrado de la Mesa con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione el Alumno para borrar de la Mesa");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay Alumnos inscriptos en la Mesa");
                }
            } catch (SQLException ex) {
                Logger.getLogger(InterfazInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Busque una Mesa");
        }
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbuscarKeyReleased
        try {
            actualizartabla(this.jtbuscar.getText().trim());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbuscarKeyReleased

    private void jBuscarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarMesaActionPerformed
        VentanaBuscarMesa vbm;
        try {
            vbm = new VentanaBuscarMesa();
            ventanaContenedor.add(vbm);
            vbm.setBounds(950, 0, 900, 500);
            vbm.show();
        } catch (SQLException ex) {
            Logger.getLogger(InterfazInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBuscarMesaActionPerformed

    private void jbpermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpermisoActionPerformed
        int filaselec = this.jTable2.getSelectedRow();
        if (filaselec != -1) {
            InterfazPermiso permiso = new InterfazPermiso();
            ventanaContenedor.add(permiso);
            permiso.show();
            InterfazPermiso.jTidalumno.setText(this.jTable2.getValueAt(filaselec, 0).toString());
            InterfazPermiso.jtfdni1.setText(this.jTable2.getValueAt(filaselec, 1).toString());
            InterfazPermiso.jtfapellido1.setText(this.jTable2.getValueAt(filaselec, 2).toString());
            InterfazPermiso.jtfnombre1.setText(this.jTable2.getValueAt(filaselec, 3).toString());
            if (!"".equals(InterfazPermiso.jTidalumno.getText().trim())) {
                int id = Integer.parseInt(InterfazPermiso.jTidalumno.getText().trim());
                try {
                    InterfazPermiso.actualizartabla2(id);
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazInscripcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.dispose();
        }
    }//GEN-LAST:event_jbpermisoActionPerformed

    private void actualizartabla(String a) throws SQLException {
        ArrayList<Alumno> la = Principal.escuela.ga.listarAlumno(a);
        Iterator<Alumno> itrusu = la.iterator();
        Integer contador;
        contador = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("F.N.");
        while (itrusu.hasNext()) {
            itrusu.next();
            String fila[] = new String[5];
            fila[0] = Integer.toString(la.get(contador).id);
            fila[1] = Integer.toString(la.get(contador).dni);
            fila[2] = la.get(contador).apellido;
            fila[3] = la.get(contador).nombre;
            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            fila[4] = formatter.format(la.get(contador).fecha_nacimiento);
            modelo.addRow(fila);
            contador++;
        }
        this.jTable1.setModel(modelo);
    }

    public static void actualizartabla2(Mesa mes) throws SQLException {
        ArrayList<Alumno> la = mes.listarAlumnos();
        Iterator<Alumno> itrusu = la.iterator();
        Integer contador;
        contador = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("NOMBRE");
        while (itrusu.hasNext()) {
            itrusu.next();
            String fila[] = new String[4];
            fila[0] = Integer.toString(la.get(contador).id);
            fila[1] = Integer.toString(la.get(contador).dni);
            fila[2] = la.get(contador).apellido;
            fila[3] = la.get(contador).nombre;
            modelo.addRow(fila);
            contador++;
        }
        InterfazInscripcion.jTable2.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBimprimir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscarMesa;
    private javax.swing.JButton jInscribir;
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
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    public static javax.swing.JTextField jTcondicion;
    public static javax.swing.JTextField jTcurso;
    public static javax.swing.JTextField jTfecha;
    public static javax.swing.JTextField jThora;
    public static javax.swing.JTextField jTidmesa;
    public static javax.swing.JTextField jTmateria;
    public static javax.swing.JTextField jTpresidente;
    public static javax.swing.JTextField jTvocal1;
    public static javax.swing.JTextField jTvocal2;
    private javax.swing.JButton jbpermiso;
    private javax.swing.JTextField jtbuscar;
    // End of variables declaration//GEN-END:variables
}

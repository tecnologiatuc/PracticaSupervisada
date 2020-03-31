package Interfaces;

import static Interfaces.Principal.ventanaContenedor;
import Misclases.Alumno;
import Misclases.Mesa;
import Misclases.Permiso;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfazPermiso extends javax.swing.JInternalFrame {

    public InterfazPermiso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jBinscripcion = new javax.swing.JButton();
        jBimprimir = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtbuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTidalumno = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfdni1 = new javax.swing.JTextField();
        jtfapellido1 = new javax.swing.JTextField();
        jtfnombre1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setTitle("PERMISO DE EXAMEN");
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

        jBinscripcion.setText("INSCRIPCIONES");
        jBinscripcion.setEnabled(false);
        jBinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscripcionActionPerformed(evt);
            }
        });
        jPanel3.add(jBinscripcion);

        jBimprimir.setText("IMPRIMIR PERMISO");
        jBimprimir.setEnabled(false);
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

        jtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbuscarKeyReleased(evt);
            }
        });

        jLabel11.setText("APELLIDO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31)
                        .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "DATOS DEL ALUMNO"));

        jLabel1.setText("ID");

        jTidalumno.setEditable(false);

        jLabel22.setText("DNI Nº:");

        jLabel2.setText("APELLIDO:");

        jLabel3.setText("NOMBRE:");

        jtfdni1.setEditable(false);
        jtfdni1.setToolTipText("");
        jtfdni1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfdni1KeyTyped(evt);
            }
        });

        jtfapellido1.setEditable(false);
        jtfapellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfapellido1KeyTyped(evt);
            }
        });

        jtfnombre1.setEditable(false);
        jtfnombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfnombre1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtfapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTidalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jtfdni1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel22, jLabel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(jTidalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jtfdni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel22, jLabel3});

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "MATERIAS INSCRIPTAS"));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
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
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void jBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirActionPerformed
        try {
            int id_alu = Integer.parseInt(this.jTidalumno.getText().trim());
            Permiso permiso_alumno = new Permiso();
            permiso_alumno = Principal.escuela.gp.Buscar_Permiso(id_alu);
            if (permiso_alumno == null) {
                Principal.escuela.gp.Alta_Permiso(id_alu);
                permiso_alumno = Principal.escuela.gp.Buscar_Permiso(id_alu);
                if (permiso_alumno != null) {
                    JOptionPane.showMessageDialog(null, "Permiso del alumno generado");
                    Principal.escuela.gp.Imprimir_Permiso(permiso_alumno);
                } else {
                    JOptionPane.showMessageDialog(null, "El alumno no esta inscripto para rendir ninguna materia");
                }
            } else {
                Principal.escuela.gp.Actualizar_Permiso(permiso_alumno);
                JOptionPane.showMessageDialog(null, "Permiso del alumno actualizado");
                Principal.escuela.gp.Imprimir_Permiso(permiso_alumno);
            }

        } catch (SQLException ex) {
            Logger.getLogger(InterfazPermiso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBimprimirActionPerformed


    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jtfdni1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdni1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfdni1KeyTyped

    private void jtfapellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfapellido1KeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfapellido1KeyTyped

    private void jtfnombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombre1KeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfnombre1KeyTyped

    private void jBinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscripcionActionPerformed
        try {
            ventanaContenedor.removeAll();
            InterfazInscripcion ins = new InterfazInscripcion();
            ventanaContenedor.add(ins);
            ins.show();
        } catch (SQLException ex) {
            Logger.getLogger(InterfazPermiso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBinscripcionActionPerformed

    private void jtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbuscarKeyReleased
        try {
            actualizartabla(this.jtbuscar.getText().trim());
        } catch (SQLException ex) {
            Logger.getLogger(InterfazAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbuscarKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        actualizadatosalumno();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            actualizadatosalumno();
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void actualizadatosalumno() {
        try {
            int filaselec = this.jTable1.getSelectedRow();
            this.jTidalumno.setText(this.jTable1.getValueAt(filaselec, 0).toString());
            this.jtfdni1.setText(this.jTable1.getValueAt(filaselec, 1).toString());
            this.jtfapellido1.setText(this.jTable1.getValueAt(filaselec, 2).toString());
            this.jtfnombre1.setText(this.jTable1.getValueAt(filaselec, 3).toString());
            if (!"".equals(this.jTidalumno.getText().trim())) {
                int id = Integer.parseInt(this.jTidalumno.getText().trim());
                actualizartabla2(id);
                this.jBimprimir.setEnabled(true);
                this.jBinscripcion.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazPermiso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
        while (itrusu.hasNext()) {
            itrusu.next();
            String fila[] = new String[5];
            fila[0] = Integer.toString(la.get(contador).id);
            fila[1] = Integer.toString(la.get(contador).dni);
            fila[2] = la.get(contador).apellido;
            fila[3] = la.get(contador).nombre;
            modelo.addRow(fila);
            contador++;
        }
        this.jTable1.setModel(modelo);
    }

    public static void actualizartabla2(int id) throws SQLException {
        ArrayList<Mesa> lm = Principal.escuela.gme.BuscarMesas(id);
        Iterator<Mesa> itrusu = lm.iterator();
        Integer contador;
        contador = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("CURSO");
        modelo.addColumn("MATERIA");
        modelo.addColumn("FECHA");
        modelo.addColumn("HORA");
        modelo.addColumn("CONDICION");
        modelo.addColumn("ESTADO");
        while (itrusu.hasNext()) {
            itrusu.next();
            String fila[] = new String[7];
            fila[0] = Integer.toString(lm.get(contador).id);
            fila[1] = Integer.toString(lm.get(contador).materia.curso);
            fila[2] = lm.get(contador).materia.nombre;
            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            fila[3] = formatter.format(lm.get(contador).fecha);
            fila[4] = String.valueOf(lm.get(contador).horario);
            fila[5] = lm.get(contador).condicion;
            fila[6] = "ACTIVO";
            modelo.addRow(fila);
            contador++;
        }
        jTable2.setModel(modelo);
        InterfazPermiso.jBimprimir.setEnabled(true);
        InterfazPermiso.jBinscripcion.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton jBimprimir;
    protected static javax.swing.JButton jBinscripcion;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTextField jTidalumno;
    private javax.swing.JTextField jtbuscar;
    public static javax.swing.JTextField jtfapellido1;
    public static javax.swing.JTextField jtfdni1;
    public static javax.swing.JTextField jtfnombre1;
    // End of variables declaration//GEN-END:variables
}

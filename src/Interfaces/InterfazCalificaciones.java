package Interfaces;

import static Interfaces.Principal.ventanaContenedor;
import Misclases.Alumno;
import Misclases.Examen;
import Misclases.Mesa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfazCalificaciones extends javax.swing.JInternalFrame {

    public static Mesa mesa_selecionada;
    public Examen examen_selecionado;

    public InterfazCalificaciones() throws SQLException {
        initComponents();
        mesa_selecionada = new Mesa();
        examen_selecionado = new Examen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jBCerrarMesa = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBactualizaCalificacion = new javax.swing.JButton();
        jTidalumno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtfdni = new javax.swing.JTextField();
        jtfapellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfnombre = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jtfnota = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtflibro = new javax.swing.JTextField();
        jtffolio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setTitle("CALIFICACIONES DE LAS MESAS");
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

        jBCerrarMesa.setText("CERRAR LA MESA");
        jBCerrarMesa.setEnabled(false);
        jBCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarMesaActionPerformed(evt);
            }
        });
        jPanel3.add(jBCerrarMesa);

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel3.add(jBsalir);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CALIFICACION DEL ALUMNO"));
        jPanel2.setPreferredSize(new java.awt.Dimension(893, 392));

        jBactualizaCalificacion.setEnabled(false);
        jBactualizaCalificacion.setLabel("ACTUALIZAR CALIFICACION");
        jBactualizaCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizaCalificacionActionPerformed(evt);
            }
        });

        jTidalumno.setEditable(false);

        jLabel10.setText("ID");

        jLabel22.setText("DNI Nº:");

        jtfdni.setEditable(false);
        jtfdni.setToolTipText("");
        jtfdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfdniKeyTyped(evt);
            }
        });

        jtfapellido.setEditable(false);
        jtfapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfapellidoActionPerformed(evt);
            }
        });
        jtfapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfapellidoKeyTyped(evt);
            }
        });

        jLabel11.setText("APELLIDO:");

        jLabel12.setText("NOMBRE:");

        jtfnombre.setEditable(false);
        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfnombreKeyTyped(evt);
            }
        });

        jCheckBox1.setText("ALUMNO PRESENTE");
        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jtfnota.setEditable(false);
        jtfnota.setText("0");
        jtfnota.setToolTipText("");
        jtfnota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfnotaFocusLost(evt);
            }
        });
        jtfnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnotaActionPerformed(evt);
            }
        });
        jtfnota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfnotaKeyTyped(evt);
            }
        });

        jLabel15.setText("NOTA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfnota, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBactualizaCalificacion)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTidalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfdni, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTidalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jtfdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jBactualizaCalificacion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel15)
                            .addComponent(jtfnota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
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

        jLabel13.setText("LIBRO Nº");

        jLabel14.setText("FOLIO Nº");

        jtflibro.setEditable(false);
        jtflibro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtflibro.setText("0");
        jtflibro.setToolTipText("");

        jtffolio.setEditable(false);
        jtffolio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtffolio.setText("0");
        jtffolio.setToolTipText("");

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
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(2, 2, 2)
                                .addComponent(jtflibro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jtffolio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jThora, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jBuscarMesa)
                                .addGap(58, 58, 58))))))
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
                    .addComponent(jTvocal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jtflibro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtffolio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ALUMNOS INSCRIPTOS"));

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
        jTable2.setEnabled(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 878, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(568, 568, 568))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel2.getAccessibleContext().setAccessibleName("CALIFICACIONES DEL ALUMNO\n");

        setBounds(0, 0, 907, 811);
    }// </editor-fold>//GEN-END:initComponents


    private void jBactualizaCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizaCalificacionActionPerformed
        try {
            examen_selecionado.asistencia = InterfazCalificaciones.jCheckBox1.isSelected();
            examen_selecionado.nota = Integer.parseInt(InterfazCalificaciones.jtfnota.getText());
            this.jtfnota.setEditable(false);
            Principal.escuela.ge.Actualizar_Examen(examen_selecionado);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBactualizaCalificacionActionPerformed

    private void jBCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarMesaActionPerformed
        int nro_libro, nro_folio;
        nro_libro = Integer.parseInt(InterfazCalificaciones.jtflibro.getText());
        nro_folio = Integer.parseInt(InterfazCalificaciones.jtffolio.getText());
        if (mesa_selecionada != null) {
            if ((nro_libro > 0) && (nro_folio > 0)) {
                mesa_selecionada.CerrarMesa(nro_libro, nro_folio);
                try {
                    Principal.escuela.gme.actualizaMesa(mesa_selecionada);
                    Principal.escuela.ge.Cerrar_Examenes(mesa_selecionada.id);
                    Principal.escuela.gp.Cerrar_Permisos(mesa_selecionada);
                    InterfazCalificaciones.jBactualizaCalificacion.setEnabled(false);
                    InterfazCalificaciones.jtflibro.setEditable(false);
                    InterfazCalificaciones.jtffolio.setEditable(false);
                    InterfazCalificaciones.jBCerrarMesa.setEnabled(false);
                    InterfazCalificaciones.jBactualizaCalificacion.setEnabled(false);
                    InterfazCalificaciones.jTable2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "La mesa fue cerrada con exito");
                    Principal.escuela.gme.actualizarlistas();
                    limpiarcamposalumno();
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el número de libro y número de folio para cerrar la mesa");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Busque una mesa para cargar las calificaciones y cerrar");
        }
    }//GEN-LAST:event_jBCerrarMesaActionPerformed
    private void limpiarcamposalumno() {
        InterfazCalificaciones.jTidalumno.setText("");
        InterfazCalificaciones.jtfdni.setText("");
        InterfazCalificaciones.jtfapellido.setText("");
        InterfazCalificaciones.jtfnombre.setText("");
        InterfazCalificaciones.jtfnota.setText("0");
        InterfazCalificaciones.jCheckBox1.setEnabled(false);
        InterfazCalificaciones.jtfnota.setEditable(false);
    }

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBuscarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarMesaActionPerformed
        VentanaBuscarMesaCalificaciones vbm;
        try {
            vbm = new VentanaBuscarMesaCalificaciones();
            ventanaContenedor.add(vbm);
            vbm.setBounds(950, 0, 900, 500);
            vbm.show();
        } catch (SQLException ex) {
            Logger.getLogger(InterfazCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBuscarMesaActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try {
            int filaselec = this.jTable2.getSelectedRow();
            int id_mesa = Integer.parseInt(InterfazCalificaciones.jTidmesa.getText().toString());
            int id_alumno = Integer.parseInt((String) this.jTable2.getValueAt(filaselec, 0));
            examen_selecionado = new Examen();
            examen_selecionado = Principal.escuela.ge.Buscar_Examen(id_mesa, id_alumno);
            InterfazCalificaciones.jTidalumno.setText(this.jTable2.getValueAt(filaselec, 0).toString());
            InterfazCalificaciones.jtfdni.setText(this.jTable2.getValueAt(filaselec, 1).toString());
            InterfazCalificaciones.jtfapellido.setText(this.jTable2.getValueAt(filaselec, 2).toString());
            InterfazCalificaciones.jtfnombre.setText(this.jTable2.getValueAt(filaselec, 3).toString());
            InterfazCalificaciones.jtfnota.setText(Integer.toString(examen_selecionado.nota));
            InterfazCalificaciones.jCheckBox1.setSelected(examen_selecionado.asistencia);
            InterfazCalificaciones.jBactualizaCalificacion.setEnabled(true);
            if (examen_selecionado.asistencia) {
                this.jtfnota.setEditable(true);
            } else {
                this.jtfnota.setEditable(false);
            }
            InterfazCalificaciones.jCheckBox1.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jtfdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfdniKeyTyped

    private void jtfapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfapellidoActionPerformed

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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (this.jCheckBox1.isSelected()) {
            this.jtfnota.setEditable(true);
        } else {
            this.jtfnota.setEditable(false);
            this.jtfnota.setText("0");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jtfnotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfnotaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnotaFocusLost

    private void jtfnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnotaActionPerformed

    private void jtfnotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnotaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnotaKeyTyped

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
        InterfazCalificaciones.jTable2.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jBCerrarMesa;
    public static javax.swing.JButton jBactualizaCalificacion;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscarMesa;
    protected static javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTextField jTcondicion;
    public static javax.swing.JTextField jTcurso;
    public static javax.swing.JTextField jTfecha;
    public static javax.swing.JTextField jThora;
    public static javax.swing.JTextField jTidalumno;
    public static javax.swing.JTextField jTidmesa;
    public static javax.swing.JTextField jTmateria;
    public static javax.swing.JTextField jTpresidente;
    public static javax.swing.JTextField jTvocal1;
    public static javax.swing.JTextField jTvocal2;
    public static javax.swing.JTextField jtfapellido;
    public static javax.swing.JTextField jtfdni;
    public static javax.swing.JTextField jtffolio;
    public static javax.swing.JTextField jtflibro;
    public static javax.swing.JTextField jtfnombre;
    public static javax.swing.JTextField jtfnota;
    // End of variables declaration//GEN-END:variables
}

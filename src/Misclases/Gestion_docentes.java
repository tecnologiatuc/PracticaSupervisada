package Misclases;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gestion_docentes {

    private final Lista_docentes ld;

    public Gestion_docentes() throws SQLException {
        ld = new Lista_docentes();
    }

    public void altaDocente(Docente doc) throws SQLException {
        Docente docaux;
        docaux = buscarDocente(doc);
        if (docaux.apellido == null) {
            if (doc.dni != 0) {
                if ((!"".equals(doc.apellido)) && (!"".equals(doc.nombre))) {
                    if (doc.fecha_nacimiento != null) {
                        ld.agregar(doc);
                        JOptionPane.showMessageDialog(null, "El docente fue registrado con exito");

                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese la fecha de nacimiento del Docente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese el apellido y nombre del Docente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese DNI del Docente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Docente " + docaux.apellido.trim() + " ya fue dado de alta");
        }
    }

    public Docente buscarDocente(Docente doc) {
        int dn = doc.dni;
        Docente docencontrado = ld.buscar(dn);
        return docencontrado;
    }

    public void actualizaDocente(Docente doc) throws SQLException {
        Docente docaux;
        docaux = buscarDocente(doc);
        doc.id = docaux.id;
        if ((!"".equals(doc.apellido)) && (!"".equals(doc.nombre))) {
            if (doc.fecha_nacimiento != null) {
                ld.actualizar(doc);
                JOptionPane.showMessageDialog(null, "El docente fue actualizado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha de nacimiento del Docente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el apellido y nombre del Docente");
        }
    }

    public ArrayList<Docente> listarDocente(String a) throws SQLException {
        return ld.listar(a);
    }

    public void borrarDocente(Docente doc) throws SQLException {
        Docente docaux;
        docaux = buscarDocente(doc);
        doc.id = docaux.id;
        if ((!"".equals(doc.apellido)) && (!"".equals(doc.nombre))) {
            if (doc.fecha_nacimiento != null) {
                doc.activo = false;
                ld.actualizar(doc);
                JOptionPane.showMessageDialog(null, "El docente fue borrado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha de nacimiento del Docente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el apellido y nombre del Docente");
        }
    }
}

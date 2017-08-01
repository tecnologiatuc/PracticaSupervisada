package Misclases;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gestion_materias {

    private final Lista_materias lm;

    public Gestion_materias() throws SQLException {
        lm = new Lista_materias();
    }

    public void altaMateria(Materia mat) throws SQLException {
        Materia mataux;
        mataux = buscarMateria(mat);
        if (mataux.nombre == null) {
            if (!"".equals(mat.nombre)) {
                lm.agregar(mat);
                JOptionPane.showMessageDialog(null, "La materia fue registrada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre de la materia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Materia " + mataux.nombre.trim() + " ya fue dado de alta");
        }
    }

    public Materia buscarMateria(Materia mat) throws SQLException {
        Materia matencontrado = lm.buscar(mat);
        return matencontrado;
    }
    
    public Materia buscarMateria(int id) throws SQLException {
        Materia matencontrado = lm.buscar(id);
        return matencontrado;
    }
    
    public Materia buscarMateria(int curso , String nombre) throws SQLException {
        Materia matencontrado = lm.buscar(curso,nombre);
        return matencontrado;
    }
    
    public void actualizaMateria(Materia mat) throws SQLException {
        Materia mataux, mataux1;
        if (mat.id != 0) {
            mataux = buscarMateria(mat.id);
            if (mataux.id == mat.id) {
                mataux1 = buscarMateria(mat);
                if (mataux1.nombre == null) {
                    if (!"".equals(mat.nombre.trim())) {
                        lm.actualizar(mat);
                        JOptionPane.showMessageDialog(null, "La materia fue actualizada con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese el nombre de la materia");
                    }
                } else {
                    mat.curso = mataux.curso;
                    mat.nombre = mataux.nombre;
                    lm.actualizar(mat);
                    JOptionPane.showMessageDialog(null, "La materia fue actualizada con exito");
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede actualizar ya existe la materia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede actualizar debe crear una nueva materia");
        }
    }

    
    public ArrayList<Materia> listarMateria(String a) throws SQLException {
        return lm.listar(a);
    }

    public void borrarMateria(Materia mat) throws SQLException {
        Materia mataux;
        mataux = buscarMateria(mat);
        mat.id = mataux.id;
        if (!"".equals(mat.nombre)) {
            mat.activo = false;
            lm.actualizar(mat);
            JOptionPane.showMessageDialog(null, "La materia fue borrada con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la Materia");
        }
    }
    
 }

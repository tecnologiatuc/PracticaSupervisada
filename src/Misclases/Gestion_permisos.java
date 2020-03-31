package Misclases;

import Interfaces.Principal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Gestion_permisos {
    //  aqui debemos buscar las mesas donde esta inscripto el alumno, si no hay 

    private final Lista_permisos lista_permisos;

    public Gestion_permisos() throws SQLException {
        lista_permisos = new Lista_permisos();
    }

    public Permiso Buscar_Permiso(int id_alu) throws SQLException {
        lista_permisos.cargarlista(id_alu);
        Permiso permiso_encontrado = lista_permisos.buscar_permiso(id_alu);
        return permiso_encontrado;
    }

    public void Alta_Permiso(int id_alu) throws SQLException {
        lista_permisos.Agregar_Permiso(id_alu);
    }

    public void Actualizar_Permiso(Permiso permiso_alumno) throws SQLException {
        lista_permisos.Actualizar_Permiso(permiso_alumno);
    }

    public void Imprimir_Permiso(Permiso permiso_alumno) throws SQLException {
        if (permiso_alumno.cantidadMesas() > 0) {
            lista_permisos.Imprimir_Permiso(permiso_alumno.id_alumno);
        }
    }

    public void Genera_permisos(Mesa mesa) throws SQLException {
        Permiso permiso_alumno = new Permiso();
        ArrayList<Alumno> lista_alumno = new ArrayList();
        lista_alumno = mesa.listarAlumnos();
        Iterator<Alumno> itrusu = lista_alumno.iterator();
        int contador = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            permiso_alumno = Buscar_Permiso(lista_alumno.get(contador).id);
            if (permiso_alumno == null) {
                Alta_Permiso(lista_alumno.get(contador).id);
            } else {
                Actualizar_Permiso(permiso_alumno);
            }
            contador++;
        }
    }

    public void Cerrar_Permisos(Mesa mesa) throws SQLException {
        Permiso permiso_alumno = new Permiso();
        ArrayList<Alumno> lista_alumno = new ArrayList();
        lista_alumno = mesa.listarAlumnos();
        Iterator<Alumno> itrusu = lista_alumno.iterator();
        int contador = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            permiso_alumno = Buscar_Permiso(lista_alumno.get(contador).id);
            contador++;
            lista_permisos.Cerrar_Permisos(permiso_alumno);
        }
    }
}

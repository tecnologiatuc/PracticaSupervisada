package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Lista_examenes {

    private final ArrayList<Examen> lista_examenes;

    public Lista_examenes() throws SQLException {
        lista_examenes = new ArrayList<>();
    }

    public void cargarlista(int id_mes) throws SQLException {
        lista_examenes.clear();
        ResultSet tabla1;
        Conexion cdb = new Conexion();
        tabla1 = cdb.CargarTablaExamenesMesa(id_mes);
        while (tabla1.next()) {
            Examen examen = new Examen();
            examen.cargar(tabla1.getInt("id_examen"), tabla1.getInt("id_mesa"), tabla1.getInt("id_alumno"), tabla1.getBoolean("asistencia"), tabla1.getInt("nota"), tabla1.getBoolean("cerrado"));
            lista_examenes.add(examen);
        }
    }

    public Examen Buscar_Examen(int id_mes, int id_alu) throws SQLException {
        cargarlista(id_mes);
        Iterator<Examen> itrusu = lista_examenes.iterator();
        Integer contador;
        contador = 0;
        Examen examen = new Examen();
        examen.id_alumno = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            if (lista_examenes.get(contador).id_alumno == id_alu) {
                examen = lista_examenes.get(contador);
            }
            contador++;
        }
        return examen;

    }

    public void Actualizar_Examen(Examen examen_alumno) throws SQLException {
        Conexion cdb = new Conexion();
        cdb.ActualizaExamen(examen_alumno);
    }

    public void Cerrar_Examenes(int id_mes) throws SQLException {
        cargarlista(id_mes);
        Conexion cdb = new Conexion();
        Iterator<Examen> itrusu = lista_examenes.iterator();
        Integer contador;
        contador = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            lista_examenes.get(contador).cerrar();
            cdb.ActualizaExamen(lista_examenes.get(contador));
            contador++;
        }
    }

    public ArrayList<Examen> listar(int id_mes) throws SQLException {
        cargarlista(id_mes);
        return lista_examenes;
    }
}

package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Materia {

    public int id;
    public int curso;
    public String nombre;
    public boolean activo;
    private ArrayList<Docente> lista_docente;

    public Materia() throws SQLException {
        lista_docente = new ArrayList();
    //    cargarlista();
    }

    
    public void CargarDatos(int i, int c, String n, boolean a) throws SQLException {
        id = i;
        curso = c;
        nombre = n;
        activo = a;
        cargarlista();
    }

    private void cargarlista() throws SQLException {
        lista_docente.clear();
        ResultSet tabla;
        Conexion cdb = new Conexion();
        tabla = cdb.CargarTablaMateriasDocentes(id);
        while (tabla.next()) {
            Docente doc = new Docente();
            doc.CargarDatos(tabla.getInt("id"), tabla.getInt("dni"), tabla.getString("apellido"), tabla.getString("nombre"), tabla.getDate("fecha_nac"), tabla.getBoolean("sexo"), tabla.getString("direccion"),
                    tabla.getInt("telefono"), tabla.getInt("celular"), tabla.getString("email"), tabla.getBoolean("activo"));
            lista_docente.add(doc);
        }
    }

    public ArrayList<Docente> lista_materia_docentes() {
        return lista_docente;
    }

    public Docente buscarDocente(int d) {
        Iterator<Docente> itrusu = lista_docente.iterator();
        Integer contador;
        contador = 0;
        //busca en el vector el usuario para acceder al sistema
        Docente doc = new Docente();
        while (itrusu.hasNext()) {
            itrusu.next();
            if (lista_docente.get(contador).id == d) {
                doc = lista_docente.get(contador);
            }
            contador++;
        }
        return doc;
    }

    public void agregarDocente(int id_docente) throws SQLException {
        //AGREGA EL OBJETO DOCENTE A LA LISTA
        Conexion cdb = new Conexion();
        cdb.insertar(id_docente, id);
        cargarlista();
    }
    
    public void borrarDocente(int id_docente) throws SQLException {
        //AGREGA EL OBJETO DOCENTE A LA LISTA
        Conexion cdb = new Conexion();
        cdb.borrar(id_docente, id);
        cargarlista();
    }

}

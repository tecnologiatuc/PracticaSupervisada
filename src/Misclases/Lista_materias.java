package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Lista_materias {

    private final ArrayList<Materia> lista_materias;

    public Lista_materias() throws SQLException {
        this.lista_materias = new ArrayList<>();
        cargarlista("");
    }

    private void cargarlista(String ma) throws SQLException {
        lista_materias.clear();
        ResultSet tabla;
        Conexion cdb = new Conexion();
        tabla = cdb.CargarTablaMaterias(ma);
        while (tabla.next()) {
            Materia mat = new Materia();
            mat.CargarDatos(tabla.getInt("id_materia"), tabla.getInt("curso"), tabla.getString("materia"), tabla.getBoolean("activo"));
            lista_materias.add(mat);
        }
    }

    public Materia buscar(Materia m) throws SQLException {
        Iterator<Materia> itrusu = lista_materias.iterator();
        Integer contador;
        contador = 0;
        Materia auxmat;
        //busca en el vector el usuario para acceder al sistema
        Materia mat = new Materia();
        while (itrusu.hasNext()) {
            itrusu.next();
            auxmat = lista_materias.get(contador);
            if ((auxmat.curso == m.curso) && (auxmat.nombre.trim().equals(m.nombre.trim()))) {
                mat = lista_materias.get(contador);
            }
            contador++;
        }
        return mat;
    }

    public Materia buscar(int curso, String nombre) throws SQLException {
        Iterator<Materia> itrusu = lista_materias.iterator();
        Integer contador;
        contador = 0;
        Materia auxmat;
        //busca en el vector el usuario para acceder al sistema
        Materia mat = new Materia();
        while (itrusu.hasNext()) {
            itrusu.next();
            auxmat = lista_materias.get(contador);
            if ((auxmat.curso == curso) && (auxmat.nombre.trim().equals(nombre.trim()))) {
                mat = lista_materias.get(contador);
            }
            contador++;
        }
        return mat;
    }

    public Materia buscar(int id) throws SQLException {
        Iterator<Materia> itrusu = lista_materias.iterator();
        Integer contador;
        contador = 0;
        Materia auxmat;
        //busca en el vector el usuario para acceder al sistema
        Materia mat = new Materia();
        while (itrusu.hasNext()) {
            itrusu.next();
            auxmat = lista_materias.get(contador);
            if (auxmat.id == id) {
                mat = lista_materias.get(contador);
            }
            contador++;
        }
        return mat;
    }

    public void agregar(Materia m) throws SQLException {
        //AGREGA EL OBJETO DOCENTE A LA LISTA
        m.id = 1 + lista_materias.size();
        lista_materias.add(m);
        //GRABA EL OBJETO DOCENTE
        Conexion cdb = new Conexion();
        cdb.insertar(m);
        cargarlista("");
    }

    public void actualizar(Materia m) throws SQLException {
        Conexion cdb = new Conexion();
        cdb.actualizar(m);
        cargarlista("");
    }

    public ArrayList<Materia> listar(String a) throws SQLException {
        cargarlista(a);
        return lista_materias;
    }

}

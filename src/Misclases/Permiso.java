package Misclases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Permiso {

    public int id_permiso;
    public int nro_permiso;
    public int id_alumno;
    public int anno;
    public boolean activo;
    //  private Lista_mesas lista_mesas_alumno;
    private Lista_mesas lista_mesas;
    private ArrayList<Mesa> lista_mesas_alumno;

    public Permiso() throws SQLException {
        lista_mesas = new Lista_mesas(true);
        lista_mesas_alumno = new ArrayList();
    }

    public ArrayList<Mesa> cargarlistamesas(int id_alu) throws SQLException {
        lista_mesas_alumno = lista_mesas.lista_alumnos_mesa(id_alu);
        return lista_mesas_alumno;
    }

    public ArrayList<Mesa> listarMesa(int id_alu) throws SQLException {
        lista_mesas_alumno = lista_mesas.lista_alumnos_mesa(id_alu);
        return lista_mesas_alumno;
    }

    public void cargar_registro(int id_per, int id_alu, int nro_per, int an, boolean a) throws SQLException {
        id_permiso = id_per;
        id_alumno = id_alu;
        nro_permiso = nro_per;
        anno = an;
        activo = a;
        cargarlistamesas(id_alu);
    }

    public int cantidadMesas() throws SQLException {
        return lista_mesas_alumno.size();
    }

    public void cerrar() {
        activo = false;
    }

    public boolean verificar_mesas_cerradas() {
        boolean mesas_cerradas = true;
        Iterator<Mesa> itrusu = lista_mesas_alumno.iterator();
        int contador = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            if (!lista_mesas_alumno.get(contador).cerrada) {
                mesas_cerradas = false;
            }
            contador++;
        }
        return mesas_cerradas;
    }
}

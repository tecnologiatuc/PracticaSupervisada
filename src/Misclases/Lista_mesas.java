package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Lista_mesas {

    private final ArrayList<Mesa> lista_mesas, resultado_mesas;
    private boolean estado;

    public Lista_mesas(boolean est) throws SQLException {
        estado = est;
        lista_mesas = new ArrayList<>();
        resultado_mesas = new ArrayList<>();
        cargarlista("");
    }

    public void cargarlista(String filtro) throws SQLException {
        lista_mesas.clear();
        Lista_docentes listadocente = new Lista_docentes();
        Docente p, v1, v2;
        ResultSet tabla1, tabla2;
        Conexion cdb = new Conexion();
        tabla1 = cdb.CargarTablaMesasMaterias(filtro);
        while (tabla1.next()) {
            if (tabla1.getBoolean("activo") == estado) {
                Mesa mes = new Mesa();
                mes.cargar(tabla1.getInt("id_mesa"), tabla1.getInt("id_materia"), tabla1.getDate("fecha"), tabla1.getString("horario"), tabla1.getString("condicion"), tabla1.getBoolean("activo"), tabla1.getInt("libro"), tabla1.getInt("folio"));
                tabla2 = cdb.CargarTablaTribunalesDocentes(tabla1.getInt("id_mesa"), 1);
                tabla2.next();
                p = listadocente.buscar(tabla2.getInt("dni"));
                tabla2 = cdb.CargarTablaTribunalesDocentes(tabla1.getInt("id_mesa"), 2);
                tabla2.next();
                v1 = listadocente.buscar(tabla2.getInt("dni"));
                tabla2 = cdb.CargarTablaTribunalesDocentes(tabla1.getInt("id_mesa"), 3);
                tabla2.next();
                v2 = listadocente.buscar(tabla2.getInt("dni"));
                mes.tribunal.actualizar(p, v1, v2);
                mes.tribunal.id = tabla1.getInt("id_mesa");
                lista_mesas.add(mes);
            }
        }
    }

    public void agregar(Mesa me) throws SQLException {
        //AGREGA EL OBJETO DOCENTE A LA LISTA
        me.id = cantidadRegistros() + 1;
        me.cerrada = false;
        me.activo = true;
        me.libro = 0;
        me.folio = 0;
        Conexion cdb = new Conexion();
        cdb.insertar(me);
        cargarlista("");
    }

    public ArrayList<Mesa> listar(String filtro) throws SQLException {
        cargarlista(filtro);
        return lista_mesas;
    }

    public Mesa buscar(int id) throws SQLException {
        Iterator<Mesa> itrusu = lista_mesas.iterator();
        Integer contador;
        contador = 0;
        Mesa auxmesa;
        Mesa mesa_encontrada = null;
        while (itrusu.hasNext()) {
            itrusu.next();
            auxmesa = lista_mesas.get(contador);
            if (auxmesa.id == id) {
                mesa_encontrada = lista_mesas.get(contador);
            }
            contador++;
        }
        return mesa_encontrada;
    }

    public ArrayList<Mesa> lista_alumnos_mesa(int id_alu) throws SQLException {
        resultado_mesas.clear();
        Iterator<Mesa> itrusu = lista_mesas.iterator();
        Integer contador = 0;
        Mesa aux_mesa;
        Alumno aux_alumno;
        while (itrusu.hasNext()) {
            itrusu.next();
            aux_mesa = lista_mesas.get(contador);
            aux_alumno = aux_mesa.buscarAlumno(id_alu);
            if (aux_alumno.id != 0) {
                resultado_mesas.add(aux_mesa);
            }
            contador++;
        }
        return resultado_mesas;
    }

    public ArrayList<Mesa> lista_mesa_entre_fechas(Date f1, Date f2) throws SQLException {
        resultado_mesas.clear();
        Iterator<Mesa> itrusu = lista_mesas.iterator();
        Integer contador = 0;
        Mesa aux_mesa;
        while (itrusu.hasNext()) {
            itrusu.next();
            aux_mesa = lista_mesas.get(contador);
            if ((aux_mesa.fecha.after(f1)) && aux_mesa.fecha.before(f2)) {
                resultado_mesas.add(aux_mesa);
            }
            contador++;
        }
        return resultado_mesas;
    }

    public void actualizar(Mesa me) throws SQLException {
        Conexion cdb = new Conexion();
        cdb.actualizar(me);
        cargarlista("");
    }

    private int cantidadRegistros() throws SQLException {
        Conexion cdb = new Conexion();
        return cdb.CantidadRegistrosTabla("mesas");
    }
}

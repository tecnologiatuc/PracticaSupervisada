package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Mesa {

    public int id;
    public Date fecha;
    public String horario;
    public String condicion;
    public int libro;
    public int folio;
    public Tribunal tribunal;
    public Materia materia;
    public boolean activo;
    public boolean cerrada;
    public final ArrayList<Alumno> lista_alumno;

    public Mesa() {
        tribunal = new Tribunal();
        lista_alumno = new ArrayList();
    }

    public void cargar(int i, Materia m, Date f, String h, String c, Docente p, Docente v1, Docente v2) {
        id = i;
        fecha = f;
        horario = h;
        condicion = c;
        materia = m;
        activo = true;
        tribunal = new Tribunal();
        tribunal.actualizar(p, v1, v2);
    }

    public void cargar(int i, int id_materia, Date f, String h, String c, boolean a,int l,int fo) throws SQLException {
        id = i;
        fecha = f;
        horario = h;
        condicion = c;
        activo = a;
        libro=l;
        folio=fo;
        cargarmateria(id_materia);
        cargarlistaalumnos();
    }

    private void cargarmateria(int id_mat) throws SQLException {
        Lista_materias lm = new Lista_materias();
        materia = lm.buscar(id_mat);
    }

    public Alumno buscarAlumno(int a) throws SQLException {
        cargarlistaalumnos();
        Iterator<Alumno> itrusu = lista_alumno.iterator();
        Integer contador;
        contador = 0;
        Alumno alu = new Alumno();
        alu.id = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            if (lista_alumno.get(contador).id == a) {
                alu = lista_alumno.get(contador);
            }
            contador++;
        }
        return alu;
    }

    private void cargarlistaalumnos() throws SQLException {
        lista_alumno.clear();
        ResultSet tabla;
        Conexion cdb = new Conexion();
        tabla = cdb.CargarTablaAlumnosMesa(id);
        while (tabla.next()) {
            Alumno alu = new Alumno();
            alu.CargarDatos(tabla.getInt("id"), tabla.getInt("dni"), tabla.getString("apellido"), tabla.getString("nombre"), tabla.getDate("fecha_nac"), tabla.getBoolean("sexo"), tabla.getString("direccion"),
                    tabla.getInt("telefono"), tabla.getInt("celular"), tabla.getString("email"), tabla.getBoolean("activo"));
            lista_alumno.add(alu);
        }
    }

    public void agregarAlumno(int id_alumno) throws SQLException {
        Conexion cdb = new Conexion();
        cdb.insertar_Alumno_Mesa(id_alumno, id);
        cargarlistaalumnos();
    }

    public void borrarAlumno(int id_alumno) throws SQLException {
        Conexion cdb = new Conexion();
        cdb.borrar_Alumno_Mesa(id, id_alumno);
        cargarlistaalumnos();
    }

    public ArrayList<Alumno> listarAlumnos() throws SQLException {
        return lista_alumno;
    }

    public void CerrarMesa(int lib, int fol) {
        libro = lib;
        folio = fol;
        activo = false;
        cerrada=true;
   }

}

package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Escuela {

    private int id;
    private String nombre;
    public Usuario usuario;
    public Gestion_docentes gd;
    public Gestion_alumnos ga;
    public Gestion_materias gm;
    public Gestion_mesas gme;
    public Gestion_examenes ge;
    public Gestion_permisos gp;

    public Escuela() throws SQLException {
        usuario = new Usuario("", "");
        gd = new Gestion_docentes();
        ga = new Gestion_alumnos();
        gm = new Gestion_materias();
        gme = new Gestion_mesas();
        ge = new Gestion_examenes();
        gp = new Gestion_permisos();
    }

    public boolean accederSistema(String u, String c) throws SQLException {
//        carga un vector con datos de la tabla Usuarios 
        boolean acceso = false;
        ArrayList<Usuario> Lista_Usuarios = new ArrayList<>();
        ResultSet tabla;
        Conexion cdb = new Conexion();
        tabla = cdb.CargarTablaUsuarios();
        while (tabla.next()) {
            Usuario usutemp = new Usuario(tabla.getString("Usuario"), tabla.getString("clave"));
            Lista_Usuarios.add(usutemp);
        }
        Iterator<Usuario> itrusu = Lista_Usuarios.iterator();
        Integer contador;
        contador = 0;
//busca en el vector el usuario para acceder al sistema
        while (itrusu.hasNext()) {
            itrusu.next();
            if ((Lista_Usuarios.get(contador).ObtenerUsuario().trim().equals(u)) && (Lista_Usuarios.get(contador).ObtenerClave().trim().equals(c))) {
                usuario.CargarUsuario(Lista_Usuarios.get(contador).ObtenerUsuario(), Lista_Usuarios.get(contador).ObtenerClave());
                acceso = true;
            }
            contador++;
        }
        return acceso;
    }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiondb;

import Misclases.Alumno;
import Misclases.Docente;
import Misclases.Examen;
import Misclases.Materia;
import Misclases.Mesa;
import Misclases.Permiso;
import Misclases.Tribunal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marce
 */
public class Conexion {

    public Conexion() throws SQLException {
        String connectionUrl = "jdbc:sqlserver://Local\\local:1433;databaseName=Escuela;user=conexionsql;password=123";
        con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(connectionUrl);
    }

    public Connection getconecion() {
        return con;
    }

    public ResultSet CargarTablaUsuarios() throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from usuarios");
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaDocentes(String a) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from docentes where apellido like ? order by apellido asc");
        sql.setString(1, a + "%");
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaAlumnos(String a) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from alumnos where apellido like ? order by apellido asc");
        sql.setString(1, a + "%");
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaMaterias(String ma) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from materias where materia like ? order by curso asc");
        sql.setString(1, ma + "%");
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaMateriasDocentes(int id_materia) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select d.* from materias m inner join materias_docentes md on m.id_materia=md.id_materia inner join docentes d on md.id_docente=d.id where d.activo=1 and m.activo=1 and m.id_materia=? order by d.apellido asc");
        sql.setInt(1, id_materia);
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaMesasMaterias(String a) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select me.* from mesas me inner join materias ma on me.id_materia=ma.id_materia where ma.materia like ? order by me.fecha desc");
        sql.setString(1, a + "%");
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaAlumnosMesa(int id_mesa) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select alu.* from Examenes alu_mes inner join alumnos alu on alu_mes.id_alumno=alu.id where alu_mes.id_mesa=? order by alu.apellido,alu.nombre desc");
        sql.setInt(1, id_mesa);
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaExamenesMesa(int id_mesa) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from Examenes where Examenes.id_mesa=?");
        sql.setInt(1, id_mesa);
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaMesas() throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from mesas");
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaTribunalesDocentes(int a, int b) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from tribunales tri inner join docentes doc on tri.id_docente=doc.id where tri.id_tribunal=? and tri.tipo=? order by tri.tipo asc");
        sql.setInt(1, a);
        sql.setInt(2, b);
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaPermisos(int a) throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from permisos where id_alumno=?");
        sql.setInt(1, a);
        rs = sql.executeQuery();
        return rs;
    }

    public ResultSet CargarTablaPermisos() throws SQLException {
        rs = null;
        PreparedStatement sql = con.prepareStatement("select * from permisos");
        rs = sql.executeQuery();
        return rs;
    }

    public int CantidadRegistrosTabla(String tabla) throws SQLException {
        rs = null;
        int cantidad_registros;
        PreparedStatement sql = con.prepareStatement("select count(*) as total from " + tabla);
        rs = sql.executeQuery();
        if (rs.next()) {
            cantidad_registros = Integer.parseInt(rs.getString("total"));
        } else {
            cantidad_registros = 0;
        }
        return cantidad_registros;
    }

    public int CantidadPermisosAnuales(int anno) throws SQLException {
        rs = null;
        int cantidad_registros;
        PreparedStatement sql = con.prepareStatement("select count(*) as total from permisos where permisos.anno=?");
        sql.setInt(1, anno);
        rs = sql.executeQuery();
        if (rs.next()) {
            cantidad_registros = Integer.parseInt(rs.getString("total"));
        } else {
            cantidad_registros = 0;
        }
        return cantidad_registros;
    }

    public void insertar(Docente d) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(d.fecha_nacimiento.getTime());
        PreparedStatement sql = con.prepareStatement("insert into Docentes(id,dni,apellido,nombre,fecha_nac,sexo,direccion,telefono,celular,email,activo) values (?,?,?,?,?,?,?,?,?,?,?)");
        sql.setInt(1, d.id);
        sql.setInt(2, d.dni);
        sql.setString(3, d.apellido);
        sql.setString(4, d.nombre);
        sql.setDate(5, sqlDate);
        sql.setBoolean(6, d.sexo);
        sql.setString(7, d.direccion);
        sql.setInt(8, d.telefono);
        sql.setLong(9, d.celular);
        sql.setString(10, d.email);
        sql.setBoolean(11, d.activo);
        sql.executeUpdate();
    }

    public void insertar(Alumno a) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(a.fecha_nacimiento.getTime());
        PreparedStatement sql = con.prepareStatement("insert into alumnos(id,dni,apellido,nombre,fecha_nac,sexo,direccion,telefono,celular,email,activo) values (?,?,?,?,?,?,?,?,?,?,?)");
        sql.setInt(1, a.id);
        sql.setInt(2, a.dni);
        sql.setString(3, a.apellido);
        sql.setString(4, a.nombre);
        sql.setDate(5, sqlDate);
        sql.setBoolean(6, a.sexo);
        sql.setString(7, a.direccion);
        sql.setInt(8, a.telefono);
        sql.setLong(9, a.celular);
        sql.setString(10, a.email);
        sql.setBoolean(11, a.activo);
        sql.executeUpdate();
    }

    public void insertar(Materia m) throws SQLException {
        PreparedStatement sql = con.prepareStatement("insert into materias(id_materia,curso,materia,activo) values (?,?,?,?)");
        sql.setInt(1, m.id);
        sql.setInt(2, m.curso);
        sql.setString(3, m.nombre);
        sql.setBoolean(4, m.activo);
        sql.executeUpdate();
    }

    public void insertar(int id_doc, int id_mat) throws SQLException {
        PreparedStatement sql = con.prepareStatement("insert into materias_docentes(id_docente,id_materia) values (?,?)");
        sql.setInt(1, id_doc);
        sql.setInt(2, id_mat);
        sql.executeUpdate();
    }

    public void insertar_Alumno_Mesa(int id_alu, int id_mes) throws SQLException {
        PreparedStatement sql = con.prepareStatement("insert into Examenes(id_mesa,id_alumno) values (?,?)");
        sql.setInt(1, id_mes);
        sql.setInt(2, id_alu);
        sql.executeUpdate();
    }

    public void insertar(Mesa m) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(m.fecha.getTime());
        PreparedStatement sql = con.prepareStatement("insert into mesas(id_mesa,id_materia,fecha,horario,condicion,cerrada,activo) values (?,?,?,?,?,?,?)");
        sql.setInt(1, m.id);
        sql.setInt(2, m.materia.id);
        sql.setDate(3, sqlDate);
        sql.setString(4, m.horario);
        sql.setString(5, m.condicion);
        sql.setBoolean(6, m.cerrada);
        sql.setBoolean(7, m.activo);
        sql.executeUpdate();

        sql = con.prepareStatement("insert into tribunales(id_tribunal,id_docente,tipo) values (?,?,?)");
        sql.setInt(1, m.id);
        sql.setInt(2, m.tribunal.presidente.id);
        sql.setInt(3, 1);
        sql.executeUpdate();

        sql = con.prepareStatement("insert into tribunales(id_tribunal,id_docente,tipo) values (?,?,?)");
        sql.setInt(1, m.id);
        sql.setInt(2, m.tribunal.vocal1.id);
        sql.setInt(3, 2);
        sql.executeUpdate();

        sql = con.prepareStatement("insert into tribunales(id_tribunal,id_docente,tipo) values (?,?,?)");
        sql.setInt(1, m.id);
        sql.setInt(2, m.tribunal.vocal2.id);
        sql.setInt(3, 3);
        sql.executeUpdate();

    }

    public void insertar_permiso(Permiso permiso) throws SQLException {
        PreparedStatement sql = con.prepareStatement("insert into permisos(id_permiso,id_alumno,nro_permiso,anno,activo) values (?,?,?,?,?)");
        sql.setInt(1, permiso.id_permiso);
        sql.setInt(2, permiso.id_alumno);
        sql.setInt(3, permiso.nro_permiso);
        sql.setInt(4, permiso.anno);
        sql.setBoolean(5, permiso.activo);
        sql.executeUpdate();
        ArrayList<Mesa> lista_mesas = permiso.listarMesa(permiso.id_alumno);
        Iterator<Mesa> itrusu = lista_mesas.iterator();
        int contador = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            sql = con.prepareStatement("insert into permisos_mesas(id_permiso,id_mesa) values(?,?)");
            sql.setInt(1, permiso.id_permiso);
            sql.setInt(2, lista_mesas.get(contador).id);
            sql.executeUpdate();
            contador++;
        }

    }

    public void actualizar(Docente d) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(d.fecha_nacimiento.getTime());
        PreparedStatement sql = con.prepareStatement("update Docentes set id=?,dni=?,apellido=?,nombre=?,fecha_nac=?,sexo=?,direccion=?,telefono=?,celular=?,email=?,activo=? where dni=?");
        sql.setInt(1, d.id);
        sql.setInt(2, d.dni);
        sql.setString(3, d.apellido);
        sql.setString(4, d.nombre);
        sql.setDate(5, sqlDate);
        sql.setBoolean(6, d.sexo);
        sql.setString(7, d.direccion);
        sql.setInt(8, d.telefono);
        sql.setLong(9, d.celular);
        sql.setString(10, d.email);
        sql.setBoolean(11, d.activo);
        sql.setInt(12, d.dni);
        sql.executeUpdate();
    }

    public void actualizar(Alumno a) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(a.fecha_nacimiento.getTime());
        PreparedStatement sql = con.prepareStatement("update Alumnos set id=?,dni=?,apellido=?,nombre=?,fecha_nac=?,sexo=?,direccion=?,telefono=?,celular=?,email=?,activo=? where dni=?");
        sql.setInt(1, a.id);
        sql.setInt(2, a.dni);
        sql.setString(3, a.apellido);
        sql.setString(4, a.nombre);
        sql.setDate(5, sqlDate);
        sql.setBoolean(6, a.sexo);
        sql.setString(7, a.direccion);
        sql.setInt(8, a.telefono);
        sql.setLong(9, a.celular);
        sql.setString(10, a.email);
        sql.setBoolean(11, a.activo);
        sql.setInt(12, a.dni);
        sql.executeUpdate();
    }

    public void actualizar(Materia m) throws SQLException {
        PreparedStatement sql = con.prepareStatement("update materias set id_materia=?,curso=?,materia=?,activo=? where id_materia=?");
        sql.setInt(1, m.id);
        sql.setInt(2, m.curso);
        sql.setString(3, m.nombre);
        sql.setBoolean(4, m.activo);
        sql.setInt(5, m.id);
        sql.executeUpdate();
    }

    public void actualizar(Mesa me) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(me.fecha.getTime());
        PreparedStatement sql = con.prepareStatement("update mesas set id_mesa=?,id_materia=?,fecha=?,horario=?,condicion=?,libro=?,folio=?,cerrada=?,activo=? where id_mesa=?");
        sql.setInt(1, me.id);
        sql.setInt(2, me.materia.id);
        sql.setDate(3, sqlDate);
        sql.setString(4, me.horario);
        sql.setString(5, me.condicion);
        sql.setInt(6, me.libro);
        sql.setInt(7, me.folio);
        sql.setBoolean(8, me.cerrada);
        sql.setBoolean(9, me.activo);
        sql.setInt(10, me.id);
        sql.executeUpdate();

        sql = con.prepareStatement("Delete from tribunales where id_tribunal=?");
        sql.setInt(1, me.id);
        sql.executeUpdate();

        sql = con.prepareStatement("insert into tribunales(id_tribunal,id_docente,tipo) values (?,?,?)");
        sql.setInt(1, me.id);
        sql.setInt(2, me.tribunal.presidente.id);
        sql.setInt(3, 1);
        sql.executeUpdate();

        sql = con.prepareStatement("insert into tribunales(id_tribunal,id_docente,tipo) values (?,?,?)");
        sql.setInt(1, me.id);
        sql.setInt(2, me.tribunal.vocal1.id);
        sql.setInt(3, 2);
        sql.executeUpdate();

        sql = con.prepareStatement("insert into tribunales(id_tribunal,id_docente,tipo) values (?,?,?)");
        sql.setInt(1, me.id);
        sql.setInt(2, me.tribunal.vocal2.id);
        sql.setInt(3, 3);
        sql.executeUpdate();

    }

    public void actualiza_permiso(Permiso permiso) throws SQLException {
        PreparedStatement sql;
        ArrayList<Mesa> lista_mesas = permiso.listarMesa(permiso.id_alumno);
        Iterator<Mesa> itrusu = lista_mesas.iterator();
        int contador = 0;
        while (itrusu.hasNext()) {
            itrusu.next();
            sql = con.prepareStatement("insert into permisos_mesas(id_permiso,id_mesa) values(?,?)");
            sql.setInt(1, permiso.id_permiso);
            sql.setInt(2, lista_mesas.get(contador).id);
            sql.executeUpdate();
            contador++;
        }
    }

    public void cerrar_permiso(Permiso permiso) throws SQLException {
        PreparedStatement sql;
        sql = con.prepareStatement("update permisos set activo=? where id_permiso=?");
        sql.setBoolean(1, permiso.activo);
        sql.setInt(2, permiso.id_permiso);
        sql.executeUpdate();
    }

    public void ActualizaExamen(Examen e) throws SQLException {
        PreparedStatement sql = con.prepareStatement("update examenes set nota=?,asistencia=?,cerrado=? where id_examen=?");
        sql.setInt(1, e.nota);
        sql.setBoolean(2, e.asistencia);
        sql.setBoolean(3, e.cerrado);
        sql.setInt(4, e.id_examen);
        sql.executeUpdate();
    }

    public void borrar(int id_doc, int id_mat) throws SQLException {
        PreparedStatement sql = con.prepareStatement("delete from materias_Docentes where id_docente=? and id_materia=?");
        sql.setInt(1, id_doc);
        sql.setInt(2, id_mat);
        sql.executeUpdate();
    }

    public void borrar_Alumno_Mesa(int id_mes, int id_alu) throws SQLException {
        PreparedStatement sql = con.prepareStatement("delete from Examenes where id_mesa=? and id_alumno=?");
        sql.setInt(1, id_mes);
        sql.setInt(2, id_alu);
        sql.executeUpdate();
    }

    public void borrar_Mesas_Permiso(int id_per) throws SQLException {
        PreparedStatement sql = con.prepareStatement("delete from Permisos_Mesas where id_permiso=?");
        sql.setInt(1, id_per);
        sql.executeUpdate();
    }

    public Connection con;
    private ResultSet rs;

}

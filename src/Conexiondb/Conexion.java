/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiondb;

import Misclases.Alumno;
import Misclases.Docente;
import Misclases.Materia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
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
         sql.setString(1, ma+ "%");
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
        sql.setInt(9, d.celular);
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
        sql.setInt(9, a.celular);
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
        sql.setInt(9, d.celular);
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
        sql.setInt(9, a.celular);
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

    public void borrar(int id_doc, int id_mat) throws SQLException {
        PreparedStatement sql = con.prepareStatement("delete from materias_Docentes where id_docente=? and id_materia=?");
        sql.setInt(1,id_doc);
        sql.setInt(2, id_mat);
        sql.executeUpdate();
    }
    
    private Connection con;
    private ResultSet rs;

}

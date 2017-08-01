package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Lista_alumnos {
    private final ArrayList<Alumno> lista_alumnos=new ArrayList<>();
    
    public Lista_alumnos() throws SQLException{
        cargarlista("");
    }
    
    private void cargarlista(String a) throws SQLException{
        lista_alumnos.clear();
        ResultSet tabla;
        Conexion cdb= new Conexion();  
        tabla=cdb.CargarTablaAlumnos(a);
        while (tabla.next()) {  
            Alumno alu= new Alumno();
            alu.CargarDatos(tabla.getInt("id"),tabla.getInt("dni"),tabla.getString("apellido"),tabla.getString("nombre"),tabla.getDate("fecha_nac"),tabla.getBoolean("sexo"),tabla.getString("direccion"),
                    tabla.getInt("telefono"),tabla.getInt("celular"),tabla.getString("email"),tabla.getBoolean("activo"));
            lista_alumnos.add(alu);
        } 
    }
     
    public Alumno buscar(int a){
        Iterator<Alumno> itrusu = lista_alumnos.iterator();
        Integer contador;
        contador = 0;
        //busca en el vector el usuario para acceder al sistema
        Alumno alu= new Alumno();
        while(itrusu.hasNext()){
            itrusu.next();
            if(lista_alumnos.get(contador).ObtenerDni()==a)
            {
                alu=lista_alumnos.get(contador);
            }
            contador++;
        }
        return alu;
    }

    public void agregar(Alumno a) throws SQLException {
        //AGREGA EL OBJETO DOCENTE A LA LISTA
        a.id=lista_alumnos.size();
        lista_alumnos.add(a);
        //GRABA EL OBJETO DOCENTE
        Conexion cdb= new Conexion();  
        cdb.insertar(a);
        cargarlista("");
    }

    public void actualizar(Alumno a) throws SQLException {
    /*    //ACTUALIZAR EL OBJETO DOCENTE A LA LISTA
        Iterator<Alumno> itrusu = lista_alumnos.iterator();
        Integer contador;
        contador = 0;
        //busca en el vector el usuario para acceder al sistema
        Alumno alu= new Alumno();
        while(itrusu.hasNext()){
            itrusu.next();
            if(a.dni==lista_alumnos.get(contador).ObtenerDni())
            {
                        lista_alumnos.set(contador, a);
            }
            contador++;
       }   
        //GRABA EL OBJETO DOCENTE*/
        Conexion cdb= new Conexion();  
        cdb.actualizar(a);
        cargarlista("");
    }

    
    public ArrayList<Alumno> listar(String a) throws SQLException{
        cargarlista(a);
        return lista_alumnos;
    }
  
}

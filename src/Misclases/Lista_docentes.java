package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Lista_docentes {
    private final ArrayList<Docente> lista_docentes=new ArrayList<>();
    
    public Lista_docentes() throws SQLException{
        cargarlista("");
    }
    
    private void cargarlista(String a) throws SQLException{
        lista_docentes.clear();
        ResultSet tabla;
        Conexion cdb= new Conexion();  
        tabla=cdb.CargarTablaDocentes(a);
        while (tabla.next()) {  
            Docente doc= new Docente();
            doc.CargarDatos(tabla.getInt("id"),tabla.getInt("dni"),tabla.getString("apellido"),tabla.getString("nombre"),tabla.getDate("fecha_nac"),tabla.getBoolean("sexo"),tabla.getString("direccion"),
                    tabla.getInt("telefono"),tabla.getLong("celular"),tabla.getString("email"),tabla.getBoolean("activo"));
            lista_docentes.add(doc);
        } 
    }
     
    public Docente buscar(int d){
        Iterator<Docente> itrusu = lista_docentes.iterator();
        Integer contador;
        contador = 0;
        //busca en el vector el usuario para acceder al sistema
        Docente doc= new Docente();
        while(itrusu.hasNext()){
            itrusu.next();
            if(lista_docentes.get(contador).ObtenerDni()==d)
            {
                doc=lista_docentes.get(contador);
            }
            contador++;
        }
        return doc;
    }

    public void agregar(Docente d) throws SQLException {
        //AGREGA EL OBJETO DOCENTE A LA LISTA
        d.id=lista_docentes.size()+1;
        lista_docentes.add(d);
        //GRABA EL OBJETO DOCENTE
        Conexion cdb= new Conexion();  
        cdb.insertar(d);
        cargarlista("");
    }

    public void actualizar(Docente d) throws SQLException {
        //ACTUALIZAR EL OBJETO DOCENTE A LA LISTA
        Iterator<Docente> itrusu = lista_docentes.iterator();
        Integer contador;
        contador = 0;
        //busca en el vector el usuario para acceder al sistema
        Docente doc= new Docente();
        while(itrusu.hasNext()){
            itrusu.next();
            if(d.dni==lista_docentes.get(contador).ObtenerDni())
            {
                        lista_docentes.set(contador, d);
            }
            contador++;
       }   
        //GRABA EL OBJETO DOCENTE
        Conexion cdb= new Conexion();  
        cdb.actualizar(d);
        cargarlista("");
    }
    
    public ArrayList<Docente> listar(String a) throws SQLException {
        cargarlista(a);
        return lista_docentes;
    }
   
 }

package Misclases;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gestion_alumnos {

    private final Lista_alumnos la;
    
    public Gestion_alumnos() throws SQLException{
        la=new Lista_alumnos();
    }
    
    public void altaAlumno(Alumno alu) throws SQLException {
       Alumno aluaux;
       aluaux=buscarAlumno(alu);
        if (aluaux.apellido==null)
        {
            if (alu.dni!=0)
            {
                if ((!"".equals(alu.apellido))&&(!"".equals(alu.nombre)))
                {
                    if (alu.fecha_nacimiento!=null)
                    {
                        la.agregar(alu);
                        JOptionPane.showMessageDialog(null, "El alumno fue registrado con exito");

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Ingrese la fecha de nacimiento del Alumno");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Ingrese el apellido y nombre del Alumno");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Ingrese DNI del Alumno");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El Alumno "+aluaux.apellido.trim()+" ya fue dado de alta");
        }
    }

 
    public Alumno buscarAlumno(Alumno alu) {
        int dn=alu.dni;
        Alumno alumnoencontrado=la.buscar(dn);
        return alumnoencontrado;
    }   
  
    public void actualizaAlumno(Alumno alu) throws SQLException {
        Alumno aluaux;
        aluaux=buscarAlumno(alu);
        alu.id=aluaux.id;
        if ((!"".equals(alu.apellido))&&(!"".equals(alu.nombre))){
            if (alu.fecha_nacimiento!=null){
                la.actualizar(alu);
                JOptionPane.showMessageDialog(null, "El alumno fue actualizado con exito");}
            else{
                    JOptionPane.showMessageDialog(null,"Ingrese la fecha de nacimiento del Alumno");}}
        else{
            JOptionPane.showMessageDialog(null,"Ingrese el apellido y nombre del Alumno");}
    }

    
    public ArrayList<Alumno> listarAlumno(String a) throws SQLException {
        return la.listar(a);
    }
    
    
    public void borrarAlumno(Alumno alu) throws SQLException {
        Alumno aluaux;
        aluaux=buscarAlumno(alu);
        alu.id=aluaux.id;
        if ((!"".equals(alu.apellido))&&(!"".equals(alu.nombre))){
            if (alu.fecha_nacimiento!=null){
                    alu.activo=false;
                    la.actualizar(alu);
                    JOptionPane.showMessageDialog(null, "El alumno fue borrado con exito");}
                    else{
                        JOptionPane.showMessageDialog(null,"Ingrese la fecha de nacimiento del alumno");}}
                else{
                    JOptionPane.showMessageDialog(null,"Ingrese el apellido y nombre del alumno");}
    }
}

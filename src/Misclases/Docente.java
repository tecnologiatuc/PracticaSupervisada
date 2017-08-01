package Misclases;

import java.util.Date;

public class Docente extends Persona {

    public Docente (){
    }
    
    public void CargarDatos(int i,int d, String ape, String nom, Date fecha_nac, boolean s, String dir, int tel, int cel, String mail,boolean act)
    {
        id=i;
        dni=d;
        apellido=ape;
        nombre=nom;
        fecha_nacimiento=fecha_nac;
        sexo=s;
        direccion=dir;
        telefono=tel;
        celular=cel;
        email=mail;
        activo=act;
     }
   
    public int ObtenerDni(){
        return dni;
    }
    
}

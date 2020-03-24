package Misclases;

import java.sql.SQLException;

public class Examen {

    public int id_examen;
    public int id_mesa;
    public int id_alumno;
    public boolean asistencia;
    public int nota;
    public boolean cerrado;

    public Examen() {
    }

    public void cargar(int id_exa, int id_mes, int id_alu, boolean asi, int not, boolean cer) throws SQLException {
        id_examen = id_exa;
        id_mesa = id_mes;
        id_alumno = id_alu;
        asistencia = asi;
        nota = not;
        cerrado = cer;
    }

    public void cerrar() {
        cerrado = true;
    }
}

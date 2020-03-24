package Misclases;

import java.sql.SQLException;
import java.util.ArrayList;

public class Gestion_examenes {

    private final Lista_examenes lista_examenes;

    public Gestion_examenes() throws SQLException {
        lista_examenes = new Lista_examenes();
    }

    public Examen Buscar_Examen(int id_mes, int id_alu) throws SQLException {
        Examen examen_encontrado = lista_examenes.Buscar_Examen(id_mes, id_alu);
        return examen_encontrado;
    }

    public void Actualizar_Examen(Examen examen_alumno) throws SQLException {
        lista_examenes.Actualizar_Examen(examen_alumno);
    }

    public ArrayList<Examen> Listar_Examenes(int id_mes) throws SQLException {
        return lista_examenes.listar(id_mes);
    }

    public void Cerrar_Examenes(int id_mes) throws SQLException {
        lista_examenes.Cerrar_Examenes(id_mes);
    }

}

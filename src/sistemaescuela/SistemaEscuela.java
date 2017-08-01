package sistemaescuela;

import Interfaces.Principal;
import javax.swing.JFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SistemaEscuela {

    public static void main(String[] args){

        try {
            Principal ventana = new Principal();
            ventana.setTitle("Sistema de Gestión Educativa - Escuela Secundaria Crucero Belgrano");
            ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(SistemaEscuela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

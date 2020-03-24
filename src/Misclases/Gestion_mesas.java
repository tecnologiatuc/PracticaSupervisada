package Misclases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Gestion_mesas {
    
    private final Lista_mesas lista_mesas_activas, lista_mesas_cerradas;
    
    public Gestion_mesas() throws SQLException {
        lista_mesas_activas = new Lista_mesas(true);
        lista_mesas_cerradas = new Lista_mesas(false);
    }

// genera una mesa nueva si no esta generada.     
    public void altaMesa(Mesa me) throws SQLException {
        if (me.materia.id != 0) {
            if (!"[seleccione condicion]".equals(me.condicion)) {
                if (me.fecha != null) {
                    if (me.tribunal.validar()) {
                        lista_mesas_activas.agregar(me);
                        JOptionPane.showMessageDialog(null, "Se grabo la mesa con éxito");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione el tribunal sin repetir los docentes");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese la fecha de la mesa");
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la condición de la mesa");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese la materia de la mesa");
        }
    }
    
    public ArrayList<Mesa> listarMesa(String a) throws SQLException {
        return lista_mesas_activas.listar(a);
    }
    
    public ArrayList<Mesa> listarMesaCerrada(Date f1, Date f2) throws SQLException {
        return lista_mesas_cerradas.lista_mesa_entre_fechas(f1, f2);
    }
    
    public Mesa buscarMesa(int id) throws SQLException {
        Mesa mesaencontrada = lista_mesas_activas.buscar(id);
        return mesaencontrada;
    }
    
    public void actualizaMesa(Mesa me) throws SQLException {
        Mesa mesa_encontrada = lista_mesas_activas.buscar(me.id);
        if (mesa_encontrada != null) {
            if (me.materia.id != 0) {
                if (!"[seleccione condicion]".equals(me.condicion)) {
                    if (me.fecha != null) {
                        if (me.tribunal.validar()) {
                            lista_mesas_activas.actualizar(me);
                            JOptionPane.showMessageDialog(null, "Se actualizo la mesa con éxito");
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Selecione el tribunal sin repetir los docentes");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese la fecha de la mesa");
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese la condición de la mesa");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la materia de la mesa");
            }
        }
    }
    
    public void borrarMesa(Mesa me) throws SQLException {
        if (me.id != 0) {
            if (me.cerrada = false) {
                me.activo = false;
                lista_mesas_activas.actualizar(me);
                JOptionPane.showMessageDialog(null, "La mesa fue borrada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La mesa no puede ser borrada por que fue cerrada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una mesa de la tabla para borrar");
        }
    }
    
    public ArrayList<Mesa> BuscarMesas(int a) throws SQLException {
        return lista_mesas_activas.lista_alumnos_mesa(a);
    }
    
    public ArrayList<Mesa> buscarMesaCerrada(int id) throws SQLException {
        return lista_mesas_cerradas.lista_alumnos_mesa(id);
        
    }
    
    public void actualizarlistas() throws SQLException {
        lista_mesas_cerradas.cargarlista("");
        lista_mesas_activas.cargarlista("");
    }
}

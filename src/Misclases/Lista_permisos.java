package Misclases;

import Conexiondb.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Lista_permisos {

    private final ArrayList<Permiso> lista_permisos;

    public Lista_permisos() throws SQLException {
        lista_permisos = new ArrayList<>();
    }

    public void Agregar_Permiso(int id_alu) throws SQLException {
        Permiso permiso = new Permiso();
        permiso.id_permiso = cantidadRegistros() + 1;
        permiso.id_alumno = id_alu;
        Calendar cal = Calendar.getInstance();
        permiso.anno = cal.get(Calendar.YEAR);
        permiso.nro_permiso = CantidadPermisosAnuales(permiso.anno) + 1;
        permiso.activo = true;
        permiso.cargarlistamesas(id_alu);
        if (permiso.cantidadMesas() > 0) {
            Conexion cdb = new Conexion();
            cdb.insertar_permiso(permiso);
        }
    }

    public Permiso buscar_permiso(int id_alu) throws SQLException {
        Iterator<Permiso> itrusu = lista_permisos.iterator();
        int contador;
        contador = 0;
        Permiso auxpermiso = null;
        Permiso permiso_encontrado = null;
        while (itrusu.hasNext()) {
            itrusu.next();
            auxpermiso = lista_permisos.get(contador);
            if ((auxpermiso.id_alumno == id_alu) && (auxpermiso.activo)) {
                permiso_encontrado = lista_permisos.get(contador);
            }
            contador++;
        }
        return permiso_encontrado;
    }

    public void cargarlista(int filtro) throws SQLException {
        lista_permisos.clear();
        ResultSet tabla1;
        Conexion cdb = new Conexion();
        tabla1 = cdb.CargarTablaPermisos(filtro);
        while (tabla1.next()) {
            if (tabla1.getBoolean("activo")) {
                Permiso permiso = new Permiso();
                permiso.cargar_registro(tabla1.getInt("id_permiso"), tabla1.getInt("id_alumno"), tabla1.getInt("nro_permiso"), tabla1.getInt("anno"), tabla1.getBoolean("activo"));
                lista_permisos.add(permiso);
            }
        }
    }

    private int cantidadRegistros() throws SQLException {
        Conexion cdb = new Conexion();
        return cdb.CantidadRegistrosTabla("permisos");
    }

    private int CantidadPermisosAnuales(int anno) throws SQLException {
        Conexion cdb = new Conexion();
        return cdb.CantidadPermisosAnuales(anno);
    }

    public void Actualizar_Permiso(Permiso permiso_alumno) throws SQLException {
        Conexion cdb = new Conexion();
        cdb.borrar_Mesas_Permiso(permiso_alumno.id_permiso);
        cdb.actualiza_permiso(permiso_alumno);
    }

    public void Cerrar_Permisos(Permiso permiso_alumno) throws SQLException {
        if (permiso_alumno.verificar_mesas_cerradas()) {
            permiso_alumno.cerrar();
            Conexion cdb = new Conexion();
            cdb.cerrar_permiso(permiso_alumno);
        }
    }

    public void Imprimir_Permiso(int id_alu) {
        try {
            Conexion cx = new Conexion();
            String rutainforme = "C:\\ProyectoPS\\SistemaEscuela\\src\\Reportes\\report2.jasper";
            Map parametros = new HashMap();
            parametros.put("idalu", id_alu);
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObjectFromFile(rutainforme);
            } catch (JRException ex) {
                Logger.getLogger(Lista_permisos.class.getName()).log(Level.SEVERE, null, ex);
            }
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cx.getconecion());
            JasperViewer preimpresion = new JasperViewer(jp, false);
            preimpresion.setTitle("PREIMPRESION ACTA VOLANTE");
            preimpresion.setVisible(true);
        } catch (SQLException | JRException ex) {
            Logger.getLogger(Lista_permisos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

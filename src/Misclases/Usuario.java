package Misclases;

public class Usuario extends Persona {

    private String usu;

    private String clave;

    public Usuario(String u, String c) {
        usu = u;
        clave = c;
    }

    public void CargarUsuario(String u, String c) {
        usu = u;
        clave = c;
    }

    public String ObtenerUsuario() {
        return usu;
    }

    public String ObtenerClave() {
        return clave;
    }

}

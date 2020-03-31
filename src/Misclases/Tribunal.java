package Misclases;

public class Tribunal {

    public int id;
    public Docente presidente;
    public Docente vocal1;
    public Docente vocal2;

    public void Tribunal() {
        presidente = new Docente();
        vocal1 = new Docente();
        vocal2 = new Docente();
    }

    public void actualizar(Docente pre, Docente voc1, Docente voc2) {
        presidente = pre;
        vocal1 = voc1;
        vocal2 = voc2;
    }

    public boolean validar() {
        boolean validar = false;
        if ((presidente != null) && (vocal1 != null) && (vocal2 != null)) {
            if ((presidente.id != vocal1.id) && (presidente.id != vocal2.id) && (vocal1.id != vocal2.id)) {
                validar = true;
            }
        }
        return validar;
    }

}

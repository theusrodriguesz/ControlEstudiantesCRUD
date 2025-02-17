package Gestion;

public class Gestion {
    private Alta alta;
    private Baja baja;
    private Listado listado;
    private Modificacion modificacion;

    public Gestion() {
        alta = new Alta();
        baja = new Baja();
        listado = new Listado();
        modificacion = new Modificacion();
    }

    public Alta getAlta() {
        return alta;
    }

    public Baja getBaja() {
        return baja;
    }

    public Listado getListado() {
        return listado;
    }

    public Modificacion getModificacion() {
        return modificacion;
    }
}

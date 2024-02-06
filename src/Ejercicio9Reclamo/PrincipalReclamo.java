package Ejercicio9Reclamo;

public class PrincipalReclamo {
    public static void main(String[] args) {
        Reclamo reclamo = new Reclamo();

        reclamo.ingresarNombre();
        reclamo.ingreseAsunto();
        reclamo.ingresarDescripcion();
        reclamo.validarEstadoReclamo();
        reclamo.mensajeRecepcionReclamo();
    }
}

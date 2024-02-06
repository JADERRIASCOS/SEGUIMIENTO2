package Ejercicio9Reclamo;

import javax.swing.*;

public class Reclamo {
    public int numeroReclamo = 10093213;
    public String nombrePresona;
    public String asunto;
    public String descripcion;
    public String estadoReclamo = "en proceso...";
    public void ingresarNombre(){
        nombrePresona = JOptionPane.showInputDialog("Ingrese su nombre:");
    }
    public void ingreseAsunto(){
        asunto = JOptionPane.showInputDialog("Asunto del reclamo:");
    }
    public void ingresarDescripcion(){
        descripcion = JOptionPane.showInputDialog("A continuación, redacte la descripción del reclamo/problema: ");
    }
    public void validarEstadoReclamo(){
        System.out.println("El reclamo se encuentra " +estadoReclamo);
    }
    public void mensajeRecepcionReclamo(){
        System.out.println("Su reclamo fue recibido con éxito. Pronto le daremos respues.");
        System.out.println("Número del reclamo: " +numeroReclamo);
        System.out.println("Asunto: " +asunto);
        System.out.println("Descripción: " +descripcion);
    }

}

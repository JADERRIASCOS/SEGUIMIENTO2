package Ejercicio3PrestamoLibro;

import javax.swing.*;

public class PrestamoLibro {
    public int codPrestamo = 10023231;
    public String fechaPrestamo = "02/12/99";
    public String nombreLibro = "El Principito";
    public int codigoUsuario;
    public int diasDePrestamo = 7;
    public String estadoPrestamo = "Prestamo Activo";
    public void ingresarCodigoUsuario(){
        codigoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su código de usuario"));
    }
    public void mostrarDatos(){
        System.out.println("Código del Prestamo: " + codPrestamo);
        System.out.println("Fecha del Prestamo: " + fechaPrestamo);
        System.out.println("Nombre del Libro: " + nombreLibro);
        System.out.println("Código de Usuario: " + codigoUsuario);
        System.out.println("Días de Prestamo: " + diasDePrestamo);
        System.out.println("Estado del Prestamo: " + estadoPrestamo);
    }
}

package Ejercicio12Lavadoras;

import javax.swing.JOptionPane;
public class PrincipalLavadoras {
    public static void main(String[] args) {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de lavadora (1 para grande, 2 para pequeña):"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de alquiler:"));

        Lavadoras lavadora = new Lavadoras(tipo, horas);
        double costo = lavadora.calcularCosto();

        JOptionPane.showMessageDialog(null, "El costo del alquiler es: $" + costo);
    }
}

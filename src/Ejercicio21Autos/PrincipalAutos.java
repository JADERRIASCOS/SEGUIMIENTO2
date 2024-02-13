package Ejercicio21Autos;

import javax.swing.JOptionPane;

public class PrincipalAutos {
    public static void main(String[] args) {
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de modelo de su automóvil:"));

        Autos autos = new Autos();
        boolean estaDefectuoso = autos.verificarDefecto(modelo);

        if (!estaDefectuoso) {
            JOptionPane.showMessageDialog(null, "Su automóvil no está defectuoso.");
        } else {
            JOptionPane.showMessageDialog(null, "El automóvil está defectuoso, llévelo a garantía.");
        }
    }
}

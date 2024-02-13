package Ejercicio18Triangulos;
import javax.swing.JOptionPane;


public class PrincipalAngulos {
    public static void main(String[] args) {
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first angle:"));
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second angle:"));
        int a3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third angle:"));

        Angulos triangulos = new Angulos(a1, a2, a3);
        triangulos.resultado();
    }
}
